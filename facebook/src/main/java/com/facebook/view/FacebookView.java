package com.facebook.view;

import java.util.Scanner;
public class FacebookView {

	public static void main(String[] args) {
		System.out.println("*****Main Menu");
		System.out.println("press 1");
		System.out.println("press 2");
		System.out.println("press 3");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		facebookcominterface fc= new facebookcontrol();
		switch(c) {
		case 1:fc.createprofile();
		break;
		case 2:fc.editprofile();
		break;
		}
	}

}
