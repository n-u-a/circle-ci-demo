package com.example.demopro.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class NameControllerTest {

  private MockMvc mockMvc;

  @Autowired
  IndexController target;

  @Before
  public void setup() {
    mockMvc = MockMvcBuilders.standaloneSetup(target).build();
  }

  @Test
  public void getIndexTest() throws Exception {
    mockMvc.perform(get("/index")).andExpect(status().isOk());
  }
}
