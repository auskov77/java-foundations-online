package ru.itsjava.exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {

//        throw new RuntimeException("My runtime exception");

//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("!!!! Exception. Be careful. !!!!");
////            e.printStackTrace("!!!!!");
//        }

//        try {
//            System.out.println("Begin");
////            throw new Exception();
//        } catch (Exception e) {
//            System.out.println("CATCH");
////            e.printStackTrace("!!!!!");
//        } finally {
//            System.out.println("FINALLY");
//        }
//
//        System.out.println("END");

//        try {
//            throw new RuntimeException();
//        } catch (RuntimeException runtimeException) {
//            System.out.println("RuntimeException");
//        } catch (Throwable throwable){
//            System.out.println("Throwable");
//        }

        Calculator calculator = new Calculator();

        System.out.println("calculator.division(5,3) = " + calculator.division(5, 3));
        try {
            System.out.println("calculator.division(5,0) = " + calculator.division(5, 0));

        } catch (CalculatorException ce) {
            System.out.println("Вы вели что-то не то");
            ce.printStackTrace();
        }

    }
}
