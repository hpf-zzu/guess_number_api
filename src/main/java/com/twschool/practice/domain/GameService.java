package com.twschool.practice.domain;

import java.util.Arrays;
import java.util.List;

public class GameService {
    private GuessNumberGame guessNumberGame;
    public GameService(GuessNumberGame guessNumberGame) {
        this.guessNumberGame = guessNumberGame;
    }
    public String guess(String userAnswerString){
        List<String> userAnswer = Arrays.asList(userAnswerString.split(" "));
        return guessNumberGame.guess(userAnswer);
    }

    public int integral(String answer1) {
        List<String> answerList = Arrays.asList(answer1.split(" "));
        String result = guessNumberGame.guess(answerList);
        return guessNumberGame.countScore(result);
    }
}
