package game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(3);
        System.out.println("Choose following items by pressing number..");
        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Sessior");
        int inp=-1;
        try {
            inp = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("invalid input");
            System.exit(1);
        }
        if(inp>=3 || inp<0){
            System.out.println("Invalid range of item, please try again...");
            System.exit(1);
        }
        if(inp==0){
            if(randomNumber==1){
                System.out.println("Yours` rock and computer`s paper, woops! you lost");
            }
            else if(randomNumber==0)
                System.out.println("Both have rock, so draw...");
            else
                System.out.println("Yours` rock and computer`s sessior, congratuation you win.");
        }
        else if(inp==1){
            if(randomNumber==1){
                System.out.println("Yours` paper and computer`s paper, woops! draw...");
            }
            else if(randomNumber==0)
                System.out.println("Yours` paper and computer`s rock, congratuation you win.");
            else
                System.out.println("Yours` paper and computer`s sessior, woops! you lost.");

        }
        else{
            if(randomNumber==1)
                System.out.println("Yours` sessior and computer`s paper, congratulation you win.");
            else if(randomNumber==0)
                System.out.println("Yours` sessior and computer`s rock, woops! you lost.");
            else
                System.out.println("Both have sessior, woops! your draw.");
        }
    }
}
