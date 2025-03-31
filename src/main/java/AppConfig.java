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

    @Bean(value = "cat")
    @Scope(value = "prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setAge(2);
        cat.setName("Cat");
        return cat;
    }
}