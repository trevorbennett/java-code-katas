package test.java.converter;

import main.java.converter.DollarBoxToAmountTextConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DollarBoxToAmountTextConverterTest {

    private String onlyCentsDollarValue = "0.45";
    private String dollarsAndCentsDollarValue = "10.20";
    private String onlyDollarsDollarValue = "1005";
    private String largeDollarValue = "9876543210";

    private String onlyCentsAmountText = "forty-five cents";
    private String dollarsAndCentsAmountText = "ten dollars and twenty cents";
    private String onlyDollarsAmountText = "one thousand five dollars";
    private String largeAmountText = "nine billion eight hundred seventy-six million five hundred fourty-three thousand one hundred ten dollars";

    //converter should avoid holding any state, so we test using class references rather than initializing an object for the test suite

    @Test
    public void shouldOutputTextualAmountForCentsOnly(){
        final String convertedDollarAmount = DollarBoxToAmountTextConverter.convert(onlyCentsDollarValue);
        assertEquals(onlyCentsAmountText, convertedDollarAmount);
    }

    @Test
    public void shouldOutputTextualAmountForDollarsAndCents(){
        final String convertedDollarAmount = DollarBoxToAmountTextConverter.convert(dollarsAndCentsDollarValue);
        assertEquals(dollarsAndCentsAmountText, convertedDollarAmount);
    }

    @Test
    public void shouldOutputTextualAmountForDollarsOnly(){
        final String convertedDollarAmount = DollarBoxToAmountTextConverter.convert(onlyDollarsDollarValue);
        assertEquals(onlyDollarsAmountText, convertedDollarAmount);
    }

    @Test
    public void shouldOutputTextualAmountForLargeDollarValue(){
        final String convertedDollarAmount = DollarBoxToAmountTextConverter.convert(largeDollarValue);
        assertEquals(largeAmountText, convertedDollarAmount);
    }

}