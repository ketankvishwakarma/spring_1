package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.aspect.LoggingAspect;
import spring.aop.service.ShapeService;

public class AopMain 
{
	public static void main(String[] args) 
	{	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("aop.xml");
		ShapeService shapeService=ctx.getBean("shapeService",ShapeService.class);
		shapeService.getCircle().setName("Dummy Circle!!");
		System.out.println(shapeService.getCircle().getName());	
		System.out.println(shapeService.getTriangle().getName());
	}
}
