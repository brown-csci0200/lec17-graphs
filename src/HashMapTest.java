import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    @Test
    public void testHashMapExample()
    {
        //      Key type, value type
        HashMap<Integer, String> offices = new HashMap<Integer, String>();

        // Store things in a hash map
        offices.put(210, "Helena");
        offices.put(255, "Sun");

        // From programmer perspective:  only one value can map to a key
        offices.put(210, "Mihir");


        Assert.assertEquals("Mihir", offices.get(210));
        Assert.assertTrue(offices.containsKey(210));
        Assert.assertFalse(offices.containsKey(300));
    }

    @Test
    public void testHashMapWithStrings() {
        // Any type with a hashCode method can be used as a key
        // Here's an example using strings as the key--Java's String
        // class has a built-in hashCode method
        HashMap<String, String> offices2 = new HashMap<String, String>();
        offices2.put("CIT210", "Helena");
        offices2.put("SOL255", "Sun");
        offices2.put("CIT210", "Mihir");

        // In general, if you are creating your own class and storing it
        // in a HashMap, you will need a hashCode() method.
        //
        // (If no hashCode is present, Java will use a default that compares
        // memory addresses, similar to .equals())
    }
}