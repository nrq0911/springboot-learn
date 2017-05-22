package com.canko.learn.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.canko.learn.dubbo.CityDubboService;
import com.canko.learn.entity.City;
import com.canko.learn.service.CityService;
import org.springframework.stereotype.Service;

/**
 * Created by nie on 17/5/22.
 */
@Service
public class CityServiceImpl implements CityService{

    @Reference(version = "1.0.0")
    private CityDubboService cityDubboService;

    @Override
    public City getCityById(Long cityId) {
        if(cityId == null ){
            return null;
        }
        return cityDubboService.findCityById(cityId);
    }
}
