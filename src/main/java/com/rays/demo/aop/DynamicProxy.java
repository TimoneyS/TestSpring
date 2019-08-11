package com.rays.demo.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    
    interface I {
        public void speak();
    }
    
    static class A implements I {
        public void speak() {
            System.out.println("A speak");
        }
    }
    
    public static class Invok implements InvocationHandler {
        Object inner;
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("befor " + method.getName());
            return method.invoke(inner, args);
        }
    } 
    
    public static void main(String[] args) {
        Invok invok = new Invok();
        invok.inner = new A();
        I a = (I) Proxy.newProxyInstance(I.class.getClassLoader(), new Class<?>[] {I.class}, invok);
        a.speak();
    }
    
}
