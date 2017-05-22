package com.canko.learn.service;

import com.canko.learn.entity.City;

import java.util.List;

/**
 * Created by nie on 17/5/22.
 */
public interface CityService {

    /**
     * 新增城市信息
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 根据关键词，function score query 权重分分页查询
     * @param pageNumber
     * @param pageSize
     * @param searchContent
     * @return 查询的城市列表
     */
    List<City> searchCity(Integer pageNumber, Integer pageSize, String searchContent);
}
