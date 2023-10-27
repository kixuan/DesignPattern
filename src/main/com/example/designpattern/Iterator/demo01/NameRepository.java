package main.com.example.designpattern.Iterator.demo01;

import java.util.Iterator;

public class NameRepository implements ConcreteAggreage {
    public String[] names = {"Robert", "John", "Julie", "Lora"};

    /**
     * 返回一个迭代器，遍历
     */
    @Override
    public nameIterator createIterator() {
        return new nameIterator(names);
    }


    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}