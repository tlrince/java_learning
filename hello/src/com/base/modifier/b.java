package com.base.modifier;

public class b {
    private void bbb() {
        System.out.println("私有");
    }

    public void bbbb() {
        bbb();
        //System.out.println("aaaa");
    }
}
