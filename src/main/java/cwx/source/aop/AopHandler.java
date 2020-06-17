package cwx.source.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author chenweixuan
 * @date 2020/6/16
 */
@Aspect
@Component
public class AopHandler {

    @Around("@annotation(cwx.source.aop.JoinPoiint)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
        return "AopHandler!";
    }

}
