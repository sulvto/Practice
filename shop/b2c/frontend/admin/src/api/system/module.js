import { mockList, mockItem } from '@/utils/mock'

const data = [
  {
    id: 1,
    name: '门店管理',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 2,
    name: '首页',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 3,
    name: '商品',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 4,
    name: '订单',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 5,
    name: '营销',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 6,
    name: '会员',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 7,
    name: '数据',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 8,
    name: '微信',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 9,
    name: '佣金',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 10,
    name: '网站',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 11,
    name: '分销',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 12,
    name: '设置',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 13,
    name: '系统',
    level: 0,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 14,
    name: '空调',
    level: 1,
    parentId: 1,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 15,
    name: '洗衣机',
    level: 1,
    parentId: 1,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 16,
    name: '智能家居',
    level: 1,
    parentId: 1,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 17,
    name: '曲面电视',
    level: 2,
    parentId: 13,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 18,
    name: '超薄电视',
    level: 2,
    parentId: 13,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 19,
    name: 'HDR电视',
    level: 2,
    parentId: 13,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 20,
    name: '电脑整机',
    level: 1,
    parentId: 3,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 21,
    name: '电脑配件',
    level: 1,
    parentId: 3,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 22,
    name: '外设产品',
    level: 1,
    parentId: 3,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 23,
    name: '鼠标',
    level: 2,
    parentId: 22,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 24,
    name: '键盘',
    level: 2,
    parentId: 22,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }, {
    id: 25,
    name: '键鼠套装',
    level: 2,
    parentId: 22,
    url: '',
    controllerName: '',
    methodName: '',
    isShow: true,
    description: '',
    sort: 1
  }
]

var roles = [{
  id: 1,
  name: '社区民警'
}, {
  id: 2,
  name: '派出所领导'
}, {
  id: 3,
  name: '区县经侦支大队领导'
}, {
  id: 4,
  name: '区县经侦支大队民警'
}, {
  id: 5,
  name: '总队六支队民警'
}, {
  id: 6,
  name: '总队六支队领导'
}, {
  id: 7,
  name: '总队领导'
}]

export function fetchList (params) {
  return new Promise(resolve => {
    resolve(mockList(params, data))
  }, 1000)
}

export function fetchRecyclerList (params) {
  return fetchList(params)
}

export function fetchById (id) {
  console.log('fetchById', id)

  return new Promise(resolve => {
    resolve(mockItem(id, data))
  })
}

export function fetchRoles () {
  return new Promise(resolve => {
    resolve({
      code: 0,
      message: '',
      data: roles
    })
  })
}

export function fetchRole (id) {
  return new Promise(resolve => {
    resolve({
      code: 0,
      message: '',
      data: roles.find(item => item.id === id)
    })
  })
}

export function save (form) {
  if (form.id) {
    var find = data.find(item => item.id === form.id)
    // assert find != null
    find = Object.assign(find, form)
  } else {
    // 新增
    form.id = new Date().getTime()
    form.createDate = new Date()

    console.log('webuser save', form)
    data.push(form)
  }

  return new Promise(resolve => {
    resolve({
      code: 0,
      message: ''
    })
  })
}

export function del (idArray) {
  if (idArray instanceof Array) {
    idArray.forEach(id => {
      // TODO: IE No support
      var index = data.findIndex(item => item.id === id)
      if (index !== -1) {
        data.splice(index, 1)
      }
    })
  }

  return new Promise(resolve => {
    resolve({
      code: 0,
      message: ''
    })
  })
}
