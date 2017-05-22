package com.canko.learn.entity;

import java.io.Serializable;

/**
 * 城市实体类
 * Created by nie on 17/5/22.
 */
public class City implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 城市编号
     */
    private Long id;

    /**
     * 城市省份
     */
    private String province;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", province='" + province + '\'' + ", cityName='" + cityName + '\'' +
                ", description='" + description + '\'' + '}';
    }
}
