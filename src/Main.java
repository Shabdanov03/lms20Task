import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter length :  ");
            double length = scanner.nextDouble();
            System.out.print(" Enter width :  ");
            double width = scanner.nextDouble();
            System.out.print(" Enter height :  ");
            double height = scanner.nextDouble();
            Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
            System.out.println(parallelepiped);
            System.out.println("---------------------------------------------");
            System.out.println(" Parallelepiped Area : "+parallelepiped.getArea());
            System.out.println("---------------------------------------------");
            System.out.println(" Parallelepiped Volume : "+parallelepiped.getVolume());
        }catch (InputMismatchException e){
            System.out.println(" Only numbers ! ");
        } catch (Exception e) {
            System.out.println(" Number must be greater than 0 or less than 20 ! ");
        }
    }
}