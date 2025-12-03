package com.ely.spring_msg_templates_api.strategy.factory;

import com.ely.spring_msg_templates_api.strategy.TemplateStrategy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class TemplateStrategyFactory {

    private final Map<String, TemplateStrategy> strategies;

    public TemplateStrategy getStrategy(String type) {
        return strategies.get(type);
    }
}
