import java.util.Scanner;

public class Watches {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to our shop!!!");
		System.out.println("\nPlease enter your background detail");
		System.out.print("Name: ");
		String name = scan.nextLine();
		
		System.out.print("Age: ");
		int age = scan.nextInt();
		
		System.out.print("Job Occuption: ");
		String job = scan.next();
		
		Interface();
		String[] watches = {"Rolex oyster perpetual","Gucci-G-Timeless Web-stripe watch","CASIO G-Shock Watch DW-9052GBX-1A4","CASIO G-SHOCK CAGD-100-1BDR","Swatch-BBBLACK","Swatch-CHECKPOINT BLACK","Malaya-01 S","Malaya-01 RG","Seiko-watch fossil the minimalist 3H FS5305","Seiko ladies SXDG86P1"};
		int[] price = {21200,4070,260,470,425,590,352,352,485,1854};
		
		System.out.println("\nPlease select product to buy by typing the numbers!");
		System.out.println("Enter 0 to end the purchase phase");
		
		int[] choice = new int[10];
		
		System.out.println("Enter your choice");
		// choosing choice by for loop
		for(int i =0; i<10;i++) {
			choice[i]= scan.nextInt();
			if(choice[i]==0) {
				System.out.println("End of purchase phase and Thank You!!");
				break;
			}
			
		}
		
		int[] quantity1=Quantity_Price(watches,price,choice);
		
		double totalPriceOfProduct;
		double totalPriceToPaid = 0;
		for(int k =0;k<10;k++) {
			
			if(choice[k]==0) {
				break;
			}else {
			totalPriceOfProduct = (price[choice[k]-1])*quantity1[k];
		    totalPriceToPaid = totalPriceToPaid+ totalPriceOfProduct;
			}
		}
		
		Receipt(name , age , job, totalPriceToPaid);
		
		

	}
	public static void Interface() {
		System.out.println("\n");
		System.out.println("+--------------------------+");
		System.out.println("|                          |");
		System.out.println("|         Welcome          |");
		System.out.println("|                          |");
		System.out.println("+--------------------------+");
		System.out.println("We sell some watches in our shop.");
		System.out.println("1.Rolex oyster perpetual ------------------------------RM 21200 per unit");
		System.out.println("2.Gucci-G-Timeless Web-stripe watch--------------------RM 4070 per unit");
		System.out.println("3.CASIO G-Shock Watch DW-9052GBX-1A4-------------------RM 260 per unit");
		System.out.println("4.CASIO G-SHOCK CAGD-100-1BDR--------------------------RM 470 per unit");
		System.out.println("5.Swatch-BBBLACK---------------------------------------RM 425 per unit");
		System.out.println("6.Swatch-CHECKPOINT BLACK------------------------------RM 590 per unit");
		System.out.println("7.Malaya-01 S------------------------------------------RM 352 per unit");
		System.out.println("8.Malaya-01 RG-----------------------------------------RM 352 per unit");
		System.out.println("9.Seiko-watch fossil the minimalist 3H FS5305----------RM 485 per unit");
		System.out.println("10.Seiko ladies SXDG86P1-------------------------------RM 1854 per unit");
		
	}
	
	public static int[] Quantity_Price(String[]watches1 , int[] price1 , int[] choice1) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		
		int []quantity = new int[10];
		System.out.println("\nEnter the quantity of the watches that you want to buy");
		// enter quantity by while loop
		int j = 0;
		while(j>=0 && j<10) {
			
			if(choice1[j]==0) {
				break;
			}else {
			
			
			System.out.print(watches1[choice1[j]-1]+" : " );
			quantity[j]=scan.nextInt();
			j++;
			}
	}
		
		
		System.out.println();
		
		System.out.println("Here are the list of watches and total price that you buy");
		int k=0;
		do{
			System.out.print(watches1[choice1[k]-1] +": RM" +(price1[choice1[k]-1])*quantity[k] );
			System.out.println();
			k++;
			
			//this if statement is for when the customer selected all product in the shop
			if(k ==10) {
				break;
			}
		}while(choice1[k]!=0);
		System.out.println();
		
		
		return quantity;
		
		}
	

	public static void Receipt(String name , int age , String job, double totalPrice) {
		System.out.println("+---------------------------------------------------+");
		System.out.println("|                   Receipt                         |");
		System.out.println("+---------------------------------------------------+");
		System.out.println("Name           :"+name);
		System.out.println("Age            :"+age);
		System.out.println("Job Occupation :"+job);
		System.out.println();
		System.out.println();
		System.out.println("Net Price to be paid: RM"+totalPrice);
		System.out.println();
		System.out.println("+---------------------------------------------------+");
		System.out.println("|Thank You for your purchase!!!                     |");
		System.out.println("+---------------------------------------------------+");
	}
	

}
