package com.niit.test;

import lombok.*;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 辣鸡徐江 on 2018/9/6.
 */
//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
@Data
@Configuration //这个类的对象可以被注入
public class Student {
    private String name ;
    private int age ;
    private String male ;
    private String studentNo;
}
