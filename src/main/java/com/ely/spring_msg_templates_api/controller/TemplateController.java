package com.ely.spring_msg_templates_api.controller;

import com.ely.spring_msg_templates_api.dto.TemplateRequestDto;
import com.ely.spring_msg_templates_api.dto.TemplateResponseDto;
import com.ely.spring_msg_templates_api.service.TemplateService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/templates")
@AllArgsConstructor
public class TemplateController {

    private TemplateService templateService;

    @PostMapping
    private ResponseEntity<TemplateResponseDto> templateRequest(@RequestBody TemplateRequestDto data) {
        return ResponseEntity.ok(templateService.handleTemplateRequest(data));
    }
}
