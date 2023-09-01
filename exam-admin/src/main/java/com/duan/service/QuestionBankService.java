package com.duan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.duan.entity.QuestionBank;
import com.duan.vo.BankHaveQuestionSum;
import com.duan.vo.PageResponse;
import com.duan.vo.QuestionVo;

import java.util.List;

/**
 * @author by wzz
 * @implNote 2020/10/20 9:04
 */
public interface QuestionBankService extends IService<QuestionBank> {

    PageResponse<BankHaveQuestionSum> getBankHaveQuestionSumByType(String bankName, Integer pageNo, Integer pageSize);

    List<QuestionVo> getQuestionsByBankId(Integer bankId);

    List<QuestionVo> getQuestionByBankIdAndType(Integer bankId, Integer type);

    List<QuestionBank> getAllQuestionBanks();

    void addQuestionToBank(String questionIds, String banks);

    void removeBankQuestion(String questionIds, String banks);

    void deleteQuestionBank(String ids);

    void addQuestionBank(QuestionBank questionBank);
}
