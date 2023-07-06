package org.example;

public class Racer implements Runnable {
    private SharedVariable sharedVariable;

    public Racer(SharedVariable sharedVariable) {
        setSharedVariable(sharedVariable);
    }

    private synchronized void printRankings(SharedVariable sharedVariable) {
        System.out.println("Rank: " + sharedVariable.getRank() + " " + Thread.currentThread().getName());
        sharedVariable.updateRank();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("");
        }
        synchronized (getSharedVariable()) {
            printRankings(sharedVariable);
        }
    }

    public SharedVariable getSharedVariable() {
        return sharedVariable;
    }

    public void setSharedVariable(SharedVariable sharedVariable) {
        this.sharedVariable = sharedVariable;
    }
}
