//package br.com.despesas.despesas.api.resource;
//
//import br.com.despesas.despesas.model.Despesa;
//import br.com.despesas.despesas.service.DespesaService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.BDDMockito;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//@ExtendWith(SpringExtension.class)
//@ActiveProfiles("test")
//@WebMvcTest
//@AutoConfigureMockMvc
//public class DespesaControllerTest {
//
//    static String DESPESA_API = "/despesas";
//
//    @Autowired
//    MockMvc mvc;
//
//    @MockBean
//    DespesaService service;
//
//    @Test
//    @DisplayName("Deve criar uma despesa com sucesso")
//    public void createBookTest() throws Exception{
//        Despesa dto = createValidDespesa();
//        Despesa savedDespesa = Despesa.builder()
//                .dataDespesa(LocalDate.now())
//                .categoria("alimentação")
//                .descricao("almoço")
//                .valor(BigDecimal.valueOf(30.0))
//                .id("1")
//                .build();
//
//        BDDMockito.given(service.create(Mockito.any(Despesa.class))).willReturn(savedDespesa);
//
//        String json = new ObjectMapper().writeValueAsString(dto);
//
//        MockHttpServletRequestBuilder request = MockMvcRequestBuilders
//                .post(DESPESA_API)
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON)
//                .content(json);
//
//        mvc.perform(request)
//                .andExpect(MockMvcResultMatchers.status().isCreated())
//                .andExpect(MockMvcResultMatchers.jsonPath("id").value("1"))
//                .andExpect(MockMvcResultMatchers.jsonPath("categoria").value(dto.getCategoria()))
//                .andExpect(MockMvcResultMatchers.jsonPath("descricao").value(dto.getDescricao()))
//                .andExpect(MockMvcResultMatchers.jsonPath("valor").value(dto.getValor()));
//    }
//
//    public Despesa createValidDespesa() {
//        return Despesa.builder()
//                .dataDespesa(LocalDate.now())
//                .categoria("alimentação")
//                .descricao("almoço")
//                .valor(BigDecimal.valueOf(30.0))
//                .id("1")
//                .build();
//    }
//}
