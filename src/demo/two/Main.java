package demo.two;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/demo/two/applicationContext.xml");
				
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
				
		// Call methods on the bean
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getFortune());
				
		// Close the application context
		context.close();
	}

}
