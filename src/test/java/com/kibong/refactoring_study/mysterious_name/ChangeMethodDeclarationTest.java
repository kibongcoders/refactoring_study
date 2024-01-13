package com.kibong.refactoring_study.mysterious_name;

import com.kibong.refactoring_study.domain.Chief;
import com.kibong.refactoring_study.domain.Food;
import com.kibong.refactoring_study.domain.Restaurant;
import com.kibong.refactoring_study.mysterious_name.change_method_declaration.RestaurantService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class ChangeMethodDeclarationTest {

    @Autowired
    RestaurantService restaurantService;

    @Test
    public void getFoods(){

        Food food = Food.builder().foodCost(1000).foodName("kimchiSoup").foodType("korean").build();
        List<Food> foodList = new ArrayList<>();
        foodList.add(food);

        Chief chief = Chief.builder().chiefName("kibong").foodList(foodList).build();
        List<Chief> chiefList = new ArrayList<>();
        chiefList.add(chief);

        Restaurant restaurant = Restaurant.builder()
                .restaurantName("hello")
                .restaurantRegion("seoul")
                .restaurantType("korean")
                .chiefList(chiefList)
                .build();

        List<Food> foodsOfRestaurant = restaurantService.getFoodsOfRestaurant(restaurant);

        assertEquals(food.getFoodName(), foodsOfRestaurant.get(0).getFoodName());
    }
}
