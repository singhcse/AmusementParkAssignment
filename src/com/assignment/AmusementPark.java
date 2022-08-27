package com.assignment;

import java.util.Arrays;

abstract public class AmusementPark {
    public static String[][] amusementParkNameArr = {{"Wonderla", "BlackThunder", "Disney"}, {"NewStreet", "OldSquare", "PalmerStreet"}};
    private int entryFee;
    private String location;

    private String ticketId;
    private float finalAmount;
    private static int counter = 1000;

    public AmusementPark(String location, int entryFee) {
        this.location = location;
        this.entryFee = entryFee;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getLocation() {
        return this.location;
    }

    public int getEntryFee() {
        return this.entryFee;
    }

    public void setFinalAmount(float finalAmount) {
        this.finalAmount = finalAmount;
    }

    public float getFinalAmount() {
        return this.finalAmount;
    }

    //To Trainee
    public void generateId() {
        this.setTicketId("T" + ++counter);
    }

    //To Trainee
    public String identifyAmusementPark() {
        String amusementPark = "PalmerStreet";

        //Implement your logic here
        int locationIndex = Arrays.asList(amusementParkNameArr[1]).indexOf(amusementPark);

        //not setting amusementPark to null cause there is no need
        return locationIndex == -1 ? null : amusementParkNameArr[0][locationIndex];
    }

    public abstract void calculateBillAmount();
}

