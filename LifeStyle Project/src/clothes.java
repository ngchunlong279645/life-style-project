import java.util.Scanner;

public class clothes {

	public static void main(String[] args) {
		char next;
		do {
		Scanner sc= new Scanner (System.in);
		System.out.println (" Welcome to njbhtqh.co! ");
		String[] name=new String[1];
		String[] gender=new String[1];
		
		for(int d=0; d<name.length;d++) {
			System.out.print("Enter name and gender: ");
			name[d]= sc.next();
			gender[d]=sc.next();
		}
		/*for(int d =0;d<name.length;d++) {
			System.out.println("Name: "+ name[d]+", gender: "+ gender[d]);
		} */
		
		 output(name,gender);
		

		String[] Name= {"Nana", "Mohd", "Ali", "Tiqah", "Atin"};
		int[] Comingtoshop= {1,2,3,1,4};
		
		int VIP = Comingtoshop[0];
		String Nameold = name[0];
		for(int i=1;i<name.length;i++) {
			if(Comingtoshop[i]>VIP) {
				VIP = Comingtoshop[i];
				Nameold = Name[i];
			}
		}
		display(VIP,Nameold);
		
	System.out.print("Please enter the code to purchase (exp:1/2/3/4/5/6: ");
	int code = sc.nextInt();
		
	System.out.print("Please enter the quantity of clothes (maximum 2 ) you want to purchase: ");
	int quantity = sc.nextInt();
	System.out.println();
	

	int total =0;
	if (code == 1 && quantity == 1) {
		total = 10;
		System.out.println("You had purchase 1 T-shirts -Shirt " +"\n" + "The total is RM10");
	} else if (code == 1 && quantity == 2) {
		total = 20;
		System.out.println( "You had purchase 2 T-shirts -Shirt" +"\n" + "The total is RM20");
	} else if (code == 2 && quantity == 1) {
		total = 20;
		System.out.println("You had purchase  1 Shortpants -Pants" +"\n" + "The total is RM20");
	} else if (code == 2 && quantity == 2){
		total = 40;
		System.out.println("You had purchase 2 Shortpants -Pants" +"\n" + "The total is RM40");
	} else if (code == 3 && quantity == 1){
		total = 30;
		System.out.println("You had purchase 1 Jackets -Outerwear" +"\n" + "The total is RM30");
	} else if (code == 3 && quantity == 2) {
		total = 60;
		System.out.println("You had purchase  2 Jackets -Outerwear" +"\n" + "The total is RM60");
	} else if (code == 4 && quantity == 1) {
		total = 10;
		System.out.println("You had purchase 1 Blouse -Shirt" +"\n" + "The total is RM10");
	} else if (code == 4 && quantity == 2) {
		total = 20;
		System.out.println("You had purchase 2 Blouse -Shirt" +"\n" + "The total is RM20");
	} else if (code == 5 && quantity == 1) {
		total = 20;
		System.out.println("You had purchase 1 Skirts -Pants" +"\n" + "The total is RM20");
	} else if (code == 5 && quantity == 2) {
		total = 40;
		System.out.println("You had purchase 2 Skirts -Pants" +"\n" + "The total is RM40");
	} else if (code == 6 && quantity == 1) {
		total = 30;
		System.out.println("You had purchase 1 Hoodie -Outerwear" +"\n" + "The total is RM30");
	} else if (code == 6 && quantity == 2){
		total = 60;
		System.out.println("You had purchase 2 Hoodie -Outerwear" +"\n" + "The total is RM60");
	} else {
		System.out.println("Invalid code!");
	}
		
	System.out.println();
	totalPurchase(total);
	System.out.print("Do You Want To Continue ?(Y)=yes (N)=no: ");
    
		next = sc.next().charAt(0);
		}while(next=='y' || next=='Y');
		
	}
	
	public static void display(int VIP,String nameold) {
		
		System.out.print("The VIP customer is: "+ nameold +", "+VIP);
		
		

		System.out.println("Type of clothes we have for you are: ");
		
		String[][] clothes ={ {"1.T-shirts", "2.Shortpants", "3.Jackets", "4.Blouse", "5.Skirts", "6.Hoodie"},
							{"-Shirt", "-Pants", "-Outerwear","-Shirt", "-Pants", "-Outerwear"}
	};
		System.out.println(clothes[0][0] + " " +clothes[1][0]);
        System.out.println(clothes[0][1] + " " +clothes[1][1]);
        System.out.println(clothes[0][2] + " " +clothes[1][2]);
        System.out.println(clothes[0][3] + " " +clothes[1][3]);
        System.out.println(clothes[0][4] + " " +clothes[1][1]);
	{	System.out.println(clothes[0][5] + " " +clothes[1][2]);
	
	System.out.println();
	System.out.println("Here is the pricelist for the clothes: ");
	System.out.println("RM10 for shirt, Rm20 for pants, RM30 for outerwear.");
	}
	}
	
	public static void totalPurchase(int total) {
	System.out.println("Total you need to pay: RM" +total );
	System.out.println ("Thankyou for your purchase at njbhtqh.co! ");
	}
	
	public static void output (String[] name,String[] gender) {
		
		System.out.println("Name     :" + name[0]);
		System.out.println("Gender   :" + gender[0]);
		System.out.println();
	}
	
}