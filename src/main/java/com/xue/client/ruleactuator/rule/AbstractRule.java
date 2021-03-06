package com.xue.client.ruleactuator.rule;

import com.xue.client.ruleactuator.BaseRule;

/**
 * 规则模板
 * @author QSNP253
 */
public abstract class AbstractRule implements BaseRule {
    protected <T> T convert(RuleDto dto) {
        return (T) dto;
    }

    @Override
    public boolean execute(RuleDto dto) {
        return executeRule(convert(dto));
    }

    protected <T> boolean executeRule(T t) {
        return true;
    }
}
