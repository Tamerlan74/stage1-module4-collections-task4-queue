package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayDeque<Integer> dishes = new ArrayDeque<>();
        for (int i = 1; i < numberOfDishes; i++) {
            dishes.add(i);
        }
        List<Integer> result = new ArrayList<>(numberOfDishes);
        int k = 1;
        while (!dishes.isEmpty()) {
            if (k == 3) {
                result.add(dishes.pollFirst());
            }
            if (k == 4) {
                k = 0;
            }
            k++;
        }
        return result;
    }
}
