package com.xue.client.controller;

import com.xue.client.entity.ValueBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author QSNP253
 */
@RestController
@RequestMapping("/test")
public class TestRestController {

    private final ValueBean valueBean;

    public TestRestController(ValueBean valueBean) {
        this.valueBean = valueBean;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return valueBean.getValue1();
    }
}
