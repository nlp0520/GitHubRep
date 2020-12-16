package com.niulipeng.基础.lambda;

/**
 * @Auther:niulipeng
 * @Date:2020/12/16
 * @Description:com.niulipeng.基础.lambda
 * @Version:1.0
 */
    
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
