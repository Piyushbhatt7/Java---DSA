public class MazeMove {

           public static  int countPaths(int i, int j, int n, int m)
         {
            
            if(i == n || j == m)
         {
            return 0;
         }

         if(1 == n-1 && j == m-1)
     {
        return 1;
     }
            // downwards
            int downpath = countPaths(i+1, j, n, m);

            int rightpath = countPaths(i, j+1, n, m);

            return downpath + rightpath;
         }
    
    
    public static void main(String[] args) {
        
        int n=3, m = 3;

        int totalpaths = countPaths(0, 0, n, m);
        System.out.println(totalpaths);
    }
}
