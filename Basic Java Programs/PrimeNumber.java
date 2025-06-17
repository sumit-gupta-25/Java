// To print prime numbers till n numbers

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n){
        if(n <= 1)
            return false;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number till where you want to print prime numbers: ");
        int n = sc.nextInt();

        int num = 2;
        
        while(num < n){                        
            if(isPrime(num)){
                System.out.print(num + " ");
            }
            num++;
        }
        sc.close();
    }
}

//If you want to print specific number of prime number then use new variable count = 0
/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number till where you want to print prime numbers: ");
        int n = sc.nextInt();

        int num = 2;
        count = 0

        while(count < n){                        
            if(isPrime(num)){
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        sc.close();
    }
*/