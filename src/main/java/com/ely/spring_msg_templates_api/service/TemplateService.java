package com.ely.spring_msg_templates_api.service;

import com.ely.spring_msg_templates_api.dto.TemplatesRequestDto;
import com.ely.spring_msg_templates_api.strategy.TemplateStrategy;
import com.ely.spring_msg_templates_api.strategy.factory.TemplateStrategyFactory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@AllArgsConstructor
public class TemplateService {

    private final TemplateStrategyFactory templateStrategyFactory;

    public String handleTemplateRequest(TemplatesRequestDto data) throws IOException {
        return processStrategy(data);
    }

    private String processStrategy(TemplatesRequestDto data) throws IOException {
        TemplateStrategy templateStrategy = templateStrategyFactory.getStrategy(data.type());
        return templateStrategy.getTemplate(data);
    }
}
