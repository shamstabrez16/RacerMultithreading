package org.example;

public class SharedVariable {

    private int rank = 1;

    public synchronized int getRank() {
        return rank;
    }

    public synchronized void updateRank() {
        rank++;
    }

}
