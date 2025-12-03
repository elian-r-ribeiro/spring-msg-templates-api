package com.ely.spring_msg_templates_api.service;

import com.ely.spring_msg_templates_api.dto.TemplateRequestDto;
import com.ely.spring_msg_templates_api.strategy.TemplateStrategy;
import com.ely.spring_msg_templates_api.strategy.factory.TemplateStrategyFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TemplateService {

    private final TemplateStrategyFactory templateStrategyFactory;

    public String handleTemplateRequest(TemplateRequestDto data) {
        return processStrategy(data);
    }

    private String processStrategy(TemplateRequestDto data) {
        TemplateStrategy templateStrategy = templateStrategyFactory.getStrategy(data.type());
        return templateStrategy.getTemplate(data);
    }
}
