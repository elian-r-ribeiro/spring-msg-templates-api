package com.ely.spring_msg_templates_api.dto;

public record TemplateRequestDto(
        String addressee,
        String name,
        String title,
        String description
) {
}
