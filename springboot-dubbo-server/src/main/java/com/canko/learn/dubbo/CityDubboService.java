package com.canko.learn.dubbo;

import com.canko.learn.entity.City;

/**
 * dubbo 服务层
 * Created by nie on 17/5/22.
 */
public interface CityDubboService {

    /**
     * 根据城市id，查询城市信息
     * @param cityId 城市Id
     */
    City findCityById(Long cityId);

}
