package com.niulipeng.基础.lambda;

/**
 * @Auther:niulipeng
 * @Date:2020/12/16
 * @Description:com.niulipeng.基础.lambda
 * @Version:1.0
 * 自定义Lambda表达式
 * jdk1.8之后注解方式FunctionalInterface
 *
 * Consumer代表一个输入
 * BiConsumer代表两个输入
 * Function代表一个输入一个输出（不同类型）
 * UnaryOperator代表一个输入一个输出（相同类型）
 * BiFunction代表两个输入一个输出（不同类型）
 * BinaryOperator代表两个输入一个输出（相同类型）
 */
//@FunctionalInterface
public interface StudentDao {
    public void insert(Student student);
}
