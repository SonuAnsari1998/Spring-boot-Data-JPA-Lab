package com.nit.repo;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.nit.entites.FoodOrder;

public interface FoodOrderRepository extends CrudRepository<FoodOrder, Long>{

}
