package com.base.modifier;
public class a {
    public static void main(String[] args) {
        aa a1 = new aa();
        a1.aaaa();
        //虽然aaa()方法是private，但是可以通过一个public方法调用同类的private
        //即可完成在同包和不同包访问private
        //原理是在new这个类的时候，已经在栈内开辟了一块空间
        // 我们在访问public时已经进入了这片区域，从public访问同类的prviate是可行的
        //a1.aaa();错误的
    }
}

class aa {
    private void aaa() {
        System.out.println("私有");
    }

    public void aaaa() {
        aaa();
        //System.out.println("aaaa");
    }
}
