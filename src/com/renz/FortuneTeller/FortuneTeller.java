package com.renz.FortuneTeller;
/*
 * reading from a file
 * Jayson Mallari
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.Random;
public class FortuneTeller {
	
	public static void main(String[] args){
		File inputFile = new File("answers.txt");
		ArrayList<String> answersArr = new ArrayList<String>();
		String answer, response = "y";
		Random rand = new Random();
		
		try {
			Scanner input = new Scanner(inputFile);
			while(input.hasNextLine()){
				answer = input.nextLine();
				answersArr.add(answer);
			}
		}
		catch(Exception e){
			System.out.println("The input file \"answers.txt\" wa NOT found .");
			System.out.println(e.toString());
		}
		
		Scanner in = new Scanner(System.in);
		
		while(response.equalsIgnoreCase("y"))
		{
			System.out.println("The Fortune Teller is ready for you \n" +
					"Please think about your question in your mind and press ENTER for a reply");
			in.nextLine();
			System.out.println("The Fortune Teller says : \"" +
					answersArr.get(rand.nextInt(answersArr.size()))+"\"");
			System.out.println("Do you have another question in mind [y/n] ");
			response = in.nextLine();
			
				
		}
	}

}
