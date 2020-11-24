package com.niulipeng.innerclass;

/**
 * @Auther:niulipeng
 * @Date:2020/11/24
 * @Description:com.niulipeng.innerclass
 * @Version:1.0
 */
    
public class InnerClassDemo {
    private int age;
    private String name;
    public static void main(String[] args) {
        //创建内部类的对象
        InnerClassTest innerClassDemo = new InnerClassDemo().new InnerClassTest();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    class InnerClassTest{
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
