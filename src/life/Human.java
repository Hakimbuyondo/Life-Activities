package life;

public class Human {
	
	private String name;
	private String gender;
	private String skinColor;
	private String eyesColor;
	private String favoriteActivity;
	private String address;
	private int age;
	private double cash;
	

	public Human(String name, String gender, String skinColor, String eyesColor, String favoriteActivity,
			String address, int age, double cash) {
		super();
		name =   			this.getName();
		gender = 			this.getGender();
		skinColor = 		this.getSkinColor();
		eyesColor = 		this.getEyesColor();
		favoriteActivity = 	this.getFavoriteActivity();
		address = 			this.getAddress();
		age = 				this.getAge();
		cash = 				this.getCash();
	}
	
	public void speak() { // Human will speak up their properties
		System.out.println("My name is " + name);
		System.out.println("My gender is " + gender);
		System.out.println("My Skin Color is " + skinColor);
		System.out.println("My Eye Color is " + eyesColor);
		System.out.println("My Favorite Activity is " + favoriteActivity);
		System.out.println("My Address is " + address);
		System.out.println("I am " +age+ " Years Old");
		System.out.println("I have " + cash + " In Hand");
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public String getEyesColor() {
		return eyesColor;
	}

	public void setEyesColor(String eyesColor) {
		this.eyesColor = eyesColor;
	}

	public String getFavoriteActivity() {
		return favoriteActivity;
	}

	public void setFavoriteActivity(String favoriteActivity) {
		this.favoriteActivity = favoriteActivity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

//	@Override
//	public String toString() {
//		return "Human [name=" + name + ", gender=" + gender + ", skinColor=" + skinColor + ", eyesColor=" + eyesColor
//				+ ", favoriteActivity=" + favoriteActivity + ", address=" + address + ", age=" + age + ", cash=" + cash
//				+ "]";
//	}
	
	

}
