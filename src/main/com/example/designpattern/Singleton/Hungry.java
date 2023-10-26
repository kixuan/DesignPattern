package main.com.example.designpattern.Singleton;

/**
 * @author kixuan
 * @version 1.0
 * 饿汉式创建单例对象
 */
public class Hungry {
    //创建 SingleObject 的一个对象
    private static Hungry instance = new Hungry();

    //让构造函数为 private，这样该类就不会被实例化
    private Hungry() {
    }

    //获取唯一可用的对象
    public static Hungry getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        // 饿汉式创建单例对象
        Hungry hungry = Hungry.getInstance();
        System.out.println(hungry);
    }
}
