package com.galvanize.restaurants;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/api/restaurants")
    public List<Restaurant> getRestaurantList()  {

        List<Restaurant> restaurantList = Collections.<Restaurant>emptyList();
        Restaurant restaurant1 = new Restaurant();
        Restaurant restaurant2 = new Restaurant();

        restaurant1.setId(1);
        restaurant1.setName("Mac Donalds");

        restaurant2.setId(2);
        restaurant2.setName("Chat House");

        restaurantList.add(1,restaurant1);
        restaurantList.add(2,restaurant2);


        return restaurantList;
    }
}
