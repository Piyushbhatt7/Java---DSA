import java.util.ArrayList;

public class SubsetofNaturalNumber {

    public static void printSubset(ArrayList<Integer> subset)
    {
        for(int 1 = 0; i<subset.size(); i++)
        {
            System.out.println();
        }
    }

    public static void findSubsets(int n, ArrayList<Integer> subset)
    {

        if(n == 0)
        {
            printSubset(subset);
            return;
        }

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
