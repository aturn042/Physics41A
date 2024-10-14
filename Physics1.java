//First type your arrays into the code, then run it.
//The system will prompt you to enter your uncertainty.
//Make sure you stay consistent with units - if you
//measured height in centimeters, make sure you put uncertainty
//in centimeters.
import java.util.Scanner;
public class Physics1 {

    public static void main(String [] physics){
        Scanner scanner = new Scanner(System.in);
        //input your position and time data into the position and time arrays below
        double[] position = {150,120,100,70,50,30,0};
        double[] time = {0.55,0.5,0.45,0.38,0.32,0.25,0};
        //
        double[] gList = {0,0,0,0,0,0};
        double[]gUncert = {0,0,0,0,0,0};
        System.out.println("Enter height uncertainty");
        double uncert = scanner.nextDouble();

        for(int i = 0; i<position.length-1;i++){
            gList[i] = (2*position[i])/(time[i]*time[i]);
            gUncert[i] = Math.sqrt(uncert/position[i]);
        }
        System.out.println("G Values");
        for(int i = 0; i<5; i++){
            System.out.print(gList[i]+", ");
        }
        System.out.println();
        System.out.println("G Uncertainties:");
        for(int i = 0; i<5;i++) {
            System.out.print(gUncert[i]+", ");
        }
        double lastG = gList[5] = (2*position[5])/(time[5]*time[5]);
        double lastGuncert = Math.sqrt(uncert/position[5]);
        System.out.println();
        System.out.println("Extra value: "+lastG+" Extra uncertainty: "+lastGuncert);
    }
}
