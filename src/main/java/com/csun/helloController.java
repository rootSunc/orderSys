package com.csun;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Sun Chao
 * @Date: Create at 10:13 AM 10/15/20
 * @Description:
 **/
@RestController
public class helloController {

    @RequestMapping("/")
    public String index() {
        return "hello";
    }
}
