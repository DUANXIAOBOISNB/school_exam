package com.duan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duan.entity.ExamQuestion;

/**
 * @author by wzz
 * @implNote 2020/10/20 9:04
 */
public interface ExamQuestionService extends IService<ExamQuestion> {

    ExamQuestion getExamQuestionByExamId(Integer examId);

}
