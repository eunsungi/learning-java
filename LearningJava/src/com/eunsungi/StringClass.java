package com.eunsungi;

public class StringClass {
    public static void main(String[] args) {
        // String Class
        String name = new String("abc"); // String:class, name:object
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));

        String code = "a";
        System.out.println(name.contains(code));

        String fruit = "apple";
        System.out.println(fruit);

        System.out.println(fruit.equals(code));
    }
}
