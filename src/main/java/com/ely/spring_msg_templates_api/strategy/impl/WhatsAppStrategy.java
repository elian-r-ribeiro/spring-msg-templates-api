package com.ely.spring_msg_templates_api.strategy.impl;

import com.ely.spring_msg_templates_api.dto.TemplateRequestDto;
import com.ely.spring_msg_templates_api.strategy.TemplateStrategy;
import org.springframework.stereotype.Component;

@Component("whatsApp")
public class WhatsAppStrategy implements TemplateStrategy {


    @Override
    public String getTemplate(TemplateRequestDto data) {
        return "Type WhatsApp";
    }
}
