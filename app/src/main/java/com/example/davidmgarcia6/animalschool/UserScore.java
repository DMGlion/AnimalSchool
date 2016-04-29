package com.example.davidmgarcia6.animalschool;

public class UserScore {

    private static int quizScore;

    private static int numGuesses;
    private static boolean SafaripreviouslyUnlocked = false;
    private static boolean OceanpreviouslyUnlocked = false;
    private static boolean ForestpreviouslyUnlocked = false;
    private static boolean ArcticpreviouslyUnlocked = false;

    private UserScore() {
        quizScore = 0;
        numGuesses = 0;
    }
    public static UserScore getInstance() {
        return ourInstance;
    }
    private static UserScore ourInstance = new UserScore();

    public static int getNumGuesses() {
        return numGuesses;
    }
    public static void setNumGuesses(int numGuesses) {
        UserScore.numGuesses = numGuesses;
    }
    public static boolean isSafaripreviouslyUnlocked() {
        return SafaripreviouslyUnlocked;
    }
    public static void setSafaripreviouslyUnlocked(boolean safaripreviouslyUnlocked) {
        SafaripreviouslyUnlocked = safaripreviouslyUnlocked;
    }
    public static boolean isOceanpreviouslyUnlocked() {
        return OceanpreviouslyUnlocked;
    }
    public static void setOceanpreviouslyUnlocked(boolean oceanpreviouslyUnlocked) {
        OceanpreviouslyUnlocked = oceanpreviouslyUnlocked;
    }
    public static boolean isForestpreviouslyUnlocked() {
        return ForestpreviouslyUnlocked;
    }
    public static void setForestpreviouslyUnlocked(boolean forestpreviouslyUnlocked) {
        ForestpreviouslyUnlocked = forestpreviouslyUnlocked;
    }
    public static boolean isArcticpreviouslyUnlocked() {
        return ArcticpreviouslyUnlocked;
    }
    public static void setArcticpreviouslyUnlocked(boolean arcticpreviouslyUnlocked) {
        ArcticpreviouslyUnlocked = arcticpreviouslyUnlocked;
    }


    public static int getQuizScore() {
        return quizScore;
    }
    public static void setQuizScore(int quizScore) {
        UserScore.quizScore = quizScore;
    }




}
