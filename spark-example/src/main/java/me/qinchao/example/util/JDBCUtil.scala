package me.qinchao.example.util

import java.sql.{Connection, ResultSet}
import java.util.Properties

import com.alibaba.druid.pool.DruidDataSourceFactory
import javax.sql.DataSource

/**
 * Created by sulvto on 23/03/2021.
 *
 * @author sulvto
 */
object JDBCUtil {

  var dataSource: DataSource = init()

  def init(): DataSource = {
    h2Source
  }

  def mysqlSource: DataSource = {
    val properties = new Properties()
    properties.setProperty("driverClassName", "com.mysql.dbc.Driver")
    properties.setProperty("url", "jdbc:mysql://localhost:3306/spark-streaming？useUnicode=true&characterEncoding=UTF-8")
    properties.setProperty("username", "root")
    properties.setProperty("password", "A111111")
    properties.setProperty("maxActive", "50")

    DruidDataSourceFactory.createDataSource(properties)
  }

  def h2Source: DataSource = {
    val properties = new Properties()
    properties.setProperty("driverClassName", "com.mysql.dbc.Driver")
    properties.setProperty("url", "jdbc:h2:file:/home/sulvto/development/workspace/Practice/spark-example/datas/h2_db;AUTO_SERVER=TRUE")
    properties.setProperty("maxActive", "50")

    DruidDataSourceFactory.createDataSource(properties)
  }

  def getConnection: Connection = {
    dataSource.getConnection
  }

  def executeQuery(connection: Connection, sql: String, params: Array[Any]) = {
    var result:ResultSet = null
    try {
      var statement = connection.prepareStatement(sql)
      if (params != null && params.length > 0) {
        for ( i <- params.indices) {
          statement.setObject(i + 1, params(i))
        }
      }
      result = statement.executeQuery()
      statement.close()
    } catch {
      case e: Exception => e.printStackTrace()
    }
    result
  }

  def executeUpdate(connection: Connection, sql: String, params: Array[Any]) = {
    var result:Int = 0
    try {
      var statement = connection.prepareStatement(sql)
      if (params != null && params.length > 0) {
        for ( i <- params.indices) {
          statement.setObject(i + 1, params(i))
        }
      }
      result = statement.executeUpdate()
      connection.commit()
      statement.close()
    } catch {
      case e: Exception => e.printStackTrace()
    }
    result
  }

  def queryIsExist(connection: Connection, sql: String, params: Array[Any]) = {
    executeQuery(connection, sql, params).next()
  }
}
