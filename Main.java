package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int sum = 0;
        System.out.println("Enter the number of rows and columns of first array");
        a = sc.nextInt();
        b = sc.nextInt();
        int m,n;
        System.out.println("Enter the number of rows and columns of second array");
        m = sc.nextInt();
        n = sc.nextInt();
        int multiply[][] = new int[a][n];


         if(b != m){
            System.out.println("The matrices can't be multiplied with each other.");
        }else{
             System.out.println("The matrices multiplied possible");
            System.out.println("Enter elements of first array");
            int firstArray [][] = new int[a][b];
            for(int i =0;i<a;i++){
                for(int j = 0;i<b;j++){
                    firstArray[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements of second matrix");
             int secondArray[][] = new int[m][n];
            for(int i =0;i<=m;i++){
                for(int j = 0;i<=n+1;j++) {
                    secondArray[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i <a; i++) {
                for (int j = 0; j<n; j++) {
                    for (int k = 0; k <m; k++) {
                    secondArray[i][j]=secondArray[i][j] + firstArray[i][k] * secondArray[k][j];
                    }
                    multiply[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("Multiplication of 2d array");
            for (int i = 0; i <a; i++) {
                for (int j = 0; j <n; j++){
                    System.out.printf("%d\t",multiply[i][j]);
                }
                System.out.print("\n");
            }
        }
    }
}