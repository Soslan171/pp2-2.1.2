import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;

    }

    @Bean
    @Scope("prototype") // Бин cat будет создаваться новым при каждом запросе
    public Cat cat() {
        return new Cat("Мурзик", 3);
    }
}