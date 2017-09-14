package com.csonezp;

import org.springframework.stereotype.Service;

/**
 * Created by csonezp on 2017/9/14.
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "message from provide";
    }
}
