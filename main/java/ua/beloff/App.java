package ua.beloff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/SpringBean.xml");
		Superhero obj = (Superhero) context.getBean("Batman");
		obj.brag();
		obj.showVillains();
		}

}