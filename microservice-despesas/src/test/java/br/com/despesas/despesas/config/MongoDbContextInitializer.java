//package br.com.despesas.despesas.config;
//
//import br.com.despesas.despesas.api.model.DespesaRepositoryTest;
//import org.springframework.boot.test.util.TestPropertyValues;
//import org.springframework.context.ApplicationContextInitializer;
//import org.springframework.context.ConfigurableApplicationContext;
//
//public class MongoDbContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
//
//    @Override
//    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
//
//        TestPropertyValues values = TestPropertyValues.of(
//                "spring.data.mongodb.host=" + DespesaRepositoryTest.mongoDbContainer.getContainerIpAddress(),
//                "spring.data.mongodb.port=" + DespesaRepositoryTest.mongoDbContainer.getPort()
//        );
//        values.applyTo(configurableApplicationContext);
//    }
//}
