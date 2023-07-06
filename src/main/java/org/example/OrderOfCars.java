package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderOfCars {

    public List<Integer> RandomOrder() {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        while (randomNumbers.size() < 6) {
            int randomNumber = random.nextInt(6);
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return randomNumbers;
    }
}
