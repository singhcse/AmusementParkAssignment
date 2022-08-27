package com.assignment;

public class Main {
    public static void main(String[] args) {
        WaterThemePark obj = new WaterThemePark("PalmerStreet", "The-Pirate", 2000, 70.0f);
        obj.calculateBillAmount();
        System.out.println("The Ticket Fare is:" + obj.getFinalAmount());
        System.out.println("The Ticket Id is:" + obj.getTicketId());

        System.out.println("----------------------------------------");

        ZoologicalThemePark obj1 = new ZoologicalThemePark("PalmerStreet", 1000, "Dolphin", 4);
        obj1.calculateBillAmount();
        System.out.println("The Ticket Fare is:" + obj1.getFinalAmount());
        System.out.println("The Ticket Id is:" + obj1.getTicketId());

    }
}
