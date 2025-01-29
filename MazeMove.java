public class MazeMove {

     
         int countPaths(int i, int j, int n, int m)
         {
            
            // downwards
            int downpath = countPaths(i+1, j, n, m);

            int rightpath = countPaths(i, j+1, n, m);

            return downpath + rightpath;
         }
    
    
    public static void main(String[] args) {
        
        int n=3, m = 3;
    }
}
