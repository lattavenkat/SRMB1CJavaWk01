package com.srm.cjava.Test;

public class CustomException {
    class InvalidProductException extends Exception {
        public InvalidProductException(String s) {

            super(s);
        }
    }
    void productCheck(int weight) throws InvalidProductException {
        if (weight < 100) {
            throw new InvalidProductException(" Invalid Product Weight");
        }
    }
    public static void main(String args[]) {
        CustomException obj = new CustomException();
        try {
            obj.productCheck(60);
        } catch (InvalidProductException ex) {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}
