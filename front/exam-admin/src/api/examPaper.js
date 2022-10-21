import {post} from '@/utils/request'
import {query} from "vue/src/platforms/web/util/index";

export default {
  pageList: query => post('/api/admin/exam/paper/page',query),
  taskExamPage: query =>post('/api/admin/exam/paper/taskExamPage',query),
  edit: query=>post('/api/admin/exam/paper/select/',query),
  select: id=>post('/api/admin/exam/paper/select/'+id),
  deletePaper: id=>post('/api/admin/exam/paper/delete'+id)
}
