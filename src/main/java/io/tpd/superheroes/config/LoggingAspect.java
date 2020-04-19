package io.tpd.superheroes.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("@annotation(Loggable)")
    public void executeLogging(){

    }

    @Before("executeLogging()")
    public  void logMethodCalss(JoinPoint joinPoint){
        StringBuilder message = new StringBuilder("Message  ");
        message.append(joinPoint.getSignature().getName());
        Arrays.asList(joinPoint.getArgs()).forEach(
                a -> message.append(" method arguments are ").append(a).append(" -- "));

        LOGGER.info(message.toString());
    }

}
