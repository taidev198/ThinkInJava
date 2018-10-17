package com.company.superme198;

public class TerminationCondition {

  static   class Book{
        boolean checkedOut = false;
        Book(boolean checkOut){
            checkedOut = checkOut;
        }

        void checkIn(){
            checkedOut = false;
        }

        protected void finalize(){
            if (checkedOut){
                System.out.println("Error: checked out");
            }
        }
    }

    public static void main(String...args){
        Book book = new Book(true);
        //proper clean up
        book.checkIn();
        //drop reference, forget to clean up
        new Book(true);
        //force garbage collection & finalization
        System.gc();
    }
}
