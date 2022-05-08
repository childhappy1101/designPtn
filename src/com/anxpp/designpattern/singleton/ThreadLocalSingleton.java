package com.anxpp.designpattern.singleton;

public class ThreadLocalSingleton {
    public static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue(){
                    return new ThreadLocalSingleton();
        }
            };
    private ThreadLocalSingleton(){System.out.println("开始创建单例");}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }

}
