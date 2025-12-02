package com.ely.spring_msg_templates_api.service;

import com.ely.spring_msg_templates_api.dto.TemplateRequestDto;
import com.ely.spring_msg_templates_api.dto.TemplateResponseDto;
import org.springframework.stereotype.Service;

@Service
public class TemplateService {

    public TemplateResponseDto handleTemplateRequest(TemplateRequestDto data) {
        return new TemplateResponseDto(
                data.addressee() + " tratado.",
                data.name() + " tratado.",
                data.title() + " tratado.",
                data.description() + " tratado."
        );
    }
}
