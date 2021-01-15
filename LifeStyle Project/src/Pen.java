import java.util.Scanner;

public class Pen {

	public static void main(String[] args) {
		char next;
		do {
		System.out.println("!! WELCOME TO J SHOP !!");
		System.out.println();
		
		System.out.println("Dear Customer, please fill in your personal information.");
		Scanner input = new Scanner(System .in);
		
		String[] information = new String [4];
		System.out.print("Enter your name           : ");
		information[0] = input.nextLine();
		
		System.out.print("Enter your No. IC         : ");
		information[1] = input.next();
		
		System.out.print("Enter your No. H/P        : ");
		information[2] = input.next();
		
		System.out.print("Enter your email address  : ");
		information[3] = input.next();
		
		System.out.println();
		
		Product();
		
		int numberofitems, qty, choose;
		double prices = 0, ttlprice;
		double amount = 0;
		
		System.out.print("Enter the number of item you want to buy: ");
		numberofitems = input.nextInt();
		
		for (int items = 1; items <= numberofitems; items++) {
			System.out.println("Item " + items);
			
			System.out.println("1 = Faber Castle ; 2 = Pilot G2 ; 3 = Zhi Xin ");
			System.out.print("Choose the item ");
			choose = input.nextInt();
			
			if(choose == 1) {
				System.out.println("Brand: Faber Castle");
			}
				
				else if(choose == 2) {
					System.out.println("Brand: Pilot G2");
				}
			
				else if(choose == 3) {
					System.out.println("Brand: Zhi Xin");
				}
			
			switch(choose){
				case 1:
					prices = 1.31 ;
					break;
					
				case 2:
					prices = 3.40 ;
					break;
					
				case 3:
					prices = 0.80 ;
					break;
			}
			
			System.out.print("Enter quantity: ");
			qty = input.nextInt();
			
			ttlprice = prices * qty;
			System.out.printf("Total price: RM %.2f%n " , ttlprice);
			System.out.println();
			
			amount += ttlprice;
			
		}
		
		double discount = 0;
		if(amount < 50) {
			discount =  amount * 5/100;
		}
		
			else if(amount >= 50 && amount < 100) {
				discount = amount * 10/100;
			}
		
			else if(amount >= 100) {
				discount = amount * 15/100;
			}
		
		int x=0;
		while(x<=80) {
			System.out.print("-");
			x++;
		}
		System.out.println();
		System.out.println("                         !! CUSTOMER INFORMATION !!"                              );
		System.out.println("---------------------------------------------------------------------------------");
		output(information);
		
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("                               !! PURCHASED !!                                   ");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.printf ("Total amount          : RM %.2f%n" , amount);
		System.out.printf ("Discount received     : RM %.2f%n" , discount);
		System.out.printf ("Price to be paid      : RM %.2f%n" , (amount - discount));
		System.out.println();

		System.out.println("                       !!THANK YOU AND PLEASE COME AGAIN!!"                       );
		System.out.print("Do You Want To Continue ?(Y)=yes (N)=no: ");
	     
		next = input.next().charAt(0);
		}while(next=='y' || next=='Y');
		
	}
	
	public static void output (String[] input) {
		
		System.out.println("Name     :" + input[0]);
		System.out.println("No. IC   :" + input[1]);
		System.out.println("No H/P   :" + input[2]);
		System.out.println("Email    :" + input[3]);
		System.out.println();
	}
	
	public static void Product() {
		String[][] pen = {{"Faber Castle", "Pilot G2", "Zhi Xin"},
						  {"ballpoint pen", "gel ball pen", "gel ink pen"},
						  {"blue", "black", "red"},
						  {"0.5 mm", "0.7 mm", "1.0 mm"},
						  {"RM1.31 / pcs", "RM3.40 / pcs", "RM 0.80 / pcs"}
				 		 };

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("            !! HERE IS OUR SHOP PRODUCTS AND THEIR DESCRIPTION !!");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();

		System.out.println("The brand of product  : " + pen[0][0]);
		System.out.println("The type of product   : " + pen[1][0]);
		System.out.println("The colour of product : " + pen[2][0] + " , " + pen[2][1] + " , " + pen[2][2]);
		System.out.println("The witdh of product  : " + pen[3][0] + " & " + pen[3][1]);
		System.out.println("The price of product  : " + pen[4][0]);
		System.out.println();

		System.out.println("The brand of product  : " + pen[0][1]);
		System.out.println("The type of product   : " + pen[1][1]);
		System.out.println("The colour of product : " + pen[2][0] + " , " + pen[2][1] + " , " + pen[2][2]);
		System.out.println("The witdh of product  : " + pen[3][0] + " & " + pen[3][1] + " & " + pen[3][2]);
		System.out.println("The price of product  : " + pen[4][1]);
		System.out.println();

		System.out.println("The brand of product  : " + pen[0][2]);
		System.out.println("The type of product   : " + pen[1][2]);
		System.out.println("The colour of product : " + pen[2][0] + " , " + pen[2][1] + " , " + pen[2][2]);
		System.out.println("The witdh of product  : " + pen[3][1]);
		System.out.println("The price of product  : " + pen[4][2]);
		System.out.println();
		}
	
}