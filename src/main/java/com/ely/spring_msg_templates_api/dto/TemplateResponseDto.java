package com.ely.spring_msg_templates_api.dto;

public record TemplateResponseDto(
        String addressee,
        String name,
        String title,
        String description
) {
}
