package com.canko.learn.repository;

import com.canko.learn.entity.City;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nie on 17/5/22.
 */
@Repository
public interface CityRepository extends ElasticsearchRepository<City,Long>{

}
