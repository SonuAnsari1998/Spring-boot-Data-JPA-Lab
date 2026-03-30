package com.nit.repo;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.nit.entity.Travel;

public interface TravelRepository extends CrudRepository<Travel, Long>{

}
