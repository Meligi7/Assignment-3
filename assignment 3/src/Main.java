import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static Integer max(ArrayList<Integer>maxInt) {
        int max= -9999;

        if(maxInt.size()==0 || maxInt ==null){
            return null;
        }
        else{
            for(int i = 0;i < maxInt.size();i++){
                if(maxInt.get(i)>max){
                    max = maxInt.get(i);
                }
            }
            return max;
        }
    }
    public static void sort (ArrayList<Integer>sortInt){
        sortInt = new ArrayList<>();
        Collections.sort(sortInt); //instead of any type of sorting this is a quick method
    }
    public static void main(String[] args) {
            Scanner ScanObj = new Scanner(System.in);
            int side1 = ScanObj.nextInt();
            int side2 = ScanObj.nextInt();
            int side3 = ScanObj.nextInt();
            String color = ScanObj.nextLine();
            String filled = ScanObj.nextLine();
            Triangle tr1 = new Triangle(side1,side2,side3,color,filled);
            System.out.println(tr1.area());
            System.out.println(tr1.perimeter());


    }
}