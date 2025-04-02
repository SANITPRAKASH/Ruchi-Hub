package com.nanu.ruchihub.service;

import com.nanu.ruchihub.model.Category;
import com.nanu.ruchihub.model.Food;
import com.nanu.ruchihub.model.Restaurant;
import com.nanu.ruchihub.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    public void deleteFood(Long foodId) throws Exception;

    public List<Food> getRestaurantsFood(Long restaurantId,
                                         boolean isVegetarian,
                                         boolean isNonveg,
                                         boolean seasonal,
                                         String foodCategory
    );

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId) throws Exception;

    public Food updateFoodAvailabilityStatus(Long foodId) throws Exception;

}
