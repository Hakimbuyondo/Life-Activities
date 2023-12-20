package life;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class LifeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean adult = false;
		
		Activities activity = new Activities(null, null, 0, 0, adult);
		String [] activityName = {"Movies", "Music", "Sports", "Clubing", "Tour", "Learning"};
		activity.setActivityName(activityName);
		activity.setVenue("Ramon Video Club");
		activity.setAllowedAge(18);
		activity.setAdult(adult);
		activity.setCost(20000);
		
//		activity.checkActivity(activityName);
		

		ArrayList<Human> person = new ArrayList<Human>();
		ArrayList<Activities> myListActivity = new ArrayList<Activities>();
		
		System.out.println("Welcome to ("+ activity.getVenue() +"), What is your name ?...");
		Scanner sName = new Scanner(System.in);
		String name = sName.nextLine();
		
		System.out.println("What is your gender ?...");
		Scanner sGender = new Scanner(System.in);
		String gender = sGender.nextLine();
		
		System.out.println("What is your skin color ?...");
		Scanner sSkinColor = new Scanner(System.in);
		String skinColor = sSkinColor.nextLine();
		
		System.out.println("What is you eye color ?...");
		Scanner sEyeColor = new Scanner(System.in);
		String eyeColor = sEyeColor.nextLine();
		
		System.out.println("Which Activity do you enjoy most ?...");
		Scanner sFavoriteActivity = new Scanner(System.in);
		String favoriteActivity = sFavoriteActivity.nextLine();
		
		System.out.println("Where did you come from ?...");
		Scanner sAddress = new Scanner(System.in);
		String address = sAddress.nextLine();
		
		System.out.println("How old are you ?...");
		Scanner sAge = new Scanner(System.in);
		int age = sAge.nextInt();
		
		System.out.println("Please how much do you have...");
		Scanner sCash = new Scanner(System.in);
		double cash = sCash.nextDouble();
		
		Human human = new Human(name, gender, skinColor, eyeColor, favoriteActivity, address, age, cash);
		human.setName(name);
		human.setGender(gender);
		human.setSkinColor(skinColor);
		human.setFavoriteActivity(favoriteActivity);
		human.setEyesColor(eyeColor);
		human.setAddress(address);
		human.setAge(age);
		human.setCash(cash);
		
//		if(human.getCash() >= activity.getCost()) {
			adult = activity.parmitions(activity, human);
			if(adult == true) {
				person.add(human);
				myListActivity.add(activity);
				showActivity(myListActivity, activity, human);
			}
			
//		}
		
	}
	
	public static void showActivity(ArrayList<Activities> myListActivity, Activities active, Human hum) {
		active.human = hum;
		for(Activities data : myListActivity) {
			System.out.println(data);
		}
		
		String filePath = "register.txt";
		
        try {
            // Read all lines from the file into a list
            // Append new content to the list
            Files.write(Paths.get(filePath), active.toString().getBytes(), StandardOpenOption.APPEND);

            System.out.println(hum.getName() + ": paid: Record has been saved...");
            

        } catch (IOException e) {
            System.out.println("File not found (we did not find where to save your data)...");;
        }
		
	}

}
