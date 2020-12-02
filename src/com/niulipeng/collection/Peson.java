package com.niulipeng.collection;

import java.util.Objects;

/**
 * @Auther:niulipeng
 * @Date:2020/12/2
 * @Description:com.niulipeng.collection
 * @Version:1.0
 */
    
public class Peson implements Comparable{
    private int age;
    private String name;

    public Peson(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Peson peson = (Peson) o;
        return age == peson.age &&
                Objects.equals(name, peson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Peson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
