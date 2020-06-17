package com.twschool.practice.domain;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import com.twschool.practice.domain.Answer;
import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.RandomAnswerGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class integralTest {
        @Test
        public void should_return_3_when_given_2345() {
            //given
            String answerNumber = "2 3 4 5";
            Answer answer = new Answer(Arrays.asList("2","3","4","5"));
            RandomAnswerGenerator randomAnswerGenerator = Mockito.mock(RandomAnswerGenerator.class);
            Mockito.when(randomAnswerGenerator.generateAnswer()).thenReturn(answer);
            GuessNumberGame guessNumberGame = new GuessNumberGame(randomAnswerGenerator);
            GameService gameService = new GameService(guessNumberGame);
            //when
            int result = gameService.integral(answerNumber);
            //then
            Assert.assertEquals(3,result);
        }

        @Test
        public void should_return_6_when_given_2345_2345() {
            //given
            String answerNumber = "2 3 4 5";
            Answer answer = new Answer(Arrays.asList("2","3","4","5"));
            RandomAnswerGenerator randomAnswerGenerator = Mockito.mock(RandomAnswerGenerator.class);
            Mockito.when(randomAnswerGenerator.generateAnswer()).thenReturn(answer);
            GuessNumberGame guessNumberGame = new GuessNumberGame(randomAnswerGenerator);
            GameService gameService = new GameService(guessNumberGame);
            //when
            gameService.integral(answerNumber);
            int result = gameService.integral(answerNumber);
            //then
            Assert.assertEquals(6,result);
        }
}
