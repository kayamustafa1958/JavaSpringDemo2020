import Interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

import java.util.Arrays;

public class CybertekApp {
    public static void main(String[] args) {
        BeanFactory container=new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor=(Mentor)container.getBean("fullTimeMentor");
        mentor.createAccount();

        Mentor mentor2=(Mentor)container.getBean("partTimeMentor"); // it returns Object and we need to cast it .
        //Object is the parent of all object
        mentor2.createAccount();

        Mentor mentor3=container.getBean("fullTimeMentor",Mentor.class);



        ApplicationContext container2=new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor4=(Mentor)container2.getBean("fullTimeMentor");
        mentor4.createAccount();


    }
}
