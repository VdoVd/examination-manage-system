package com.service;

import com.domain.ExamPaper;
import com.domain.User;
import com.github.pagehelper.PageInfo;
import com.viewmodel.admin.exam.ExamPaperEditRequestVM;
import com.viewmodel.admin.exam.ExamPaperPageRequestVM;
import com.viewmodel.student.dashboard.PaperFilter;
import com.viewmodel.student.dashboard.PaperInfo;
import com.viewmodel.student.exam.ExamPaperPageVM;

import java.util.List;

public interface ExamPaperService extends BaseService<ExamPaper> {

    PageInfo<ExamPaper> page(ExamPaperPageRequestVM requestVM);

    PageInfo<ExamPaper> taskExamPage(ExamPaperPageRequestVM requestVM);

    PageInfo<ExamPaper> studentPage(ExamPaperPageVM requestVM);

    ExamPaper savePaperFromVM(ExamPaperEditRequestVM examPaperEditRequestVM, User user);

    ExamPaperEditRequestVM examPaperToVM(Integer id);

    List<PaperInfo> indexPaper(PaperFilter paperFilter);

    Integer selectAllCount();

    List<Integer> selectMothCount();
}
