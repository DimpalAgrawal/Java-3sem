/*Created by intellij IDEA
 *Name:Dimpal Agrawal
 *Date:23-July-2020
 *Time:2:16
 *File:LabTask3.java
 */

//create a program in java to demostrate dec,inti,and usage of local variables


public class LabTask3 {
    public int b = 10; //local variables not use access specifiers
    int a = 10; //local variables are not used outside a method

    public static void main(String[] args) {
        int c = 10; //local variable
    }

    void fun() {
        int a = 10; //within method can be used
    }
}
