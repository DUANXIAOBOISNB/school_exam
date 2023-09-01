package com.duan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duan.entity.Question;
import com.duan.vo.PageResponse;
import com.duan.vo.QuestionVo;

import java.util.List;

/**
 * @author by wzz
 * @implNote 2020/10/20 9:04
 */
public interface QuestionService extends IService<Question> {

    PageResponse<Question> getQuestion(String questionType, String questionBank, String questionContent, Integer pageNo, Integer pageSize);

    QuestionVo getQuestionVoById(Integer id);

    PageResponse<QuestionVo> getQuestionVoByIds(List<Integer> ids);

    void deleteQuestionByIds(String questionIds);

    void addQuestion(QuestionVo questionVo);

    void updateQuestion(QuestionVo questionVo);

}
