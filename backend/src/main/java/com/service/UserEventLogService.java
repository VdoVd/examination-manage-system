package com.service;


import com.domain.UserEventLog;
import com.github.pagehelper.PageInfo;
import com.viewmodel.admin.user.UserEventPageRequestVM;

import java.util.List;

public interface UserEventLogService extends BaseService<UserEventLog> {

    List<UserEventLog> getUserEventLogByUserId(Integer id);

    PageInfo<UserEventLog> page(UserEventPageRequestVM requestVM);

    List<Integer> selectMothCount();
}
