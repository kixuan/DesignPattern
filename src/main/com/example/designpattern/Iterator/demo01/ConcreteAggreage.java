package main.com.example.designpattern.Iterator.demo01;


public interface ConcreteAggreage {
    /**
     * 返回一个迭代器，遍历
     */
    nameIterator createIterator();
}