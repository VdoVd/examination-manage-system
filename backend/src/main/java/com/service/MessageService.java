package com.service;

import com.domain.Message;
import com.domain.MessageUser;
import com.github.pagehelper.PageInfo;
import com.viewmodel.admin.message.MessagePageRequestVM;
import com.viewmodel.student.user.MessageRequestVM;

import java.util.List;

public interface MessageService {
    List<Message> selectMessageByIds(List<Integer> ids);

    PageInfo<MessageUser> studentPage(MessageRequestVM requestVM);

    PageInfo<Message> page(MessagePageRequestVM requestVM);

    List<MessageUser> selectByMessageIds(List<Integer> ids);

    void sendMessage(Message message, List<MessageUser> messageUsers);

    void read(Integer id);

    Integer unReadCount(Integer userId);

    Message messageDetail(Integer id);
}
