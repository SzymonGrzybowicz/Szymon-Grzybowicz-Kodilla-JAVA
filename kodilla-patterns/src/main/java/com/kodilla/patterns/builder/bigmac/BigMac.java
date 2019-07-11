package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {

    //buns
    public static final String CLASSIC_BUN = "CLASSIC";
    public static final String WHOLEMEAL_BUN = "WHOLEMEAL";
    //sauces
    public static final String STANDARD_SAUCE = "STANDARD";
    public static final String THOUSAND_ISSLAND_SAUCE = "THOUSAND";
    public static final String BARBECUE_SAUCE = "BARBECUE";
    //ingredients
    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String CHILLI = "CHILLI";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String SHRIMP = "SHRIMP";
    public static final String CHEESE = "CHEESE";

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class BigMacBulider {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMac getStandardBigMac() {
            return new BigMacBulider()
                    .bun(CLASSIC_BUN)
                    .burgers(1)
                    .sauce(STANDARD_SAUCE)
                    .ingredient(CHEESE)
                    .build();
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }

        public BigMacBulider bun(String bun) {
            switch (bun) {
                case ("CLASSIC"): {
                    this.bun = "Classic Bun";
                    break;
                }
                case ("WHOLEMEAL"): {
                    this.bun = "Wholemeal Bun";
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Oooops! We dont have that bun! :(");
                }
            }
            return this;
        }

        public BigMacBulider burgers(int burgers) {

            this.burgers = burgers;
            return this;
        }

        public BigMacBulider sauce(String sauce) {

            switch (sauce) {
                case ("STANDARD"): {
                    this.sauce = "Standard Sauce";
                    break;
                }
                case ("THOUSAND"): {
                    this.sauce = "Thousand Issland Sauce";
                    break;
                }
                case ("BARBECUE"): {
                    this.sauce = "Barbecue Sauce";
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Oooops! We dont have that sauce! :(");
                }
            }
            return this;
        }

        public BigMacBulider ingredient(String ingredient) {
            switch (ingredient) {
                case ("LETTUCE"): {
                    this.ingredients.add("Lettuce");
                    break;
                }
                case ("ONION"): {
                    this.ingredients.add("Onion");
                    break;
                }
                case ("BACON"): {
                    this.ingredients.add("Bacon");
                    break;
                }
                case ("CUCUMBER"): {
                    this.ingredients.add("Cucumber");
                    break;
                }
                case ("CHILLI"): {
                    this.ingredients.add("Chili");
                    break;
                }
                case ("MUSHROOMS"): {
                    this.ingredients.add("Mushrooms");
                    break;
                }
                case ("SHRIMP"): {
                    this.ingredients.add("Shrimp");
                    break;
                }
                case ("CHEESE"): {
                    this.ingredients.add("Cheese");
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Oooops! We dont have that ingredient :(");
                }
            }
            return this;
        }
    }
}



