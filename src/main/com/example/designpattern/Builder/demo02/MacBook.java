package main.com.example.designpattern.Builder.demo02;

/**
 * 具体产品者
 */
public class MacBook extends Computer {


    protected MacBook() {
    }

    @Override
    public void setOs() {
        mOs = "Mac OS X 12";
    }
}