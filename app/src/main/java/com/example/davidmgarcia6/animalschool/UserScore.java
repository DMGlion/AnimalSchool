package com.example.davidmgarcia6.animalschool;

public class UserScore {

    private static int quizScore;
    private static UserScore ourInstance = new UserScore();

    public static UserScore getInstance() {
        return ourInstance;
    }

    private UserScore() {
        quizScore = 0;
    }

    public static int getQuizScore() {
        return quizScore;
    }

    public static void setQuizScore(int quizScore) {
        UserScore.quizScore = quizScore;
    }
}
