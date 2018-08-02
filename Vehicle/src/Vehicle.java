/**
 * assignment 6
 * @author tristesse08
 *
 */
import java.util.*;
public class Vehicle {
	private int odometerUnit;
	private String model;
	private int year;
	private String gasType;
	private String make;
	private String owner;
	private String color;
	
	
	/*
	 * constructors to initialize cars
	 * @param owner
	 */
	Vehicle(String owner){
		this.owner=owner;
	}
	
	Vehicle(){
		
	}
	
	Vehicle(String owner,String make,String model,int year){
		this.owner=owner;
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	Vehicle(String owner,String make,String model,int year,String gasType){
		this.owner=owner;
		this.make=make;
		this.model=model;
		this.year=year;
		this.gasType=gasType;
	}
	
	Vehicle(String owner,String make,String model,int year,String gasType,String color,int odometerUnit){
		this.owner=owner;
		this.make=make;
		this.model=model;
		this.year=year;
		this.gasType=gasType;
		this.color=color;
		this.odometerUnit=odometerUnit;
	}
	
	/*
	 * setters and getters
	 * @return
	 */
	public int getOdometerUnit() {
		return odometerUnit;
	}

	public void setOdometerUnit(int odometerUnit) {
		this.odometerUnit = odometerUnit;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGasType() {
		return gasType;
	}

	public void setGasType(String gasType) {
		this.gasType = gasType;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	/*
	 * methods
	 */
	
	/**
	 * this methods return the age of your car
	 * @return
	 */
	public int carAge(){
		Scanner input=new Scanner(System.in);
		System.out.println("please enter the current year");
		int currentYear=input.nextInt();
		input.close();
		return currentYear-year;
	}
	
	/**
	 * this method check if the car has an owner
	 * @param args
	 */
	boolean doesHaveOwner(){
		if(getOwner()!=null){
			System.out.println("the owner of this car is "+getOwner());
			return true;
		}
		else{
			System.out.println("this car does not belong to someone yet");
			return false;
		}
	}
	
	public static void main(String[] args) {
		//create 5 objects of vehicle
		Vehicle[] cars=new Vehicle[5];
		
		//calling the constructors
		cars[0]=new Vehicle("Son-Rossy");//this one create a car that Son-Rossy owns
		cars[1]= new Vehicle("Robert Geans","Toyota","Rav4",2007);
		cars[2]=new Vehicle("Ronald Rosier","Toyota","Camary",1990,"gasoline");
		cars[3]=new Vehicle();
		cars[4]= new Vehicle("Rose-Venise","Toyota","Rav4",2016,"gasoline");
		
		//calling some of the Vehicle method
		System.out.println(cars[0].getOwner());
		System.out.println(cars[1].getOwner()+"'s cars is "+cars[1].carAge()+" years old");
		System.out.println(cars[4].getOwner()+" has a "+cars[4].getMake()+" "+cars[4].getModel());
		System.out.println(cars[2].doesHaveOwner());

	}

}
