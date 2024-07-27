import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);
        HelloWorld helloWorld1 = applicationContext.getBean(HelloWorld.class);
        helloWorld1.getMessage();
        System.out.println("Сравнение HelloWorld: " + (helloWorld1 == applicationContext.getBean(HelloWorld.class))); // Должно вернуть true
        System.out.println("Сравнение Cat: " + (cat1 == cat2)); // Должно вернуть false
    }
}