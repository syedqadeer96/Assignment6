package com.company;
import java.util.Scanner;


public class SixC {
    public SixC(String var){
        //printing entered value every time paramaterized constructor called
        System.out.println("Entered Value: "+var);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //declaring object references array
        SixC[] array=new SixC[n];
        for(int i=0;i<n;i++){
            String input=sc.next();
            //storing object references
            array[i]=new SixC(input);
        }

    }
}