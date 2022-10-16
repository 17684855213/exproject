package com.knn.jvm;

import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @ClassName TomcatClassLoad
 * @Description TODO
 * @Author kangningning
 * @Date 2022/10/17 12:37 上午
 * @Version 1.0
 */
public class TomcatClassLoad {
    public static void main(String[] args) {
//        tomcat由于自定义的类加载器。spring会被放在自定义的类加载器里加载。不同的web应用会创建新的自定义类加载器去加载Spring
//        所以tomcat打破的双亲委派机制，但是实现了不同应用之间的spring版本的隔离。
        System.out.println(SpringBootApplication.class.getClassLoader()); //sun.misc.Launcher$AppClassLoader@18b4aac2

    }
}
