import java.util.Scanner;


public class utils {

    static Scanner sc;
    public static int validaInt(){
        while (!sc.hasNextInt()){
            System.out.println("Eso no es un numero");
            sc.next();
        }return sc.nextInt();
    }

    public static double validaDouble(){
        while (!sc.hasNextDouble()){
            System.out.println("Eso no es un numero");
            sc.next();
        }return sc.nextDouble();
    }



}
