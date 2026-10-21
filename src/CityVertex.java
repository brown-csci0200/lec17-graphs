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

    public String toString() {
        String retstring = "City " + this.name + " goes to { ";
        for (CityVertex toCity : this.toCities) {
            retstring += toCity.name + " ";
        }
        retstring += "}";
        return retstring;
    }

    public boolean canReach(CityVertex other){
        // Base case
        if(this.equals(other)) return true;
        // Recursive cases... ... ... one for each possible mid-point
        for(CityVertex toCity : this.toCities) {
            if(toCity.canReach(other)) return true;
        }
        return false;
    }
}
