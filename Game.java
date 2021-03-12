import java.util.Random;
import java.util.Scanner;

public class Game {static public void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Random rand = new Random();

    int num = rand.nextInt(100);

    String x = Integer.toBinaryString(num);

    System.out.println("Binary representation of "+num+" is: ");
    String sin = scnr.nextLine();
    System.out.println(x);

    if (x.equals(sin)){
        System.out.println("You are correct!");
    }
    else if (!x.equals(sin)){
        System.out.println("You are wrong!");
    }

    System.out.println();

    int num2 = rand.nextInt(100);

    String y = Integer.toBinaryString(num2);

    String binaryString= y;

    System.out.println("What is the decimal of "+binaryString+": ");

    int answer = scnr.nextInt();
    int decimal=Integer.parseInt(binaryString ,2);

    if (decimal == answer){
        System.out.println("You are correct!");
    }
    else if (decimal != answer){
        System.out.println("You are wrong!");
    }

    System.out.println("The correct decimal is "+decimal);

}}
