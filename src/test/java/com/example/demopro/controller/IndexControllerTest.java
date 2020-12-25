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
public class IndexControllerTest {

  private MockMvc mockMvc;

  @Autowired
  IndexController target;

  @Before
  public void setup() {
    mockMvc = MockMvcBuilders.standaloneSetup(target).build();
  }

  @Test
  public void getIndexTest() throws Exception {
    mockMvc.perform(get("/")).andExpect(status().isOk());

    // mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"))
    // .andExpect(xpath("/html/body/h1").string("Hello CircleCI !!"));

    // MvcResult result =
    // mockMvc.perform(get("/")).andExpect(status().isOk()).andReturn();
    // String content = result.getResponse().getContentAsString();
    // Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
    // .parse(new InputSource(new StringReader(content)));

    // assertThat(document, hasXPath("/html/body/h1", equalTo("Hello CircleCI!!")));
  }

  @Test
  public void testIndex() throws Exception {
    // MvcResult result =
    // this.mockMvc.perform(get("/")).andExpect(status().isOk()).andReturn();
    // MockHttpServletResponse res = result.getResponse();
    // System.out.println(res);
    // String content = result.getResponse().getContentAsString();
    // assertThat(content, containsString("Hello CircleCI !!"));
  }
}
