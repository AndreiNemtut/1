package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduceti valoarea lui n: ");
	    int n = scanner.nextInt();
	    int[] array = new int[n + 1];
	    int a, j = 0;
	    for(int i = 0; i < n; i++) {
	        System.out.print("#" + (i + 1) + ": ");
	        a = scanner.nextInt();
	        if(isPrim(a)) {
				array[j] = a;
				j++;
			}
        }
	    int temp;
	    for(int i = 0; i < j - 1; i++)
	    	for(int k = i + 1; k < j; k++)
				if(array[i] > array[k]) {
					temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
	    for(int i = 0; i < j; i++) {
	    	System.out.print(array[i] + " ");
		}
    }

    public static boolean isPrim(int n) {
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
