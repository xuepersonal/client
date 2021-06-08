package com.xue.client.ruleactuator;

import com.xue.client.ruleactuator.rule.RuleDto;

// 规则抽象
public interface BaseRule {
    boolean execute(RuleDto dto);
}
