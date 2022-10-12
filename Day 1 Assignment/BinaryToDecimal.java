package com.Rohit.demo;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		
		int bn=0;
		int dn=0;
		int i=1;
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Binary no:");
		bn= sc.nextInt();
		int bnTemp=bn;
		while(bn!=0)
		{
			r=bn%10;
			dn=dn+r*i;
			i=i*2;
			bn=bn/10;
			
		}
		
		System.out.println("Decimal value of"+bnTemp+"is:"+dn);
	}

}
