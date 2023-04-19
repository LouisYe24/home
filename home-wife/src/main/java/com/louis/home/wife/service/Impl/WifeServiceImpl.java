package com.louis.home.wife.service.Impl;

import com.louis.home.husband.service.HusbandService;
import com.louis.home.wife.service.WifeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Slf4j
//单纯消费者无需写@DubboService
@Service
public class WifeServiceImpl implements WifeService {

    @DubboReference
    private HusbandService DubboHusbandService;

    /*
     * @description: 让丈夫洗碗
     * @return: void
     **/
    @Override
    public String goWash() {
        String message = DubboHusbandService.washTheDish();
        return message;
    }
}
