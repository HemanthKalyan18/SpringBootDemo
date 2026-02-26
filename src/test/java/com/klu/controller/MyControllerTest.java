package com.klu.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(MyController.class)
public class MyControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testSayWelcome() throws Exception {	
		mockMvc.perform(get("/hello"))             // 1. Arrange & Act: Perform GET /hello
        .andExpect(status().isOk())        // 2. Assert: Check for HTTP 200 OK
        .andExpect(content().string("<h1>Welcome to SpringBoot WebApplication")); // 3. Assert: Verify body

	}

}
