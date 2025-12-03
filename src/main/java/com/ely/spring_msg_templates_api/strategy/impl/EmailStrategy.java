package com.ely.spring_msg_templates_api.strategy.impl;

import com.ely.spring_msg_templates_api.dto.TemplateRequestDto;
import com.ely.spring_msg_templates_api.strategy.TemplateStrategy;
import org.springframework.stereotype.Component;

@Component("email")
public class EmailStrategy implements TemplateStrategy {

    @Override
    public String getTemplate(TemplateRequestDto data) {
        String html = """
                        <html>
                            <head>
                                <title>{{title}}</title>
                            </head>
                            <body>
                                <h1>Olá, {{name}}!</h1>
                                <p>{{description}}</p>
                            </body>
                        </html>
                """;

        return html
                .replace("{{name}}", data.name())
                .replace("{{description}}", data.description())
                .replace("{{title}}", data.title());
    }
}
