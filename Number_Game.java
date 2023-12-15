package Codsoft;
import java.util.*;
class Temp{
    public int generate(int min,int max){
        return (int) (Math.random()*(max-min+1)+min);
    }
}
public class Number_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Temp t=new Temp();
        while(true)
        {
            System.out.println("...................Start new Game....................");
            int attempt=0;
            int win=0;
            int random=t.generate(1, 1000);
            // System.out.println(random);
            int guess;
            System.out.println("Guess no. in between 0 and 1000.");
            while(true)
            {
                System.out.println(++attempt+"st Attempt guess: ");
                guess=sc.nextInt();
                if(guess>random)
                System.out.println("It is high.");
                else if(guess<random)
                System.out.println("It is low");
                else
                {
                System.out.println("Correct guess");
                win++;
                break;
                }
            }
            double rate=(double) win/attempt*100;
            System.out.printf("Your winning rate is: %.2f%%\n",rate);
        }

    }
}
