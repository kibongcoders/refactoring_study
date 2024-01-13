package com.kibong.refactoring_study.mysterious_name.change_method_declaration;

import com.kibong.refactoring_study.domain.Chief;
import com.kibong.refactoring_study.domain.Food;
import com.kibong.refactoring_study.domain.Restaurant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    /*
     * 리팩토링의 Rename 단축키를 쓴다면 손쉽게 변경 할 수 있다.
     *
     */
    public List<Food> getFoodsOfRestaurant(Restaurant restaurant) {

        List<Chief> chiefList = restaurant.getChiefList();
        List<Food> foodList = new ArrayList<>();

        for (Chief chief : chiefList) {
            foodList.addAll(chief.getFoodList());
        }

        return foodList;
    }
}
