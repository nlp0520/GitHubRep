package com.niulipeng.基础.lambda;

/**
 * @Auther:niulipeng
 * @Date:2020/12/16
 * @Description:com.niulipeng.基础.lambda
 * @Version:1.0
 */
    
public class Test {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao() {
            @Override
            public void insert(Student student) {
                System.out.println("插入一个学生");
            }
        };

        studentDao.insert(new Student());

        //注解的方式
//        StudentDao studentDao1 = (student)->{
//            System.out.println("student");
//        };
//        studentDao1.insert(new Student());
    }
}
