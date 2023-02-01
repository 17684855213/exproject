package com.knn.jvm;

/**
 * @ClassName MethodAreaTest
 * @Description TODO
 * @Author kangningning
 * @Date 2022/11/2 11:03 下午
 * @Version 1.0
 */
public class MethodAreaTest {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String s  = new StringBuilder("计算机").append("技术").toString();//"计算机"和"技术"会出现在常量池中。但"计算机技术"并不会出现在常量池中
//        String s1 = "计算机技术"; 加了这步，导致常量池中出现"计算机技术"，会使结果为false
        System.out.println(s==s.intern());
//        s.intern 会返回常量池的"计算机技术"，没有就返回堆中的。因为没有。所以堆和堆的"计算机技术"相比为true这个卡吗，这个就不卡啊 。怎么回事小老弟 啊嗯这个为什么不卡啊啊艹啊
    }
}
