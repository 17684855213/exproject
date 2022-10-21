package com.knn.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName jvisualvm
 * @Description TODO
 * @Author kangningning
 * @Date 2022/10/18 10:20 下午
 * @Version 1.0
 */
public class jvisualvm {
    public static void main(String[] args) {
//        jvm自带的调优工具jvisulvm
        List<jvisualvm> jvisualvmList = new ArrayList<>();
        while (true){
            jvisualvmList.add(new jvisualvm());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
