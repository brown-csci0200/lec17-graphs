import java.util.HashSet;
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

    // need a way to keep track of the cities already visited,
    private boolean canReachHelper(CityVertex toVertex, HashSet<CityVertex> visited) {
        /* Plan:
         * - If the starting city IS the dest city, I'm done!
         * - Otherwise, if ANY city that the starting city can get to, can get to the dest city,
         *     return true
         * - If not, return false
         */
        if (this == toVertex) {return true;} // == is allowed because cities are always the same in memory
        else {
            for (CityVertex neighbor : this.toCities) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    if (neighbor.canReachHelper(toVertex, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Doing the recursion as a helper function allows us to write
    // canReach() with only one input, like we originally wanted
    public boolean canReach(CityVertex dest) {
        HashSet<CityVertex> visited = new HashSet<>();
        return this.canReachHelper(dest, visited);
    }
}
