import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("Give a number=");
        N = input.nextInt();
        System.out.println("--------------");
        System.out.println("PowerOfFour");
        for(int i=1 ; i<=N ; i*=4){
            System.out.println(i);
        }
        System.out.println("--------------");
        System.out.println("PowerOfFive");
        for (int i=1 ; i<=N ; i*=5){
            System.out.println(i);
        }

    }
}
