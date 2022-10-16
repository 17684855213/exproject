package com.knn.jvm;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName MyClassLoader
 * @Description TODO
 * @Author kangningning
 * @Date 2022/10/16 11:21 下午
 * @Version 1.0
 */
@Slf4j
public class MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        throw new ClassNotFoundException(name);
    }



}
