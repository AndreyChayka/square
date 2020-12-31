import java.awt.*;

public class Vectors {
    public static Point vector (Point point1, Point point2){
        Point vector= new Point();
        vector.setLocation(point2.x-point1.x, point2.y-point1.y);
        return vector;
    }
    public static boolean pointInclude (Point point, Point[] extremum){
        Point vectorMaxMin = new Point();
        Point vextorMinMin = new Point();
        Point vextorMinMax = new Point();
        Point vextorMaxMax = new Point();

        vectorMaxMin.setLocation(Vectors.vector(extremum[0], extremum[3]));
        vextorMinMin.setLocation(Vectors.vector(extremum[1], extremum[3]));
        vextorMinMax.setLocation(Vectors.vector(extremum[1], extremum[2]));
        vextorMaxMax.setLocation(Vectors.vector(extremum[0], extremum[2]));

        Point[] vectExtr = new Point[4];
         vectExtr[0] = vectorMaxMin;
         vectExtr[1] = vextorMinMin;
         vectExtr[2] = vextorMinMax;
         vectExtr[3] = vextorMaxMax;

        int[] check = new int[4];
        /*for (int i=0; i<4; i++){
            //Point pointVector = Vectors.vector(vectExtr[i], point);
            check[i] = (extremum[i].x*point.y) - (extremum[i].y*point.x);
            System.out.println(check[i]);
        }*/
        check[0]= (extremum[1].x - extremum[0].x) * (point.y - extremum[0].y) - (extremum[1].y - extremum[0].y) * (point.x - extremum[0].x);
        check[1]= (extremum[2].x - extremum[1].x) * (point.y - extremum[1].y) - (extremum[2].y - extremum[1].y) * (point.x - extremum[1].x);
        check[2]= (extremum[3].x - extremum[2].x) * (point.y - extremum[2].y) - (extremum[3].y - extremum[2].y) * (point.x - extremum[2].x);
        check[3]= (extremum[0].x - extremum[3].x) * (point.y - extremum[3].y) - (extremum[0].y - extremum[3].y) * (point.x - extremum[3].x);
        for (int i=0; i<4; i++){
            System.out.println(check[i]);
        }
        return true;
    }
}
