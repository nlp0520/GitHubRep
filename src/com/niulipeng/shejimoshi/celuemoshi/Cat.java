package com.niulipeng.shejimoshi.celuemoshi;

/**
 * @Auther:niulipeng
 * @Date:2021/2/4
 * @Description:com.niulipeng.shejimoshi.celuemoshi
 * @Version:1.0
 */
public class Cat implements Compareble<Cat>{

    int age;
    String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Cat t) {
        if(this.age<t.age){
            return -1;
        }else if(this.age>t.age){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
