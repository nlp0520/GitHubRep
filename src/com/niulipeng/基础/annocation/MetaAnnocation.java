package com.niulipeng.基础.annocation;

import java.lang.annotation.*;

/**
 * @Auther:niulipeng
 * @Date:2020/12/16
 * @Description:com.niulipeng.基础.annocation
 * @Version:1.0
 * 注解
 */
@SuppressWarnings(value = "all")
public class MetaAnnocation {
//    @MyAnnocation(name = "niu",age = 23,likes = {"java","python"})
    @MyAnnocation
    private void test(){}

}
//target用来声明当前自定义的注解适合适用于什么地方类，方法，变量，包。。。
@Target(ElementType.METHOD)
//Retention用来表示当前注解适用于什么环境：源码，类，运行环境级别，一般都是运行环境
@Retention(RetentionPolicy.RUNTIME)
//表示是否将注解展示在javadoc文件内
@Documented
//表示当前注解是否能被继承
@Inherited
@interface MyAnnocation{
    //定义的方式看起来像是方法，但是实际上使用注解的时候填写的参数名称，默认的名称是value
    //自定义注解中填写的所有方法都需要在使用注解的时候，添加值。因此包含默认值
    String name() default "niu";
    int age() default 22;
    String[] likes() default {"a","b"};


}
