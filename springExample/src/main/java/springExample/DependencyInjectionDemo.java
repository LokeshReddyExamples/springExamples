package springExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionDemo {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		DataAccessBean dataAccessBean = (DataAccessBean) context.getBean("dataBean");
		
		System.out.println(dataAccessBean);
		
	}
	

}
