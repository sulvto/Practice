/**
 * Created by sulvto on 12/10/18.
 */
import { clone } from '@/utils/index'

export function mockItem (id, data) {
  if (id) {
    return { code: 0, message: '', data: clone(data.find(item => item.id === id)) }
  } else {
    return { code: -1, message: '' }
  }
}

export function mockList (params = { page: 1 }, data, filter = item => true) {
  var items

  var filterData = data.filter(filter)
  var total = filterData.length

  if (params.limit) {
    var start = (params.page - 1) * params.limit
    var end = start + params.limit
    items = data.filter(filter).slice(start, end)
  } else {
    items = data.filter(filter)
  }

  return {
    code: 0,
    message: '',
    data: {
      items: clone(items),
      total: total
    }
  }
}
