package MHR.practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SubwayTest {

    @Test
    void fullBuilder() {
        Subway.SubwayBuilder builder = new Subway.SubwayBuilder();
        builder.addBread("Italian")
                .addMeat("Vegan Steak")
                .addCheese("Vegan Cheese")
                .addSalad("Lettuce")
                .addSauce("Teriyaki");
        Subway sandwich = builder.build();
        assertEquals("Subway Sandwich: Bread: Italian, Meat: Vegan Steak, Cheese: Vegan Cheese, Salad: Lettuce, Sauce: Teriyaki",
                sandwich.toString());
    }

    @Test
    void multipleToppings() {
        Subway.SubwayBuilder builder = new Subway.SubwayBuilder();
        builder.addBread("Italian")
                .addMeat("Vegan Steak")
                .addCheese("Vegan Cheese")
                .addSalad("Lettuce")
                .addSalad("Tomatoes")
                .addSalad("Onion")
                .addSalad("Red pepper")
                .addSauce("Teriyaki")
                .addSauce("Sriracha");
        Subway sandwich = builder.build();
        ArrayList<String> expectedSalad = new ArrayList<>(Arrays.asList("Lettuce", "Tomatoes", "Onion", "Red pepper"));
        ArrayList<String> expectedSauce = new ArrayList<>(Arrays.asList("Teriyaki", "Sriracha"));
        assertEquals(expectedSalad, sandwich.getSalad());
        assertEquals(expectedSauce, sandwich.getSauce());

    }

}