package com.company;


public class Main {

    public static void main(String[] args) {

        int valoare = 3;
        if (valoare ==1) {
            System.out.println("Valoarea este 1");
        }else if (valoare ==2) {
            System.out.println("Valoarea este 2");
        }else {
            System.out.println("Valoarea nu este 1 sau 2");
        }
        int switch1 =1; // switch ii nume rezervat de java change""

        switch (switch1){
            case 1:
                System.out.println("Valoarea este 1");
                break;
            case 2:case 4:

                System.out.println("Valoarea este 2");
                break;
            default:
                System.out.println("Valoarea este 1 sau 2");
        }
        char switchChar ='F';
        switch (switchChar) {
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("Nu este ");
                break;
            default:
                System.out.println("Rezultatul este litera " + switchChar);
        }

        String luna = "Ianuarie";
        switch (luna){
            case "Ianuarie":
                System.out.println("Ianuarie");
                break;
            default:
                System.out.println("Alta Luna");
        }
    }


}
