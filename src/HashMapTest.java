import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    @Test
    public void testHashMapExample()
    {
        HashMap<Integer, String> offices = new HashMap<Integer, String>();

        // Store things in a hash map
        offices.put(210, "Helena");
        offices.put(255, "Sun");
    }
}
