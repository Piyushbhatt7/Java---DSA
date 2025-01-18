public class RecurSortedArr {
    
    public static boolean isSoerted(int arr[], int idx)
    {
        if(arr[idx] < arr[idx+1]) {
            // array is sorted till now
            isSoerted(arr, idx)
        }
    }


    public static void main(String[] args) {
        

    }
}
