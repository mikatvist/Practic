package Inheritance.BrowserTask.dodik;

import today.Tree;

public class Test extends Practice1 {
    public void methodB(){
        System.out.println("A");
    }

    public static void main(String[] args) {
        Practice1 obj = new Practice1();
        obj.method1();
        Test obj2 =  new Test();
        obj2.methodB();
    }
}

