import {post} from '@/utils/request'
import {query} from "vue/src/platforms/web/util/index";
export default {
  list:query=>post('/api/admin/education/subject/list'),
  pageList:query=>post('/api/admin/education/subject/page',query),
  edit:query=>post('/api/admin/education/subject/edit',query),
  select:id=>post('/api/admin/education/subject/select/'+id),
  deleteSubject:id=>post('/api/admin/eduction/subject/delete/'+id)
}
