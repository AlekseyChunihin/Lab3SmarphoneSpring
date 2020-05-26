import config.AppConfig;
import entity.Smartphone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.SmartphoneService;

public class Main {
    public static void main(String []args){

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SmartphoneService recipService = context.getBean(SmartphoneService.class);
        Smartphone smartphone = (Smartphone)context.getBean("iphone1");
        recipService.save(smartphone);
    }
}
