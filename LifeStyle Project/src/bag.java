import java.util.Scanner;

public class bag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner sc=new Scanner (System.in);
		String[] data= {"name","no"};
		System.out.print("Please Enter Your Name:");
		data[0]=sc.nextLine();
		System.out.print("Please Enter Your Number Phone : ");
		data[1]=sc.nextLine();
		output(data);
        printhandbag();
	}
	
	public static void output (String[] data) {
		System.out.println("Your data: ");
		for (int a=0;a<data.length;a++)
		System.out.println(data[a]);
		for (int i=0; i<35;i++) {
			System.out.print("*");
		} System.out.println();	
	}
	
	public static void printhandbag() {
		Scanner sc=new Scanner (System.in);
		char brand=0,product;
		double amountTendered,balance;
		char more=0,code1;
		int quantity1,quantity2,quantity3,gucci=100,coach=280,louisvouitton=500;
		int i=20,j=20,k=15;
		do { 
			   double total=0,total2=0,total3=0;
			   int total6=0,total5=0,total4=0;
			   double totalPrice = 0;
		do {
	    code1=0;
		System.out.print("Enter the product did you want to buy (Enter 'H' for handbag) : ");
		product= sc.next().charAt(0);
		if (product=='H' || product=='h') {
			System.out.print("Please enter 'G' for gucci or 'C' for coach or 'L' for louis vouitton : ");
			brand= sc.next().charAt(0);
			if (brand=='G' || brand=='g' ) {
				System.out.println();
				System.out.println("GUCCI BRAND");
				System.out.println("Price for each bag is RM 100 ");
				System.out.println("Quantity available for this brand is : " +i);
				System.out.print("Enter the quantity that you want to buy : ");
				quantity1= sc.nextInt();
				while (quantity1<0 || i<quantity1 ) {
	            	if (quantity1<0) {
	            		System.out.println();
	            		System.out.print("Error. Cannot input negative value!!");
	            		System.out.print("\nPlease input the quantity: ");
	            		quantity1=sc.nextInt();
	            	}
	            	else {
	            		System.out.println();
	            		System.out.print("Error. Quantity more than quantity in stock!! Quantity available for Gucci is " +i);
	        			System.out.print("\nPlease input the quantity: ");
	        			quantity1=sc.nextInt();
	            	}
	            }
	            int [] gucci1 = new int [quantity1];
	            for (int x=1; x<=gucci1.length ; x=x+1) {
	         			total = gucci + total;
	           			total4=total4+1;
	           			i=i-1;
	          	}
	            System.out.println();
	    	    System.out.print("More Handbag (Y/N)?: ");
	            more = sc.next().charAt(0);
			}
			else if (brand=='C' || brand=='c') {
				System.out.println();
				System.out.println("COACH BRAND");
				System.out.println("Price for each bag is RM 280 ");
				System.out.println("Quantity available for this brand is : " +j);
				System.out.print("Enter the quantity that you want to buy : ");
				quantity2= sc.nextInt();
				while (quantity2<0 || j<quantity2 ) {
	            	if (quantity2<0) {
	            		System.out.println();
	            		System.out.print("Error. Cannot input negative value!!");
	            		System.out.print("\nPlease input the quantity: ");
	            		quantity2=sc.nextInt();
	            	}
	            	else {
	            		System.out.println();
	            		System.out.print("Error. Quantity more than quantity in stock!! Quantity available for Coach is " +j);
	        			System.out.print("\nPlease input the quantity: ");
	        			quantity2=sc.nextInt();
	            	}
	            }
	            int [] coach1 = new int [quantity2];
	            for (int b=1; b<=coach1.length ; b=b+1) {
	         			total2 = coach + total2;
	           			total5=total5+1;
	           			j=j-1;
	          	}
	            System.out.println();
	    	    System.out.print("More Handbag (Y/N)?: ");
	            more = sc.next().charAt(0);
			}
			else if (brand=='L' || brand=='l') {
				System.out.println();
				System.out.println("LOUIS BRAND");
				System.out.println("Price for each bag is RM 500 ");
				System.out.println("Quantity available for this brand is : " +k);
				System.out.print("Enter the quantity that you want to buy : ");
				quantity3= sc.nextInt();
				while (quantity3<0 || k<quantity3 ) {
	            	if (quantity3<0) {
	            		System.out.println();
	            		System.out.print("Error. Cannot input negative value!!");
	            		System.out.print("\nPlease input the quantity: ");
	            		quantity3=sc.nextInt();
	            	}
	            	else {
	            		System.out.println();
	            		System.out.print("Error. Quantity more than quantity in stock!! Quantity available for Coach is " +k);
	        			System.out.print("\nPlease input the quantity: ");
	        			quantity3=sc.nextInt();
	            	}
	            }
	            int [] louis1 = new int [quantity3];
	            for (int c=1; c<=louis1.length ; c=c+1) {
	         			total3 = louisvouitton + total3;
	           			total6=total6+1;
	           			k=k-1;
	          	}
	            System.out.println();
	    	    System.out.print("More Handbag (Y/N)?: ");
	            more = sc.next().charAt(0);
			}
			else {
				System.out.println();
				System.out.println("Invalid code. G,C,L ONLY!!");
				code1='Y';
			}
		
		}
		else {
			System.out.println();
			System.out.println("Sorry our store did not provide that item");
			System.out.println("Do you want to purchase item ? Enter Y/N ");
			more = sc.next().charAt(0);
		}
		}while(more=='Y' || code1=='Y' || more=='y');
		totalPrice=total+total2+total3;
		System.out.println();
		System.out.println("Thank you for shopping with Sogo");
	    System.out.println("******************");
		System.out.println("Product that you buy :Handbag ");
        System.out.println("You bought:");
        System.out.printf("\n%1s%31s%13s" , "Brand" , "Quantity" , "Price (RM)");
	    System.out.print("\n--------------------------------------------------");
	    if (total4>0 ) {
	     System.out.printf("\n%1s%26s%16.2f" , "GUCCI" , total4 , total);
       	 System.out.print("\n--------------------------------------------------");
        }
        if (total6>0) {
       	 System.out.printf("\n%1s%18s%16.2f" , "LOUIS VOITTON" , total6 , total3);
       	 System.out.print("\n--------------------------------------------------");
        }
        if (total5>0) {
       	 System.out.printf("\n%1s%26s%16.2f" , "COACH" , total5 , total2);
       	 System.out.print("\n--------------------------------------------------");
        }
        System.out.printf("\n%1s%36.2f" , "Total Price" , totalPrice);
        System.out.print("\n******************");
        System.out.print("\nPlease enter Amount Tendered: RM ");
        amountTendered = sc.nextDouble();
        if (amountTendered >= totalPrice)
        {
           balance = amountTendered - totalPrice;
           System.out.printf("%1s%43.2f" , "Balance" , balance);
           System.out.println("\n*******************");
           System.out.println("$$$$$$$$$$--THANK YOU. PLEASE COME AGAIN--$$$$$$$$$");
        }
        else
        {
           System.out.println("Error. Input cannot less than Amount Tendered!!");
           System.out.print("Please enter Amount Tendered: RM ");
           amountTendered = sc.nextDouble();
           balance = amountTendered - totalPrice;
           System.out.printf("%1s%43.2f" , "Balance" , balance);
           System.out.println("*****************");
           System.out.println("$$$$$$$$$$--THANK YOU. PLEASE COME AGAIN--$$$$$$$$$");
        } 
	       System.out.println();
	       System.out.print("Do you want to add another handbag (Y/N)?:");
	       more = sc.next().charAt(0);
		   }while(more=='y' || more=='Y');
		   System.out.println();
		   System.out.print("--------Program Exit--------");
	}

}