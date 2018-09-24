package me.qinchao.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by sulvto on 9/21/18.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/user")).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("{}"));
    }

    @Test
    public void findAll() throws Exception {
//        User first = new UserBuilder()
//                .id(1L)
//                .description("Lorem ipsum")
//                .title("Foo")
//                .build();
//        Todo second = new UserBuilder()
//                .id(2L)
//                .description("Lorem ipsum")
//                .title("Bar")
//                .build();
//
//        when(todoServiceMock.findAll()).thenReturn(Arrays.asList(first, second));
//
//        mockMvc.perform(get("/api/todo"))
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
//                .andExpect(jsonPath("$", hasSize(2)))
//                .andExpect(jsonPath("$[0].id", is(1)))
//                .andExpect(jsonPath("$[0].description", is("Lorem ipsum")))
//                .andExpect(jsonPath("$[0].title", is("Foo")))
//                .andExpect(jsonPath("$[1].id", is(2)))
//                .andExpect(jsonPath("$[1].description", is("Lorem ipsum")))
//                .andExpect(jsonPath("$[1].title", is("Bar")));
//
//        verify(todoServiceMock, times(1)).findAll();
//        verifyNoMoreInteractions(todoServiceMock);
    }
}
