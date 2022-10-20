package com.viewmodel.student.question.answer;


import com.viewmodel.admin.question.QuestionEditRequestVM;
import com.viewmodel.student.exam.ExamPaperSubmitItemVM;

public class QuestionAnswerVM {
    private QuestionEditRequestVM questionVM;
    private ExamPaperSubmitItemVM questionAnswerVM;

    public QuestionEditRequestVM getQuestionVM() {
        return questionVM;
    }

    public void setQuestionVM(QuestionEditRequestVM questionVM) {
        this.questionVM = questionVM;
    }

    public ExamPaperSubmitItemVM getQuestionAnswerVM() {
        return questionAnswerVM;
    }

    public void setQuestionAnswerVM(ExamPaperSubmitItemVM questionAnswerVM) {
        this.questionAnswerVM = questionAnswerVM;
    }
}
