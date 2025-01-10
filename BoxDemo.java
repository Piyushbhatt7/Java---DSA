class Box {

    double height, width, depth;

    Box(double l) {

        height=width=depth=l;

    }

    Box(double h, double w, double d) {

        height = h;
        width = w;
        depth = d;
    }

}

public class BoxDemo {
    
    public static void main(String[] args) {
        
        Box obj = new Box(12, 22, 78);
        System.out.println("The product of height width and depth is = " + obj.height * obj.width * obj.depth);
        System.out.println(obj.height + "\n" + obj.width + "\n" + obj.depth);
    }
}
