package com.assignment;

import java.util.Objects;

public class ZoologicalThemePark extends AmusementPark {
    private static String[] majorAttractionsArr = {"Dolphin", "Lion", "Ostrich"};
    private int noOfPeople;
    private String majorAttraction;

    public ZoologicalThemePark(String location, int entryFee, String majorAttraction, int noOfPeople) {
        super(location, entryFee);
        this.majorAttraction = majorAttraction;
        this.noOfPeople = noOfPeople;

    }

    @Override
    public String toString() {
        return "ZoologicalThemePark(" + "location: " + this.getLocation() + ", majorAttraction: "
                + this.majorAttraction + ", entryFee: " + this.getEntryFee() + ", noOfPeople: "
                + this.noOfPeople + ")";
    }

    public String getMajorAttraction() {
        return majorAttraction;
    }

    public Boolean validateRide() {
        for (int index = 0; index < ZoologicalThemePark.majorAttractionsArr.length; index++) {
            if (ZoologicalThemePark.majorAttractionsArr[index].equals(majorAttraction)) {
                return true;
            }
        }
        return false;
    }

    //To Trainee
    public void calculateBillAmount() {
        float additionalCost = 0;
        float totalAmount = 0;
        //Implement your logic here
        if (validateRide() && Objects.nonNull(identifyAmusementPark()) && this.noOfPeople > 0) {
            switch (majorAttraction) {
                case "Dolphin" -> additionalCost = 100 * noOfPeople;
                case "Lion" -> additionalCost = 200 * noOfPeople;
                case "Ostrich" -> additionalCost = 150 * noOfPeople;
            }
            totalAmount = getEntryFee() + additionalCost;
            setFinalAmount(totalAmount);
            generateId();
        } else {
            setFinalAmount(-1.0f);
            setTicketId("NA");
        }
    }
}