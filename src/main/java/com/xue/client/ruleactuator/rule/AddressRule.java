package com.xue.client.ruleactuator.rule;



/**
 * @author QSNP253
 */
public class AddressRule extends AbstractRule {
    @Override
    public boolean execute(RuleDto dto) {
        System.out.println("AddressRule invoke!");
        if (dto.getAddress().startsWith(RuleConstant.MATCH_ADDRESS_START)) {
            return true;
        }
        return false;
    }
}
