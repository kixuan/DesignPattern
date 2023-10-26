package main.com.example.designpattern.Singleton;

/**
 * @author kixuan
 * @version 1.0
 * 懒汉式创建单例对象
 */
public class LazyMan {
    private static LazyMan instance;

    private LazyMan() {
        System.out.println(Thread.currentThread().getName() + " OK");
    }

    // 懒汉式创建单例对象
    public static synchronized LazyMan getInstance() {
        if (instance == null) {
            instance = new LazyMan();
        }
        return instance;
    }


    // 多线程并发测试
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(
                    LazyMan::getInstance
            ).start();
        }
    }
}
