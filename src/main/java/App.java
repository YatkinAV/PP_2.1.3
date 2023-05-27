import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld_1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld beanHelloWorld_2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(beanHelloWorld_1 == beanHelloWorld_2);

        Cat beanCat_1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat_2 = (Cat) applicationContext.getBean("cat");

        System.out.println(beanCat_1 == beanCat_2);
    }
}