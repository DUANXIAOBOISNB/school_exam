package com.duan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duan.entity.Exam;
import com.duan.vo.AddExamByBankVo;
import com.duan.vo.AddExamByQuestionVo;
import com.duan.vo.ExamQueryVo;
import com.duan.vo.PageResponse;

import java.util.List;

/**
 * @author by wzz
 * @implNote 2020/10/20 9:04
 */
public interface ExamService extends IService<Exam> {

    PageResponse<Exam> getExamPage(ExamQueryVo examQueryVo);

    AddExamByQuestionVo getExamInfoById(Integer examId);

    void operationExam(Integer type, String ids);

    void addExamByBank(AddExamByBankVo addExamByBankVo);

    void addExamByQuestionList(AddExamByQuestionVo addExamByQuestionVo);

    void updateExamInfo(AddExamByQuestionVo addExamByQuestionVo);

    List<String> getExamPassRateEchartData();

    List<String> getExamNumbersEchartData();
}
