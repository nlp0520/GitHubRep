package com.niulipeng;

/**
 * @Auther:niulipeng
 * @Date:2020/12/15
 * @Description:com
 * @Version:1.0
 * 查看当前项目集成的JDK版本File->project-sdk
 * IDEA已经默认集成了Maven setting->Build..->Build Tools->Maven
 * 官网地址：http://maven.apache.org/    DownLoad、
 * 将解压后的文件bin目录注册到计算机的环境变量Path下然后cmd执行命令mvn;执行mvn help:system命令就会出现集成的.m2文件
 * conf目录下  一个非常重要的文件核心配置文件settings.xml
 *
 * maven仓库管理的是jar包的坐标：分为本地仓库和远程仓库（mvnrepository.com）
 * 坐标就是xml配置如：
 * <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
 * <dependency>
 *     <groupId>org.mybatis</groupId>
 *     <artifactId>mybatis</artifactId>
 *     <version>3.4.0</version>
 * </dependency>
 * 找到setting.xml 里的修改本地仓库配置<localRepository>F:\NEWWORKSPACE</localRepository>
 * 再配置一个镜像仓库找到setting.xml文件下mirrors标签粘贴如下配置：
 *  <mirror>
 *         <!--指定镜像ID可自己命名-->
 *         <id>nexus-aliyun</id>
 *         <!--匹配中央仓库，阿里云的中央仓库，不可以自己起名，必须这么写-->
 *         <mirrorOf>central</mirrorOf>
 *         <!--指定镜像名称，可自己改名-->
 *         <name>Nexus aliyun</name>
 *         <!--指定镜像路径地址-->
 *         <url>http://maven.aliyun.com/nexus/content/groups/public</url>
 *     </mirror>
 * 优先级：本地仓库-》配置文件中指定的仓库-》是否配置镜像仓库（是：镜像仓库；否：中央仓库）-》apache中央仓库
 *
 * 配置JDK：setting.xml找到profile标签配置：
 * <profile>
 *     <!--要用的JDK版本-->
 *       <id>jdk-1.7</id>
 *     <!--开启jdk的使用-->
 *       <activation>
 *         <activeDefault>true</activeDefault>
 *         <jdk>1.7</jdk>
 *       </activation>
 *
 *       <properties>
 *         <!--配置编译器信息-->
 *         <maven.compiler.source>1.7</maven.compiler.source>
 *         <maven.compiler.target>1.7</maven.compiler.target>
 *         <maven.compiler.compilerVersion>1.7</maven.compiler.compilerVersion>
 *       </properties>
 *     </profile>
 *
 */
    
public class Maven {
}
