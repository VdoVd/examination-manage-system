package com.viewmodel.student.exampaper;

import com.base.BasePage;
import com.domain.ExamPaperAnswer;
import com.service.ExamPaperAnswerService;
import com.service.impl.BaseServiceImpl;

public class ExamPaperAnswerPageVM extends BasePage {

    private Integer subjectId;

    private Integer createUser;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }
}
