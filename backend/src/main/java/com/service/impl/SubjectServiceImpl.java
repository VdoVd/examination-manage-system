package com.service.impl;

import com.domain.Subject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.repository.SubjectMapper;
import com.service.SubjectService;
import com.viewmodel.admin.education.SubjectPageRequestVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl extends BaseServiceImpl<Subject> implements SubjectService {

    private final SubjectMapper subjectMapper;

    @Autowired
    public SubjectServiceImpl(SubjectMapper subjectMapper) {
        super(subjectMapper);
        this.subjectMapper = subjectMapper;
    }

    @Override
    public Subject selectById(Integer id) {
        return super.selectById(id);
    }

    @Override
    public int updateByIdFilter(Subject record) {
        return super.updateByIdFilter(record);
    }

    @Override
    public List<Subject> getSubjectByLevel(Integer level) {
        return subjectMapper.getSubjectByLevel(level);
    }

    @Override
    public List<Subject> allSubject() {
        return subjectMapper.allSubject();
    }

    @Override
    public Integer levelBySubjectId(Integer id) {
        return this.selectById(id).getLevel();
    }

    @Override
    public PageInfo<Subject> page(SubjectPageRequestVM requestVM) {
        return PageHelper.startPage(requestVM.getPageIndex(), requestVM.getPageSize(), "id desc").doSelectPageInfo(() ->
                subjectMapper.page(requestVM)
        );
    }

}
