package com.example.inandout.model;

public class Order {
    private int mCheeseburgers;
    private int mDoubleDouble;
    private int mFrenchFries;
    private int mLargeDrinks;
    private int mMediumDrinks;
    private int mSmallDrinks;
    private int mShakes;
    public static final double PRICE_CHEESEBURGER = 2.15;
    public static final double PRICE_DOUBLE_DOUBLE = 3.6;
    public static final double PRICE_FRENCH_FRIES = 1.65;
    public static final double PRICE_LARGE_DRINKS = 1.75;
    public static final double PRICE_MEDIUM_DRINKS = 1.55;
    public static final double PRICE_SMALL_DRINKS = 1.45;
    public static final double PRICE_SHAKES = 2.20;
    public static final double TAX_RATE = 0.08;

    public Order(int cheeseburgers, int doubleDouble, int frenchFries, int largeDrinks, int mediumDrinks, int smallDrinks, int shakes) {
        mCheeseburgers = cheeseburgers;
        mDoubleDouble = doubleDouble;
        mFrenchFries = frenchFries;
        mLargeDrinks = largeDrinks;
        mMediumDrinks = mediumDrinks;
        mSmallDrinks = smallDrinks;
        mShakes = shakes;
    }

    public Order() {

    }

    public int getCheeseburgers() {
        return mCheeseburgers;
    }

    public void setCheeseburgers(int cheeseburgers) {
        mCheeseburgers = cheeseburgers;
    }

    public int getDoubleDouble() {
        return mDoubleDouble;
    }

    public void setDoubleDouble(int doubleDouble) {
        mDoubleDouble = doubleDouble;
    }

    public int getFrenchFries() {
        return mFrenchFries;
    }

    public void setFrenchFries(int frenchFries) {
        mFrenchFries = frenchFries;
    }

    public int getLargeDrinks() {
        return mLargeDrinks;
    }

    public void setLargeDrinks(int largeDrinks) {
        mLargeDrinks = largeDrinks;
    }

    public int getMediumDrinks() {
        return mMediumDrinks;
    }

    public void setMediumDrinks(int mediumDrinks) {
        mMediumDrinks = mediumDrinks;
    }

    public int getSmallDrinks() {
        return mSmallDrinks;
    }

    public void setSmallDrinks(int smallDrinks) {
        mSmallDrinks = smallDrinks;
    }

    public int getShakes() {
        return mShakes;
    }

    public void setShakes(int shakes) {
        mShakes = shakes;
    }



    @Override
    public String toString() {
        return "Order{" +
                "mCheeseburgers=" + mCheeseburgers +
                ", mDoubleDouble=" + mDoubleDouble +
                ", mFrenchFries=" + mFrenchFries +
                ", mLargeDrinks=" + mLargeDrinks +
                ", mMediumDrinks=" + mMediumDrinks +
                ", mSmallDrinks=" + mSmallDrinks +
                ", mShakes=" + mShakes +
                '}';
    }

    public int itemsOrdered()
    {
        return mCheeseburgers + mDoubleDouble + mSmallDrinks + mMediumDrinks +mLargeDrinks +mFrenchFries + mShakes;
    }

    public double calculateSubtotal()
    {
        return (mCheeseburgers * PRICE_CHEESEBURGER) + (mDoubleDouble * PRICE_DOUBLE_DOUBLE)
                + (mFrenchFries * PRICE_FRENCH_FRIES) + (mShakes * PRICE_SHAKES)
                +(mLargeDrinks * PRICE_LARGE_DRINKS) + (mMediumDrinks *PRICE_MEDIUM_DRINKS) +
                (mSmallDrinks * PRICE_SMALL_DRINKS);

    }

    public double calculateTotal()
    {
        return calculateSubtotal() - (calculateSubtotal() * TAX_RATE);
    }

    public double calculateTax()
    {
        return calculateSubtotal() * TAX_RATE;
    }

}
