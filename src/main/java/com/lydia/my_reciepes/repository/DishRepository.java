package com.lydia.my_reciepes.repository;

import com.lydia.my_reciepes.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DishRepository extends JpaRepository<Dish, Long> {


}
