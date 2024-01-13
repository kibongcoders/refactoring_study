package com.kibong.refactoring_study.mysterious_name.change_method_declaration;

import com.kibong.refactoring_study.domain.Chief;
import com.kibong.refactoring_study.domain.Food;
import com.kibong.refactoring_study.domain.Restaurant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BeforeRestaurantService {

    public List<Food> foods(Restaurant restaurant){

        List<Chief> chiefList = restaurant.getChiefList();
        List<Food> foodList = new ArrayList<>();

        for (Chief chief : chiefList) {
            foodList.addAll(chief.getFoodList());
        }

        return foodList;
    }
}
