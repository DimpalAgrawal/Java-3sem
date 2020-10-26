/*Created by intellij IDEA
 *Name:Dimpal Agrawal
 *Date:23-July-2020
 *Time:2:15
 *File:LabTask4.java
 */

//create a program in java to demostrate dec,int,and usage of static and non static


public class LabTask4 {
    static int a = 10; //static variable
    private static int c = 90; //we use access specifiers with static variables
    int b = 20; //non-static variable

    public static void main(String[] args) {
        //static variables can be used directly and with object also
        System.out.println(a);
    }
}
