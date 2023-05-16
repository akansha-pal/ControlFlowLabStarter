package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Exercises_Tests {
    @ParameterizedTest
    @ValueSource(ints = {5, 7, 8, 14})
    @DisplayName("Given a temperature less than 15, getForecast returns It's cold")
    public void getForecast_Cold(int temp) {

        Assertions.assertEquals("It's cold", Exercises.getForecast(14) );
    }

    @ParameterizedTest
    @ValueSource(ints = {13,15})
    @DisplayName("Given a temperature of 15, getForecast returns It's hot")
    public void getForecast_Hot(int temp) {

        Assertions.assertEquals("It's hot", Exercises.getForecast(15) );
    }

    @ParameterizedTest
    @ValueSource(ints = {90, 100, 125})
    @DisplayName("Given a temperature over 15, getForecast returns It's hot")
    public void getForecast_Over15_Hot(int temp)
    {
        Assertions.assertEquals("It's hot", Exercises.getForecast(125));
    }
    @ParameterizedTest
    @ValueSource(ints = {1})
    @DisplayName("Average returns correct average")
    public void Average_ReturnsCorrectAverage(int num)
    {
        int[] nums = { 3, 8, 1, 7, 3 };
        Assertions.assertEquals(4.4, Exercises.average(nums));
    }

    @ParameterizedTest
    @ValueSource(ints = {1})
    @DisplayName(("When the Array is empty average returns zero"))
    public void WhenArrayIsEmpty_Average_ReturnsZero(int num)
    {
        int[] nums = {  };
        Assertions.assertEquals(0, Exercises.average(nums));
    }

    @ParameterizedTest
    @CsvSource( {
            "100, OAP",
            "60, OAP",
            "59, Standard",
            "18, Standard",
            "17, Student",
            "13, Student",
            "12, Child",
            "5, Child",
            "4, Free",
            "0, Free"
    })
    @DisplayName("Testing ticket types by age")
    public void TicketTypeTest(int age, String expected)
    {
        var result = Exercises.ticketType(age);
        Assertions.assertEquals(expected, result);
    }

    // write unit tests for the 'Grade' method here
    @ParameterizedTest
    @ValueSource(ints = {5, 7, 8, 14, 25, 36})
    @DisplayName("Testing the failing grades by marks")
    public void grade_Fail(int mark) {

        Assertions.assertEquals("Fail", Exercises.grade(mark) );
    }

    @ParameterizedTest
    @ValueSource(ints = {42, 47, 48, 49, 53, 57})
    @DisplayName("Testing the passing grades by marks")
    public void grade_Pass(int mark) {

        Assertions.assertEquals("Pass", Exercises.grade(mark) );
    }

    @ParameterizedTest
    @ValueSource(ints = {61, 64, 67, 70})
    @DisplayName("Testing the merit grades by marks")
    public void grade_PassWithMerit(int mark) {

        Assertions.assertEquals("Pass with Merit", Exercises.grade(mark) );
    }
    @ParameterizedTest
    @ValueSource(ints = {79, 82, 85, 93, 95, 99})
    @DisplayName("Testing the distinction grades by marks")
    public void grade_PassWithDistinction(int mark) {

        Assertions.assertEquals("Pass with Distinction", Exercises.grade(mark) );
    }



    // write unit tests for the Scottish wedding example here
    @ParameterizedTest
    @ValueSource(ints = {0})
    @DisplayName("Testing maximum no attendees in a wedding function by covid alert level")
    public void attendees_Level0(int covidLevel) {

        Assertions.assertEquals(200, Exercises.getScottishMaxWeddingNumber(covidLevel) );
    }
    @ParameterizedTest
    @ValueSource(ints = {1})
    @DisplayName("Testing maximum no attendees in a wedding function by covid alert level")
    public void attendees_Level1(int covidLevel) {

        Assertions.assertEquals(100, Exercises.getScottishMaxWeddingNumber(covidLevel) );
    }
    @ParameterizedTest
    @ValueSource(ints = {2})
    @DisplayName("Testing maximum no attendees in a wedding function by covid alert level")
    public void attendees_Level2(int covidLevel) {

        Assertions.assertEquals(50, Exercises.getScottishMaxWeddingNumber(covidLevel) );
    }
    @ParameterizedTest
    @ValueSource(ints = {3})
    @DisplayName("Testing maximum no attendees in a wedding function by covid alert level")
    public void attendees_Level3(int covidLevel) {

        Assertions.assertEquals(50, Exercises.getScottishMaxWeddingNumber(covidLevel) );
    }
    @ParameterizedTest
    @ValueSource(ints = {4})
    @DisplayName("Testing maximum no attendees in a wedding function by covid alert level")
    public void attendees_Level4(int covidLevel) {

        Assertions.assertEquals(20, Exercises.getScottishMaxWeddingNumber(covidLevel) );
    }
}
