package ua.beloff;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Police {
	
	@Pointcut("execution(* ua.beloff.Superhero.brag(..))")
	public void bragging(){}


	@AfterReturning("bragging()")
	public void thank(){ 
		System.out.println("Police is thankful!");
	}
	
	@AfterThrowing("bragging()")
	public void shock(){ 
		System.out.println("Police is shocked!");
	}
}
