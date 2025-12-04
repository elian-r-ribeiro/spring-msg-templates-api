package com.ely.spring_msg_templates_api.strategy.impl;

import com.ely.spring_msg_templates_api.dto.TemplatesRequestDto;
import com.ely.spring_msg_templates_api.strategy.TemplateStrategy;
import com.ely.spring_msg_templates_api.strategy.util.Utils;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component("email")
public class EmailStrategy implements TemplateStrategy {

    @Override
    public String getTemplate(TemplatesRequestDto data) throws IOException {
        return Utils.extractTextFromFile(data, "templates/email/", ".html");
    }
}
