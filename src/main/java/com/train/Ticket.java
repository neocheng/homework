package com.train;

import java.util.Scanner;

public class Ticket {

    public void getTotal() {
        System.out.println("*** This JAVA ***");
        System.out.println("Please enter number of tickets:");
        int iTickets = new Scanner(System.in).nextInt();
        if(iTickets == -1)
            System.exit(0);
        System.out.println("How many round-trip tickets:");
        int iRoundTtrip = new Scanner(System.in).nextInt();

        if (iTickets == 0 || iRoundTtrip > iTickets) {
            showAgain();
        } else {
            System.out.println("Total tickets: " + iTickets);
            System.out.println("Round-trip: " + iRoundTtrip);
            System.out.println("Total: " + getiTotalPrice(iTickets, iRoundTtrip));
            getTotal();
        }
    }

    private int getiTotalPrice(int tickets, int roundTrip) {
        return  ((tickets - roundTrip) * 1000) + ((roundTrip * 9 * 2000) / 10);
    }

    private void showAgain() {
        System.out.println("*** error, please enter again ***");
        getTotal();
    }
}
