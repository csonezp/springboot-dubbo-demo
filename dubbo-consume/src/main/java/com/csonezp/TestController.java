package com.csonezp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by csonezp on 2017/9/14.
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;
    @RequestMapping("/test")
    public Object test() {
        return testService.test();
    }
}
