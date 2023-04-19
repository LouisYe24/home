package com.louis.home.husband.webapi.controller;

import com.louis.home.husband.service.HusbandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: home
 * @BelongsPackage: com.louis.home.husband.webapi.controller
 * @Author: louis
 * @CreateTime: 2023-04-19  20:07
 * @Description:
 * @Version: 1.0
 */
@RestController
@Slf4j
@Api(tags = "丈夫模块")
@RequestMapping("/husband")
public class HusbandController {
    @Autowired
    private HusbandService husbandService;

    @PostMapping("/wash")
    @ApiOperation("丈夫洗碗")
    public String wash(){
        String message = husbandService.washTheDish();
        return message;
    }

}
