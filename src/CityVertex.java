import java.util.LinkedList;

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

    public boolean canReach(CityVertex dest) {
        if (this == dest) {
            return true;
        }

        for (CityVertex neighbor : this.toCities) {
            if (neighbor.canReach(dest)) {
                return true; // We can reach neighbor, we can reach dest
            }
        }
        return false;
    }

    public String toString() {
        String retstring = "City " + this.name + " goes to { ";
        for (CityVertex toCity : this.toCities) {
            retstring += toCity.name + " ";
        }
        retstring += "}";
        return retstring;
    }
}
