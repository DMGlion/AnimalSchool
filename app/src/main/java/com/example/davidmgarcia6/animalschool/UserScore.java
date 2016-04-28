package com.example.davidmgarcia6.animalschool;

public class UserScore {

    private static int quizScore;
    private static boolean previouslyUnlocked = false;
    private static UserScore ourInstance = new UserScore();

    public static boolean isPreviouslyUnlocked() {
        return previouslyUnlocked;
    }

    private UserScore() {
        quizScore = 0;
    }

    public static UserScore getInstance() {
        return ourInstance;
    }

    public static int getQuizScore() {
        return quizScore;
    }

    public static void setQuizScore(int quizScore) {
        UserScore.quizScore = quizScore;
    }

    public static void setPreviouslyUnlocked(boolean previouslyUnlocked) {
        UserScore.previouslyUnlocked = previouslyUnlocked;
    }


}
