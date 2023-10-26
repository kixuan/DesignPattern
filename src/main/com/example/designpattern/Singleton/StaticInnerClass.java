package main.com.example.designpattern.Singleton;


/**
 * @author kixuan
 * @version 1.0
 * 静态内部类创建单例对象
 */
public class StaticInnerClass {
    private static class SingletonHolder {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    private StaticInnerClass() {
    }

    public static final StaticInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}