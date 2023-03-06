import org.junit.Assert;
import org.junit.Test;

public class CityVertexTest {

    @Test
    public void testGraphExample()
    {
        // Create some nodes
        CityVertex man = new CityVertex("Manchester");
        CityVertex bos = new CityVertex("Boston");
        CityVertex pvd = new CityVertex("Providence");
        CityVertex wos = new CityVertex("Worcester");
        CityVertex har = new CityVertex("Hartford");

        // Add some edges
        man.addEdge(bos);
        bos.addEdge(pvd);
        bos.addEdge(wos);
        pvd.addEdge(bos);
        wos.addEdge(har);

        System.out.println(bos);
    }
}
