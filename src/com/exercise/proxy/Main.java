package com.exercise.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Desc:
 *
 * @author lijt
 * Created on 2025/1/18
 * Email: lijt@eetrust.com
 */
public class Main {
    public static void main(String[] args) {


        ApiService proxy = proxy(ApiService.class);
        proxy.request();
        proxy.response();
    }

    @SuppressWarnings({"unchecked"})
    public static <T> T proxy(final Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), new Class<?>[]{clazz}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Method called: " + method.getName());
                if (args != null) {
                    for (Object arg : args) {
                        System.out.println("Arg: " + arg);
                    }
                }

                // 模拟方法返回值
                if (method.getReturnType() == String.class) {
                    return "Proxy Response for " + args[0];
                }
                return null;
            }
        });
    }

    static class ProxyHandler implements InvocationHandler {

        private final Object target;

        public ProxyHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // 前置增强
            System.out.println("Before method: " + method.getName());

            // 调用目标对象的方法
            Object result = method.invoke(target, args);

            // 后置增强
            System.out.println("After method: " + method.getName());
            return result;
        }
    }

}
