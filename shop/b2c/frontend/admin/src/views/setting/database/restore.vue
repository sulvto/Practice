<template>
    <div>
        <el-table border :data="tableData" style="width: 100%">
           <el-table-column
      prop="filename"
      label="文件名称">
    </el-table-column>

     <el-table-column
      prop="fileSize"
      label="文件大小"
      width="120">
    </el-table-column>

     <el-table-column
      prop="backupTime"
      label="备份时间"
      width="140">
    </el-table-column>

            <el-table-column label="操作"
                width="180">
                <template slot-scope="scope">
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">恢复</el-button>
                    <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">删除</el-button>
                </template>
            </el-table-column>
        </el-table>
  </div>
</template>

<script>
export default {
  name: 'databaseRestore',
  data () {
    return {
      tableData: [{
        id: '1534931788',
        filename: '20180822-175628',
        fileSize: '220.11KB',
        backupTime: '2018-08-22 17:56:28'
      }, {
        id: '1534489272',
        filename: '20180817-150112',
        fileSize: '331.25KB',
        backupTime: '2018-08-17 15:01:12'
      }, {
        id: '1533973445',
        filename: '20180811-154405',
        fileSize: '324.83KB',
        backupTime: '2018-08-11 15:44:05'
      }, {
        id: '1533926674',
        filename: '20180811-024434',
        fileSize: '324.48KB',
        backupTime: '2018-08-11 02:44:34'
      }]
    }
  },
  methods: {
    handleEdit (index, row) {
      console.log(index, row)
    },
    handleDelete (index, row) {
      console.log(index, row)
    }
  }
}
</script>

<style lang="scss" scoped>
    .table-logo {
        width: 75px;
        float: left;
    }

    .table-pay {
        display: inline-block;
        width: 120px;
        overflow: hidden;
        margin-top: 7px;
    }

    .table-desc {
        display: inline-block;
    }
</style>
