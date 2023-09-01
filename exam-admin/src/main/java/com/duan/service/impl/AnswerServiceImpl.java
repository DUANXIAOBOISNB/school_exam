package com.duan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duan.entity.Answer;
import com.duan.mapper.AnswerMapper;
import com.duan.service.AnswerService;
import org.springframework.stereotype.Service;


@Service
public class AnswerServiceImpl extends ServiceImpl<AnswerMapper, Answer> implements AnswerService {
}
