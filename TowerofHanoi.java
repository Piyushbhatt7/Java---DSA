public class TowerofHanoi {
    
    public static void TowerofHanoi(int n, String src, String helper, String dest)
    {
        TowerofHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
    }
    

    public static void main(String[] args) {
        
        int n = 3;
    }
}
