package com.assignment;

import java.util.Arrays;
import java.util.Objects;

public class WaterThemePark extends AmusementPark {
    private String themeCategory;
    private float weight;
    public static String[] themeCategoryArr = {"Hurricane-Harbor", "Splashing-Safari", "The-Pirate"};
    public static float[] weightLimitArr = {50.0f, 70.0f, 60.0f};

    public WaterThemePark(String location, String themeCategory, int entryFee, float weight) {
        super(location, entryFee);
        this.themeCategory = themeCategory;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return "WaterThemePark(" + "location: " + this.getLocation() + ", themeCategory: "
                + this.themeCategory + ", entryFee: " + this.getEntryFee() + ", weight: "
                + this.weight + ")";
    }

    public String getThemeCategory() {
        return this.themeCategory;
    }

    public void setThemeCategory(String themeCategory) {
        this.themeCategory = themeCategory;
    }

    //To Trainee
    public Float validateEntry() {
        //Implement your logic here
        int categoryIndex = Arrays.asList(themeCategoryArr).indexOf(getThemeCategory());
        //Change the return statement accordingly
        return categoryIndex == -1 ? 0.0f : weightLimitArr[categoryIndex];
    }

    //To Trainee
    public void calculateBillAmount() {
        float additionalCost = 0;
        float weightLimit = validateEntry();
        float totalAmount = 0;
        int discountPercentage = 0;

        //Implement your logic here
        if (Objects.nonNull(identifyAmusementPark()) && weightLimit != 0.0f) {
            if (this.weight > weightLimit) additionalCost = 100 * (this.weight - weightLimit);

            totalAmount = getEntryFee() + additionalCost;

            discountPercentage = (totalAmount > 1000 && totalAmount <= 3000) ? 15 : totalAmount > 3000 ? 20 : 0;

            totalAmount = totalAmount - (totalAmount * discountPercentage / 100);
            setFinalAmount(totalAmount);
            generateId();
        } else {
            setFinalAmount(-1.0f);
            setTicketId("NA");
        }
    }
}