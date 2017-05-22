package com.canko.learn.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.canko.learn.dubbo.CityDubboService;
import com.canko.learn.entity.City;

/**
 * Created by nie on 17/5/22.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService{

    @Override
    public City findCityById(Long cityId) {
        City city = new City();
        city.setId(cityId);
        city.setCityName("深圳");
        city.setProvince("广东");
        city.setDescription("经济特区");
        return city;
    }
}
