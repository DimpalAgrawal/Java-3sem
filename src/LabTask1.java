/*Created by intellij IDEA
 *Name:Dimpal Agrawal
 *Date:23-July-2020
 *Time:2:15
 *File:LabTask1.java
 */
//Create a program in java that print the following table

public class LabTask1 {
    public static void main(String[] args) {
        System.out.printf("%13s\t%13s\t%13s\t%13s",
                "Data Type", "size in bits", "size in byte", "Range");
        System.out.println();
        System.out.printf("%13s\t%13d\t%13d\t%13s",
                "byte", Byte.SIZE, Byte.SIZE / 8, Byte.MIN_VALUE + "to" + Byte.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13d\t%13d\t%13s",
                "long", Long.SIZE, Byte.SIZE / 8, Byte.MIN_VALUE + "to" + Byte.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13d\t%13d\t%13s",
                "short", Short.SIZE, Short.SIZE / 8, Short.MIN_VALUE + "to" + Short.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13d\t%13d\t%13s",
                "int", Integer.SIZE, Integer.SIZE / 8, Integer.MIN_VALUE + "to" + Integer.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13d\t%13d\t%13s",
                "float", Float.SIZE, Float.SIZE / 8, Float.MIN_VALUE + "to" + Float.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13d\t%13d\t%13s",
                "double", Double.SIZE, Double.SIZE / 8, Double.MIN_VALUE + "to" + Double.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13s\t%13s\t%13s",
                "boolean", "no range", "no range", Boolean.TRUE + "to" + Boolean.FALSE);


    }
}