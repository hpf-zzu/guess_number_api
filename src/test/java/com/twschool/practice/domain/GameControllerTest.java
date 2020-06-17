package com.twschool.practice.domain;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class GameControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void should_return_guess_result() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/game")
        .contentType(MediaType.APPLICATION_JSON)
        .param("game","1 2 3 4" ))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.jsonPath("$.input").value("1 2 3 4"))
        .andExpect(MockMvcResultMatchers.jsonPath("$.result").value("4A0B"));
    }
}
