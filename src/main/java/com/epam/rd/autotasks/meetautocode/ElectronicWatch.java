package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int ss = seconds % 60;
        int allMinutes = seconds / 60;
        int mm = allMinutes % 60;
        int h = allMinutes / 60;

        while(h>23){
            if(h==24){ h = 0; break;}
            h-=24;
        }

        System.out.format("%d:%02d:%02d",h,mm,ss);
    }
}
