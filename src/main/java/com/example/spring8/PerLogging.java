package com.example.spring8;


import java.lang.annotation.*;

/*
* 이 에노테이션 성능을 정의
* */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)//source로 사용하면 한번 사용하고 사라짐 기본값인 class사용하는 것이 좋음
public @interface PerLogging {
}
