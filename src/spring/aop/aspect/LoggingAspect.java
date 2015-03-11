package spring.aop.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	static Logger log=Logger.getLogger("consoleAppender");
	
	@Before("allGetters()")
	public void loggingAdvice(JoinPoint jp)
	{
		log.info(jp.getTarget());
	}
	
	@Before("allGetters()")
	public void loggingAdvice_2(JoinPoint jp)
	{
		log.info(jp.toString());
	}
	
	@Before("args(name)")
	public void allString(String name){
		log.info("Method Called: "+name);
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
}
