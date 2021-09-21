package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter some letters: ");
        String letr = input.nextLine();
        int letrnumb=0;
        for (char letter= 'a'; letter <= 'z'; letter++){
            for(int i = 0; i< letr.length(); i++){
                if(letr.charAt(i) == letter){
                    letrnumb++;
                }
            }
            if (letrnumb > 0){
                System.out.println(letter +""+ letrnumb);
                letrnumb= 0;
            }


        }





    }
}
