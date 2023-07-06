package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SharedVariable sharedVariable = new SharedVariable();
        Thread[] threads = new Thread[6];
        Thread racer1 = new Thread(new Racer(sharedVariable));
        racer1.setName("racer1");
        threads[0] = racer1;
        Thread racer2 = new Thread(new Racer(sharedVariable));
        racer2.setName("racer2");
        threads[1] = racer2;
        Thread racer3 = new Thread(new Racer(sharedVariable));
        racer3.setName("racer3");
        threads[2] = racer3;
        Thread racer4 = new Thread(new Racer(sharedVariable));
        racer4.setName("racer4");
        threads[3] = racer4;
        Thread racer5 = new Thread(new Racer(sharedVariable));
        racer5.setName("racer5");
        threads[4] = racer5;
        Thread racer6 = new Thread(new Racer(sharedVariable));
        racer6.setName("racer6");
        threads[5] = racer6;
        OrderOfCars orderOfCars = new OrderOfCars();
        List<Integer> randomOrder = orderOfCars.RandomOrder();
        for (Integer carOrder : randomOrder) {
            threads[carOrder].start();
        }
        try {
            for (Integer carOrder : randomOrder) {
                threads[carOrder].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}