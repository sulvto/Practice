const data = [
  {
    id: '1001',
    area: { name: '江北区', value: '江北区' },
    no: '900100',
    role: { id: 1, name: '社区民警' },
    idNumber: '500233190010105106',
    name: '五里店',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1002',
    area: { name: '江北区', value: '江北区' },
    no: '900101',
    role: { id: 1, name: '社区民警' },
    idNumber: '500233190010105106',
    name: '红旗河沟',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1003',
    area: { name: '南岸区', value: '南岸区' },
    no: '900102',
    role: { id: 1, name: '社区民警' },
    idNumber: '500233190010105106',
    name: '红旗河沟',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1004',
    area: { name: '南岸区', value: '南岸区' },
    no: '900103',
    role: { id: 1, name: '社区民警' },
    idNumber: '500233190010105106',
    name: '华新街',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1005',
    area: { name: '江北区', value: '江北区' },
    no: '900104',
    role: { id: 2, name: '派出所领导' },
    idNumber: '500233190010105106',
    name: '江北嘴',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1006',
    area: { name: '南岸区', value: '南岸区' },
    no: '900105',
    role: { id: 3, name: '区县经侦支大队领导' },
    idNumber: '500233190010105106',
    name: '北滨路',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1007',
    area: { name: '渝北区', value: '渝北区' },
    no: '900106',
    role: { id: 4, name: '区县经侦支大队民警' },
    idNumber: '500233190010105106',
    name: '北滨路',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1008',
    area: { name: '沙坪坝区', value: '沙坪坝区' },
    no: '900107',
    role: { id: 4, name: '区县经侦支大队民警' },
    idNumber: '500233190010105106',
    name: '北滨路',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1009',
    area: { name: '江北区', value: '江北区' },
    no: '900108',
    role: { id: 5, name: '总队六支队民警' },
    idNumber: '500233190010105106',
    name: '北滨路',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1010',
    area: { name: '沙坪坝区', value: '沙坪坝区' },
    no: '900109',
    role: { id: 5, name: '总队六支队民警' },
    idNumber: '500233190010105106',
    name: '北滨路',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1011',
    area: { name: '渝北区', value: '渝北区' },
    no: '900110',
    role: { id: 1, name: '社区民警' },
    idNumber: '500233190010105106',
    name: '北滨路',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1012',
    area: { name: '九龙坡区', value: '九龙坡区' },
    no: '900111',
    role: { id: 6, name: '总队六支队领导' },
    idNumber: '500233190010105106',
    name: '北滨路',
    createDate: '2018-12-01 11:27:27'
  }, {
    id: '1013',
    area: { name: '九龙坡区', value: '九龙坡区' },
    no: '900112',
    role: { id: 7, name: '总队领导' },
    idNumber: '500233190010105106',
    name: '北滨路',
    createDate: '2018-12-01 11:27:27'
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

export function fetchList(params) {
  var start = (params.page - 1) * params.limit
  var end = start + params.limit

  return new Promise(resolve => {
    resolve({
      code: 0,
      message: '',
      data: {
        items: data.filter(item => params.role ? item.role.name === params.role : true).slice(start, end),
        total: data.filter(item => params.role ? item.role.name === params.role : true).length
      }
    })
  }, 1000)
}

export function fetchRecyclerList(params) {
  return fetchList(params)
}

export function fetchById(id) {
  console.log('fetchById', id)
  var result = null
  if (id) {
    result = { code: 0, message: '', data: data.find(item => item.id === id) }
  } else {
    result = { code: -1, message: '' }
  }

  return new Promise(resolve => {
    resolve(result)
  })
}

export function fetchRoles() {
  return new Promise(resolve => {
    resolve({
      code: 0,
      message: '',
      data: roles
    })
  })
}

export function fetchRole(id) {
  return new Promise(resolve => {
    resolve({
      code: 0,
      message: '',
      data: roles.find(item => item.id === id)
    })
  })
}

export function save(form) {
  if (!form.id) {
    // 新增
    form.id = new Date().getTime().toString()
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

export function del(idArray) {
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
