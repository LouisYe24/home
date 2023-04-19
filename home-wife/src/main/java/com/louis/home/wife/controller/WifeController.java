package com.louis.home.wife.controller;

import com.louis.home.husband.service.HusbandService;
import com.louis.home.wife.service.WifeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Api(tags = "老婆模块")
@RequestMapping("/wife")
public class WifeController {
    @Autowired
    private WifeService wifeService;
    @PostMapping("/command")
    @ApiOperation("命令洗碗")
    public String command() {
        String message = wifeService.goWash();
        return message;
    }

}
