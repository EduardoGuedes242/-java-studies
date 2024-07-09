package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("food")
public class FoodController {

  @Autowired
  private FoodRepository foodRepository;
  @GetMapping
  public List<FoodResponseDTO> getAll() {
    List<FoodResponseDTO> listFood = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();

    for(FoodResponseDTO food : listFood) {
      System.out.println(food.title());
    }

    return listFood;
  }

  @PostMapping
  public void insertFood(@RequestBody FoodRequestDTO data) {
    Food foodData = new Food(data);
    foodRepository.save(foodData);
  }

}
