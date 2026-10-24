import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CityVertex {
    public LinkedList<CityVertex> toCities;
    public String name;

    public CityVertex(String nm) {
        this.name = nm;
        this.toCities = new LinkedList<CityVertex>();
    }

    public void addEdge(CityVertex toVertex) {
        this.toCities.add(toVertex);
    }

    public String toString() {
        String retstring = "City " + this.name + " goes to { ";
        for (CityVertex toCity : this.toCities) {
            retstring += toCity.name + " ";
        }
        retstring += "}";
        return retstring;
    }

    public boolean canReach(CityVertex other) {
        return canReachHelper(other, new HashSet<>());
    }

    private boolean canReachHelper(CityVertex other, Set<CityVertex> visited) {
        // Base case
        if(this.equals(other)) return true;
        // Recursive cases... ... ... one for each possible mid-point
        for(CityVertex toCity : this.toCities) {
            if(!visited.contains(toCity)) {
                visited.add(toCity);
                if(toCity.canReachHelper(other, visited)) return true;
            }
        }
        return false;
    }
}
