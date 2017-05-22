package com.canko.learn.service;

import com.canko.learn.entity.City;

/**
 * Created by nie on 17/5/22.
 */
public interface CityService {

    /**
     * 根据城市名称获取城市信息
     * @param cityId
     * */
    City getCityById(Long cityId);

}
