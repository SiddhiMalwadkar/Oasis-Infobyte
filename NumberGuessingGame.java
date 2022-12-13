package com.beans;

import java.util.Scanner;

public class NumberGuessingGame {
static void  NumberGuessingGame(){
//Task 2
//By Siddhi Girish Malwadkar.
Scanner sc=new Scanner(System.in);
Integer Number=(int)(100*Math.random());
Integer rounds=5;
Integer Prediction;
Integer i;
Integer Oncemore;
Integer Points=0;
System.out.println("Welcome, this is a  Number Guessing Game");
System.out.println("All you need to do is a to guess a number between 1 to 100");
for(i=0;i<5;i++) {
	System.out.println("Write your number here:");
	Prediction=sc.nextInt();
	if(Prediction>100||Prediction<0) {
		System.out.println("Error!! Please enter number between 1-100 only");
	}else if(Prediction==Number) {
		System.out.println("The number you have guessed is correct!!Congratulations!!");
		Points+=10;
		System.out.println("Therefore your score is:"+Points);
		break;
	}else if(Prediction>Number&&i!=rounds-1) {
		System.out.println("Sorry but your prediction is wrong.The number is less than"+Prediction);
	}else if(Prediction<Number&&i!=rounds-1) {
		System.out.println("Sorry but your prediction is more. The number is more than"+Prediction);
	}
}
if(rounds==i) {
	System.out.println("Your round has been completed.The number was:"+Number+"Press 0 to continue:"+"Thank You So Much");
	Oncemore=sc.nextInt();
	if(Oncemore==0) {
		NumberGuessingGame();
	}else {
		System.out.println("Thank You So Much,Keep Playing!!");
	}
}
}
public static void main(String[] args) {
	NumberGuessingGame();
}}