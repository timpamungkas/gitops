package com.sample;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class GitopsApiTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testEndpointTest() throws Exception {
		this.mockMvc.perform(get("/test"))
			.andExpect(status().is2xxSuccessful())
			.andExpect(
				content().string(containsStringIgnoringCase("just a test"))
			);
	}

	@Test
	void testEndpointOne() throws Exception {
		this.mockMvc.perform(get("/one"))
			.andExpect(status().is2xxSuccessful())
			.andExpect(content().string(containsString("Gradle One")));
	}

	@Test
	void testEndpointTwo() throws Exception {
		this.mockMvc.perform(get("/two"))
			.andExpect(status().is2xxSuccessful())
			.andExpect(content().string(containsString("Gradle Two")));
	}
}
