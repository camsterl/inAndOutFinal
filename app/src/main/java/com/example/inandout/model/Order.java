package com.example.inandout.model;

public class Order {
    private int mCheeseburgers;
    private int mDoubleDouble;
    private int mFrenchFries;
    private int mLargeDrinks;
    private int mMediumDrinks;
    private int mSmallDrinks;
    private int mShakes;
    private int threeByThree;
    private int fourByFour;
    private int hundredByHundred;
    private int animalFries;
    private int cheeseFries;
    public static final double PRICE_CHEESEBURGER = 2.15;
    public static final double PRICE_DOUBLE_DOUBLE = 3.6;
    public static final double PRICE_FRENCH_FRIES = 1.65;
    public static final double PRICE_LARGE_DRINKS = 1.75;
    public static final double PRICE_MEDIUM_DRINKS = 1.55;
    public static final double PRICE_SMALL_DRINKS = 1.45;
    public static final double PRICE_SHAKES = 2.20;
    public static final double PRICE_THREE = 3.00;
    public static final double PRICE_FOUR = 4.00;
    public static final double PRICE_HUNDRED = 10.75;
    public static final double PRICE_ANIMAL_FRIES = 3.75;
    public static final double PRICE_CHEESE_FRIES = 3.45;

    public static final double TAX_RATE = 0.08;

    public Order(int mCheeseburgers, int mDoubleDouble, int mFrenchFries, int mLargeDrinks, int mMediumDrinks, int mSmallDrinks, int mShakes, int threeByThree, int fourByFour, int hundredByHundred, int animalFries, int cheeseFries) {
        this.mCheeseburgers = mCheeseburgers;
        this.mDoubleDouble = mDoubleDouble;
        this.mFrenchFries = mFrenchFries;
        this.mLargeDrinks = mLargeDrinks;
        this.mMediumDrinks = mMediumDrinks;
        this.mSmallDrinks = mSmallDrinks;
        this.mShakes = mShakes;
        this.threeByThree = threeByThree;
        this.fourByFour = fourByFour;
        this.hundredByHundred = hundredByHundred;
        this.animalFries = animalFries;
        this.cheeseFries = cheeseFries;
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

    public int getThreeByThree() {
        return threeByThree;
    }

    public void setThreeByThree(int threeByThree) {
        this.threeByThree = threeByThree;
    }

    public int getFourByFour() {
        return fourByFour;
    }

    public void setFourByFour(int fourByFour) {
        this.fourByFour = fourByFour;
    }

    public int getHundredByHundred() {
        return hundredByHundred;
    }

    public void setHundredByHundred(int hundredByHundred) {
        this.hundredByHundred = hundredByHundred;
    }

    public int getAnimalFries() {
        return animalFries;
    }

    public void setAnimalFries(int animalFries) {
        this.animalFries = animalFries;
    }

    public int getCheeseFries() {
        return cheeseFries;
    }

    public void setCheeseFries(int cheeseFries) {
        this.cheeseFries = cheeseFries;
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
                ", threeByThree=" + threeByThree +
                ", fourByFour=" + fourByFour +
                ", hundredByHundred=" + hundredByHundred +
                ", animalFries=" + animalFries +
                ", cheeseFries=" + cheeseFries +
                '}';
    }

    public int itemsOrdered()
    {
        return mCheeseburgers + mDoubleDouble + mSmallDrinks + mMediumDrinks +mLargeDrinks +mFrenchFries + mShakes + threeByThree + fourByFour + hundredByHundred + animalFries + cheeseFries;
    }

    public double calculateSubtotal()
    {
        return (mCheeseburgers * PRICE_CHEESEBURGER) + (mDoubleDouble * PRICE_DOUBLE_DOUBLE)
                + (mFrenchFries * PRICE_FRENCH_FRIES) + (mShakes * PRICE_SHAKES)
                +(mLargeDrinks * PRICE_LARGE_DRINKS) + (mMediumDrinks *PRICE_MEDIUM_DRINKS) +
                (mSmallDrinks * PRICE_SMALL_DRINKS) + (threeByThree * PRICE_THREE) + (fourByFour * PRICE_FOUR) +
                (hundredByHundred * PRICE_HUNDRED) + (animalFries + PRICE_ANIMAL_FRIES) + (cheeseFries * PRICE_CHEESE_FRIES);

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
