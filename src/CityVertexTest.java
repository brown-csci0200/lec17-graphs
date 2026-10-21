import org.junit.Assert;
import org.junit.Test;

public class CityVertexTest {

    @Test
    public void testGraphExample()
    {
        CityVertex man = new CityVertex("Manchester");
        CityVertex bos = new CityVertex("Boston");
        CityVertex pvd = new CityVertex("Providence");
        CityVertex wor = new CityVertex("Worcester");
        CityVertex har = new CityVertex("Hartford");
        CityVertex bristol = new CityVertex("Bristol");

        man.addEdge(bos);
        bos.addEdge(pvd);
        bos.addEdge(wor);
        pvd.addEdge(bos);
        wor.addEdge(har);

        System.out.println(man.canReach(man));
        System.out.println(man.canReach(bos));
        System.out.println(man.canReach(pvd));
        System.out.println(wor.canReach(bos));

        System.out.println(wor.canReach(bristol));
        System.out.println(bristol.canReach(bos));
        System.out.println(bristol.canReach(bristol));
        System.out.println(bristol.canReach(null));
        // System.out.println(null.canReach(bristol));
        System.out.println(man.canReach(wor));



    }
}
