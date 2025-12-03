package com.ely.spring_msg_templates_api.strategy;

import com.ely.spring_msg_templates_api.dto.TemplateRequestDto;

public interface TemplateStrategy {

    String getTemplate(TemplateRequestDto data);
}
