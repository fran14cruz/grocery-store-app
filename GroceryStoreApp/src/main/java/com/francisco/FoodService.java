package com.francisco;

import com.francisco.model.FoodType;

import java.util.ArrayList;
import java.util.List;

public class FoodService {

    public List getAvailableProducts(FoodType type) {

        List products = new ArrayList();

        if (type.equals(FoodType.VEGETABLES)) {
            products.add("Aubergine");
            products.add("Red Bell Pepper");

        } else if (type.equals(FoodType.FRUITS)) {
            products.add("Blueberry");

        } else if (type.equals(FoodType.GRAINS)) {
            products.add("Red Kidney Beans");

        } else if (type.equals(FoodType.SEAFOOD)) {
            products.add("Salmon");
            products.add("Tuna");

        } else if (type.equals(FoodType.DAIRY)) {
            products.add("Cow Cheese");

        } else {
            products.add("No product available");
        }

        return products;
    }

}
