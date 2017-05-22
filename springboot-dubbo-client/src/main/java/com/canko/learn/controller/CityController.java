package com.canko.learn.controller;

import com.canko.learn.entity.City;
import com.canko.learn.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nie on 17/5/22.
 */
@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city/{id}",method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id){
        if(id == null){
            return null;
        }
        return cityService.getCityById(id);
    }


}
