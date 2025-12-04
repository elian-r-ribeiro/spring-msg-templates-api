package com.ely.spring_msg_templates_api.controller;

import com.ely.spring_msg_templates_api.dto.TemplatesRequestDto;
import com.ely.spring_msg_templates_api.service.TemplateService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/templates")
@AllArgsConstructor
public class TemplateController {

    private TemplateService templateService;

    @PostMapping(produces = MediaType.TEXT_HTML_VALUE)
    private ResponseEntity<String> templateRequest(@RequestBody TemplatesRequestDto data) throws IOException {
        return ResponseEntity.ok(templateService.handleTemplateRequest(data));
    }
}
