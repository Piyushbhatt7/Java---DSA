public class PlaceTile {
   
    
  public static int placeTiles( int n, int m)
  {

    if(n == m)
    {
      return 2;
    }

    if(n < m)
    {
       return 1;
    }
    // vertically 
    int verticalPlacments = placeTiles(n-m, m);

    // horizontally

    int horPlacement = placeTiles(n-1,m);

    return verticalPlacments + horPlacement;
  }



    public static void main(String[] args) {
        
      int n = 3 ,m = 3;

    }
}
