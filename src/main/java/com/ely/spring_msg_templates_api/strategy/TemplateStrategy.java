package com.ely.spring_msg_templates_api.strategy;

import com.ely.spring_msg_templates_api.dto.TemplatesRequestDto;

import java.io.IOException;

public interface TemplateStrategy {

    String getTemplate(TemplatesRequestDto data) throws IOException;
}
