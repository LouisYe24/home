package com.louis.home.husband.webapi.impl;

import com.louis.home.husband.service.HusbandService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: home
 * @BelongsPackage: com.louis.home.husband.webapi.impl
 * @Author: louis
 * @CreateTime: 2023-04-19  20:07
 * @Description:
 * @Version: 1.0
 */
@DubboService
@Service
@Slf4j
public class HusbandServiceImpl implements HusbandService {
    @Override
    public String washTheDish() {
        log.info("丈夫正在洗碗");
        String message ="丈夫正在洗碗";
        return message;
    }
}
