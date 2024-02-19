package Pegas.services;
//D:\backup\4\Java_Core_Seminar1\src\main>javac -sourcepath ./java -d out java/Pegas/task1/Program.java
//D:\backup\4\Java_Core_Seminar1\src\main>java -classpath ./out Pegas.task1.Program
/**
 * simple util class
 * @author me
 */
public class Calculator {
    /**
     * sub function
     * @param a - reduced
     * @param b - subtractible
     * @return - difference
     */

    public static int sub(int a, int b){return a-b;}

    /**
     * summ function
     * @param a - first summand
     * @param b - second summand
     * @return - summ
     */
    public static int add(int a, int b){return a+b;}
    /**
     * mult function
     * @param a - first multiplier
     * @param b - second multiplier
     * @return - product
     */
    public static int mul(int a, int b){return a*b;}

    /**
     *  div function
     * @param a - divisible
     * @param b - disivor
     * @return - quotient
     */
    public static int div(int a, int b){return a/b;}
}
