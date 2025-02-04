import java.util.ArrayList;

public class SubsetofNaturalNumber {

    public static void findSubsets(int n, ArrayList<Integer> subset)
    {

        // add
        subset.add(n);
        findSubsets(n-1, subset);

        // no add
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    
    public static void main(String[] args) {
        
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
    }
}
