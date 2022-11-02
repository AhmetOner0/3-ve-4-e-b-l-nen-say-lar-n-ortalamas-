package patikadev;
import java.util.Scanner;
public class ort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k,total = 0,number = 0;
        double avrg;
        System.out.print("enter a number:");
        k = inp.nextInt();
        for (int i = 0;i <= k;i++){
            if (i % 3 == 0 && i % 4 == 0){

                total +=i;
                number++;
            }
        }
        avrg = total / (number - 1);
        System.out.println("the average is:"+avrg);
            }
        }


