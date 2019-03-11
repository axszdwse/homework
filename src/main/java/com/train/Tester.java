package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter number of tickets: ");
        Scanner scanner=new Scanner(System.in);
        int tickets=scanner.nextInt();
        System.out.println("How many round-trip tickets: ");
        int round=scanner.nextInt();
        Ticket tic=new Ticket(tickets,round);
        tic.print();
    }
}
