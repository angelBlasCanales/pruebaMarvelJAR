package mx.com.angeldev.marveljar;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest()
@WebAppConfiguration
class MarvelJarApplicationTests {

MockMvc mockMvc;
	
	private final static String BASE_URL = "/test/marvel/characters/";
	
	@Autowired
	WebApplicationContext applicationContext;
	
	@BeforeEach
	void setUp() {
		
		mockMvc = MockMvcBuilders.webAppContextSetup(applicationContext).build();
		
	}

	@Test
	void getAll() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get(BASE_URL)
				.accept(MediaType.APPLICATION_JSON_VALUE))
		.andExpect(status().isOk()).andReturn();
	}
	
	@Test
	void getCharacter() throws Exception {
		mockMvc.perform(get(BASE_URL+"1011334")
	            .accept(MediaType.APPLICATION_JSON_VALUE))
	            .andExpect(status().isOk())
	            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
	            .andExpect(jsonPath("$.data.results[0].id").value(1011334))
	            .andReturn();
	}
	
	@Test
	void getCharacterFail() throws Exception {
		mockMvc.perform(get(BASE_URL+"99")
	            .accept(MediaType.APPLICATION_JSON_VALUE))
	            .andExpect(status().is5xxServerError())
	            .andReturn();
	}

}
