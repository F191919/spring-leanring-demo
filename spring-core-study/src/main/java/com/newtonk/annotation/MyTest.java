package com.newtonk.annotation;

import java.lang.reflect.Field;

/**
 * Created by newtonk on 2016/11/19.
 */
public class MyTest {
    @com.newtonk.annotation.Try(color="白色")
    private static String color;

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.newtonk.annotation.MyTest");
//       boolean result =  c.isAnnotationPresent(Try.class);
//        System.out.println(result);
        Field[] field = c.getDeclaredFields();
        for (Field field1 : field) {
            boolean result =  field1.isAnnotationPresent(com.newtonk.annotation.Try.class);
            System.out.println(result);
            if (result) {
                com.newtonk.annotation.Try a = field1.getAnnotation(com.newtonk.annotation.Try.class);
                System.out.println(a.color());
            }
        }
    }
}
