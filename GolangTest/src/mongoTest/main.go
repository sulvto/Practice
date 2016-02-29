// mongoTest project main.go
package main

import (
	"fmt"
	"gopkg.in/mgo.v2"
	"gopkg.in/mgo.v2/bson"
)

type User struct {
	Name string
	Age  int
}

func main() {
	session, err := mgo.Dial("127.0.0.1:27017") //连接数据库
	if err != nil {
		panic(err)
	}
	defer session.Close()

	//session.SetMode(mgo.Monotonic, true)

	db := session.DB("qinchao") //数据库名称
	collection := db.C("test")  //如果该集合已经存在的话，则直接返回
	var users []User
	//	collection.Insert(&User{"zhangsan", 10})
	collection.Remove(bson.M{"name": "zhangsan"}) //一次删除一个
	err = collection.Find(nil).All(&users)

	fmt.Println(users)

}
