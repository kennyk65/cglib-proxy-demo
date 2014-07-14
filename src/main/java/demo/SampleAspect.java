package demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SampleAspect {

	//	This advice should match every method on the "Target" object:
	
	@Around("execution(* *Method(..))")
	public Object someAdvice(ProceedingJoinPoint pjp) throws Throwable {
		Object value = pjp.proceed();
		return "from the proxy";
	}
}
