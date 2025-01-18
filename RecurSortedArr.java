public class RecurSortedArr {
    
    public static boolean isSoerted(int arr[], int idx)
    {   
        if(idx == arr.length-1)
        {
            return true;
        }

        if(arr[idx] < arr[idx+1]) {
            // array is sorted till now
            return isSoerted(arr, idx+1);

        }

        else {
            return false;
        }
    }


    public static void main(String[] args) {
        

    }
}
