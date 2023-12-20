package life;

import java.time.LocalDate;

public class Activities {

	private String[] activityName;
	private String venue;
	private int allowedAge;
	private double cost;
	private boolean isAdult;
	
	static String theChoice;
	Human human;
	
	public Activities(String[] activityName, String venue, int allowedAge, double cost, boolean isAdult) {
		super();
		this.activityName = activityName;
		this.venue = venue;
		this.allowedAge = allowedAge;
		this.cost = cost;
		this.isAdult = isAdult;
	}
	
	public static boolean parmitions(Activities activity, Human human){
		double cost = activity.getCost();
		int age = human.getAge();
		boolean adult = activity.isAdult();
		String active = checkActivity(activity.getActivityName(), human.getFavoriteActivity());
		theChoice = active;
		
		if(age >= 18) {
			if(human.getCash() >= activity.getCost()) {
				if(human.getFavoriteActivity().equals(active)) {
					System.out.println(human.getFavoriteActivity()+ ": Ok that activity is there today...");
					return true;
				} else {
					System.out.println(human.getFavoriteActivity()+ ": Sorry that activity is not there today...");
					return false;
				}
			} else {
				System.out.println(human.getCash()+ " Is not enouht, you need to add some money...");
				return false;
			}
		} else {
			System.out.println(human.getName()+ " You are very yourng for this Activity...");
			return false;
		}
		
	}
	
	public static String checkActivity(String [] activityName, String choice) {
		String myChoice = null;
		for(String data : activityName) {
			System.out.println(data);
			if(choice.equals(data)) {
				myChoice = choice;
			}
		}
		return myChoice;

	}


	public String[] getActivityName() {
		return activityName;
	}


	public void setActivityName(String[] activityName) {
		this.activityName = activityName;
	}


	public String getVenue() {
		return venue;
	}


	public void setVenue(String venue) {
		this.venue = venue;
	}


	public int getAllowedAge() {
		return allowedAge;
	}


	public void setAllowedAge(int allowedAge) {
		this.allowedAge = allowedAge;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public boolean isAdult() {
		return isAdult;
	}


	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}

	@Override
	public String toString() {
		LocalDate currentDate = LocalDate.now();
		double balance = human.getCash() - this.getCost();
		return " \n Activity: " + theChoice + ". \n Venue: " + venue + ". \n Allowed Age : " + allowedAge
				+ ". \n Cost: " + cost + ". \n Customer Name: " + human.getName() + ". \n Customer Age: " + human.getAge() 
				+ ". \n Customer Gender: " + human.getGender() + ". \n Amount Paid: " + human.getCash() 
				+ ". \n Customer Address: " + human.getAddress() + ". \n Balance: " + balance 
				+ ". \n Paid at (Date): " + currentDate
				+ " \n -------------------------------------------------------------------";
	}
	

	
}
