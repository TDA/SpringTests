/**
 * Created by schandramouli on 9/8/15.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppHello {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        HelloSpring obj = (HelloSpring) context.getBean("helloWorld");

        obj.getSai();
        obj.getMessage();
    }
}
