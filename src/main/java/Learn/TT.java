package Learn;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/6 10:22
 */
//@Aspect
//@Component
public class TT {
//    @Pointcut("execution(* Learn.Girl.doXXX(String)) && bean(aym) && args(location)")
//    public void doXXX(String location) {
//    }

    //@Before("doXXX(location)")
    public void BeforeDo(String location) {
        System.out.println("Go to "+location);
        System.out.println("戴上 TT");
    }

    //@AfterReturning("doXXX(location)")
    public void AfterDo(String location) {
        System.out.println("扔掉 TT");
    }

    //@AfterThrowing("doXXX(location)")
    public void AfterError(String location) {
        System.out.println("吃  Medicine");
    }
//    @Around("doXXX(location)")
    public void Enjory(ProceedingJoinPoint point,String location)
    {
        try {
            System.out.println("Go to "+location);
            System.out.println("戴上 TT");
            point.proceed();
            System.out.println("扔掉 TT");
        } catch (Throwable throwable) {
            System.out.println("吃 Medicine");
        }
    }
}
