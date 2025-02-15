package com.itheima.hello;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字: ");
        String name = scanner.next();
        System.out.println(name);
    }
}
