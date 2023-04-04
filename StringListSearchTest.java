import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSearchTest {
    @Test
    public void testUnorderedSearch() {
        ArrayList<String> inputItems;
        String inputTerm;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        inputTerm = "the";
        expectedOutput = 2;
        actualOutput = StringListSearch.unorderedSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
    }


    @Test
    public void testordersearch(){
        ArrayList<String> inputItems;
        String inputTerm;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList("Apple", "Banana", "Donnut", "food"));
        inputTerm = "food";
        expectedOutput = 3;
        actualOutput = StringListSearch.orderedSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testingorderedBinarySearch(){
        ArrayList<String> inputItems;
        String inputTerm;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList("Apple", "fjdsaifjoajgoijas", "Donnut", "food","gdsahgjdsahgkjsag","dsfjjashgkjahgkdshg","sjfhksahfkjsahfkhsa","something"));
        inputTerm = "something";
        expectedOutput = 7;
        actualOutput = StringListSearch.orderedBinarySearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
    }
}
