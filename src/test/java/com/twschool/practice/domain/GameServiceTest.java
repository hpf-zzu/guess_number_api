package com.twschool.practice.domain;

        import com.twschool.practice.domain.GameService;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.mockito.Mockito;
        import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;

        import java.util.Arrays;

        import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class GameServiceTest {
    @Test
    public void should_return(){
        String userAnswerString = "7 2 3 4";
        Answer answer = new Answer(Arrays.asList("1","2","3","4"));
        RandomAnswerGenerator randomAnswerGenerator = Mockito.mock(RandomAnswerGenerator.class);
        Mockito.when(randomAnswerGenerator.generateAnswer()).thenReturn(answer);
        GameService gameService = new GameService(new GuessNumberGame(randomAnswerGenerator));
        String result = gameService.guess(userAnswerString);
        assertEquals("3A0B",result);
    }
}