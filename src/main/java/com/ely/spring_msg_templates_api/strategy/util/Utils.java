package com.ely.spring_msg_templates_api.strategy.util;

import com.ely.spring_msg_templates_api.dto.TemplatesRequestDto;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Utils {

    public static String extractTextFromFile(TemplatesRequestDto data,
                                             String path,
                                             String fileExtension) throws IOException {

        final ClassPathResource resource = new ClassPathResource(path + data.template() + fileExtension);

        return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8)
                .replace("{{name}}", data.name())
                .replace("{{title}}", data.title())
                .replace("{{description}}", data.description());
    }
}
