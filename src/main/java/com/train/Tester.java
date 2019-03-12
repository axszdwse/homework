package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int tickets = 0;
        while (tickets != -1) {
            System.out.print("Please enter number of tickets:");
            Scanner scanner = new Scanner(System.in);
            tickets = scanner.nextInt();
            if(tickets==-1){
                break;
            }
            System.out.print("How many round-trip tickets:");
            int round = scanner.nextInt();
            Ticket tic = new Ticket(tickets, round);
            tic.print();
        }
    }
}
