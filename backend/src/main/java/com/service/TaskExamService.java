package com.service;


import com.domain.TaskExam;
import com.domain.User;
import com.github.pagehelper.PageInfo;
import com.viewmodel.admin.task.TaskPageRequestVM;
import com.viewmodel.admin.task.TaskRequestVM;

import java.util.List;

public interface TaskExamService extends BaseService<TaskExam> {

    PageInfo<TaskExam> page(TaskPageRequestVM requestVM);

    void edit(TaskRequestVM model, User user);

    TaskRequestVM taskExamToVM(Integer id);

    List<TaskExam> getByGradeLevel(Integer gradeLevel);
}
