import java.util.Scanner;

public class Pen {

public static void main(String[] args) {
		
		System.out.println("!! CUSTOMER INFORMATION !!");
		Scanner input = new Scanner(System .in);
		
		printName();
		printIC();
		printHP();
		
		System.out.println("-------------------------------");
		System.out.println("!! HERE IS THE PRODUCTS AND THEIR DESCRIPTION !!");

		
		String [][] pen = {{"Faber Castle", "Pilot G2", "Zhi Xin"},
		                   {"ballpoint pen", "gel ball pen", "gel ink pen"},
		                   {"blue", "black", "red"},
		                   {"0.5 mm", "0.7 mm", "1.0 mm"},
		                   {"RM1.31 / pcs", "RM3.40 / pcs", "RM 0.80 / pcs"}
						};
		
		System.out.println("The brand of product: " + pen[0][0]);
		System.out.println("The type of product: " + pen[1][0]);
		System.out.println("The colour of product: " + pen[2][0] + " , " + pen[2][1] + " , " + pen[2][2]);
		System.out.println("The witdh of product: " + pen[3][0] + " & " + pen[3][1]);
		System.out.println("The price of product: " + pen[4][0]);
		System.out.println();
		
		System.out.println("The brand of product: " + pen[0][1]);
		System.out.println("The type of product: " + pen[1][1]);
		System.out.println("The colour of product: " + pen[2][0] + " , " + pen[2][1] + " , " + pen[2][2]);
		System.out.println("The witdh of product: " + pen[3][0] + " & " + pen[3][1] + " & " + pen[3][2]);
		System.out.println("The price of product: " + pen[4][1]);
		System.out.println();
		
		System.out.println("The brand of product: " + pen[0][2]);
		System.out.println("The type of product: " + pen[1][2]);
		System.out.println("The colour of product: " + pen[2][0] + " , " + pen[2][1] + " , " + pen[2][2]);
		System.out.println("The witdh of product: " + pen[3][1]);
		System.out.println("The price of product: " + pen[4][2]);
		System.out.println();
		
		System.out.println("-------------------------------");
		System.out.println("!! PURCHASED !!");
		
		int numberofitems, qty;
		String branditem, colours, witdh;
		double prices, ttlprice;
		double amount = 0;
		
		System.out.print("Enter the number of item: ");
		numberofitems = input.nextInt();
		
		for (int items = 1; items <= numberofitems; items++) {
			System.out.println("Item " + items);
			
			System.out.print("Enter brand: ");
			branditem = input.next();
			
			System.out.print("Enter price: RM");
			prices = input.nextDouble();
			
			System.out.print("Enter colour: ");
			colours = input.next();
			
			System.out.print("Enter witdh : ");
			witdh = input.next();
			
			System.out.print("Enter quantity : ");
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
		
		System.out.println("Total amount of items : RM" + amount);
		System.out.printf("Discount received: RM %.2f%n" , discount);
		System.out.printf("Price to be paid: RM %.2f%n" , (amount - discount ));
		System.out.println();

		System.out.println("THANK YOU AND COME AGAIN!!");
	}

		public static void printName() {
			Scanner input = new Scanner(System.in);
		
			System.out.print("Enter your name : ");
			String name = input.nextLine();
			System.out.println("Name :" + name);
		}
	
		public static void printIC() {
			Scanner input = new Scanner(System.in);
		
			System.out.print("Enter your No. IC : ");
			String hp = input.next();
			System.out.println("H/P : " + hp);
		}
	
		public static void printHP() {
			Scanner input = new Scanner(System.in);
		
			System.out.print("Enter your No. H/P : ");
			String hp = input.next();
			System.out.println("H/P : " + hp);
		}
}
