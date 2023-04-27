package com.felix.spring6.aop.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName:LogAspect
 * Package:com.felix.spring6.aop.annoaop
 * Description:
 *
 * @Author FelixT
 * @Create 2023/3/22 14:57
 * @Version 1.0
 */
//切面类
@Component //ioc容器
public class LogAspect {

    //前置通知
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->前置通知，方法名称："+methodName+"，参数："+Arrays.toString(args));
    }

    //后置通知
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->后置通知，方法名称："+methodName);
    }

    //返回通知
    public void afterReturningMethod(JoinPoint joinPoint,Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名称："+methodName+"，返回结果："+result);
    }

    //异常
    public void afterThrowingMethod(JoinPoint joinPoint,Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名称："+methodName+"，异常信息："+ex);
    }

    //环绕
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String argString = Arrays.toString(args);
        Object result = null;
        try {
            System.out.println("环绕通知==目标方法之前执行");

            //调用目标方法
            result = joinPoint.proceed();

            System.out.println("环绕通知==目标方法返回值之后");
        }catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("环绕通知==目标方法出现异常执行");
        } finally {
            System.out.println("环绕通知==目标方法执行完毕执行");
        }
        return result;
    }

    //重用切入点表达式
    @Pointcut(value = "execution(* com.felix.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void pointCut() {}

}
