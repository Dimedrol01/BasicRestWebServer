package com.basic.rest.web.server.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service")
public class ServiceController {
    @RequestMapping("start")
    @ResponseBody
    public String getStatusServer() {
        return "Server is run";
    }
}
