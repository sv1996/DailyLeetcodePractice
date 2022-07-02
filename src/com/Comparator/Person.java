package com.Comparator;

public class Person {
    public String playerName;
    public int playerScore;

    public Person(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    public Person() {

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "playerName='" + playerName + '\'' +
                ", playerScore=" + playerScore +
                '}';
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }
}
