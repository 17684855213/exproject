package com.knn.jvm;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.openjdk.jol.info.ClassLayout;

/**
 * @ClassName SystemLayOutTest
 * @Description TODO
 * @Author kangningning
 * @Date 2022/10/19 9:47 下午
 * @Version 1.0
 */
public class ClassLayOutTest {

    public static void main(String[] args) {
        ClassLayout layout = ClassLayout.parseInstance(new Object());
        System.out.println(layout.toPrintable());

        System.out.println();
        ClassLayout layout1 = ClassLayout.parseInstance(new int[]{});
        System.out.println(layout1.toPrintable());

        System.out.println();
        ClassLayout layout3 = ClassLayout.parseInstance(new ClassLayOutTest());
        System.out.println(layout3.toPrintable());
    }



}
