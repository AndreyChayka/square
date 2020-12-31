import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("введите координаты точек");
        Scanner scanner= new Scanner(System.in);
        String xy= scanner.nextLine();
        String[] strings = xy.split(" ");
        if (strings.length%2!=0){
            System.out.println("введите корректные данные");
            return;
        }
        Point[] point = new Point[strings.length/2];
        for (int i=0; i< point.length; i ++){
            point[i]= new Point();
        }
        for (int i=0; i<point.length; i++){         //массив всех точек
            for (int j=0; j<strings.length-1; j++){
                if(!strings[j].equals("stoooop")){
                    point[i].setLocation(Double.parseDouble(strings[j]), Double.parseDouble(strings[j+1]));
                    strings[j]="stoooop";
                    strings[j+1]="stoooop";
                    break;
                }
            }
        }
        Point[] extremum = Arrays.extrArrays(point);
        Point[] otherPoints = Arrays.otherPoints(point);

        Vectors.pointInclude(otherPoints[0], extremum);


    }
}
