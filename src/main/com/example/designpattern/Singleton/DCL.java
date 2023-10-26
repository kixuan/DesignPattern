package main.com.example.designpattern.Singleton;

/**
 * @author kixuan
 * @version 1.0
 * 双检锁(DCL)创建单例对象
 */
public class DCL {
    // 双检锁(DCL)创建单例对象
    // volatile关键字保证了变量的可见性，防止指令重排
    private volatile static DCL instance;

    private DCL() {
    }

    public static DCL getInstance() {
        if (instance == null) {
            synchronized (DCL.class) {
                if (instance == null) {
                    instance = new DCL();
                }
            }
        }
        return instance;
    }

    // 多线程并发测试
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(
                    DCL::getInstance
            ).start();
        }
    }
}
