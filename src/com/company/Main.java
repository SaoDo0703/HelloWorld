package com.company;

import java.util.Scanner;

 class lession1 {

    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lenght:   " );
        int lenght = scanner.nextInt();

        System.out.println("Enter width:   " );
        int width = scanner.nextInt();

        float premeter = (lenght + width)*2 ;
        System.out.println("premeter : " + premeter );

        float area = lenght*width ;
        System.out.println("area = " + area);

        System.out.println("------------------------------");
    }
}

class lession2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter lenght:  " );
        float lenght = scanner.nextInt();

        System.out.println(" Enter width:  " );
        float width = scanner.nextInt();

        System.out.println(" Enter height:  " );
        float height = scanner.nextInt();

        float Sxq = 2*height*(lenght+width) ;
        System.out.println("Sxq : " + Sxq );

        float volume = lenght*width*height ;
        System.out.println("volume : " + volume );

        System.out.println("------------------------------");

    }
}

class lession3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a:  " );
        float a = scanner.nextFloat();

        System.out.println(" Enter b:  " );
        float b = scanner.nextFloat();

        System.out.println(" Enter c:  " );
        float c = scanner.nextFloat();


    }
}



