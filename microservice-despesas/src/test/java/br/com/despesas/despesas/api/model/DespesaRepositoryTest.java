//package br.com.despesas.despesas.api.model;
//
//import br.com.despesas.despesas.config.MongoDbContainer;
//import br.com.despesas.despesas.config.MongoDbContextInitializer;
//import br.com.despesas.despesas.model.Despesa;
//import br.com.despesas.despesas.repository.DespesaRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//@SpringBootTest
//@ExtendWith(SpringExtension.class)
//@AutoConfigureMockMvc
//@ContextConfiguration(initializers = MongoDbContextInitializer.class)
//public class DespesaRepositoryTest {
//
//    public static MongoDbContainer mongoDbContainer;
//
//    @Autowired
//    DespesaRepository respository;
//
//    @BeforeAll
//    public static void setup(){
//        mongoDbContainer = new MongoDbContainer();
//        mongoDbContainer.start();
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
//
//    @Test
//    @DisplayName("Deve criar uma despesa")
//    public void createDespesaTest() {
//        Despesa despesa = createValidDespesa();
//
//        Despesa savedDespesa = respository.save(despesa);
//
//        Assertions.assertThat(savedDespesa.getId()).isNotNull();
//    }
//}
