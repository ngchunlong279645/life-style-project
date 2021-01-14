import java.util.Scanner;

public class Shoe {
	public static void main(String[] args) {
		personalbackground();
		productprovide();
		afterservice();
		

	}
	
	public static void personalbackground() {
		Scanner in=new Scanner(System.in);
		System.out.println("^^^^^ Welcome Shopping At Day-Day Shoe ^^^^^");
		String[] details= {"name","no","mail","home"};
		System.out.print("Enter you name: ");
		details[0]=in.nextLine();
		System.out.print("Contact number(personal): ");
		details[1]=in.nextLine();
		System.out.print("E-mail address: ");
		details[2]=in.nextLine();
		System.out.print("Home address: ");
		details[3]=in.nextLine();
		System.out.println();
		System.out.println("Please check your biodata: ");
		for (int q=0;q<details.length;q++)
		System.out.println(details[q]);
		for (int i=0; i<35;i++) {
			System.out.print("*");
		} System.out.println();	
	}

	public static void productprovide() {
		Scanner in=new Scanner(System.in);
		int j,k,l;
		double sum,offer=0;
		double total=0,discount=0;
		System.out.println("3 types of product we provided: ");
		String[][] shoes= {{"Snearkers (1)","Hiking boots (2)","Basketball shoes(3)"},
							{"30","50","70"}};
		System.out.println(shoes[0][0]+"       :RM"+shoes[1][0]);
		System.out.println(shoes[0][1]+"    :RM"+shoes[1][1]);
		System.out.println(shoes[0][2]+" :RM"+shoes[1][1]);
		j=Integer.parseInt(shoes[1][0]);
		k=Integer.parseInt(shoes[1][1]);
		l=Integer.parseInt(shoes[1][2]);
		System.out.println();
		System.out.println("10% discount is given if you buy more than 5");
		System.out.println("20% discount is given if you buy more than 10\n");
		System.out.print("What product are you prefer (Enter the code, 0 to end): ");
		int shoe=in.nextInt();
		for (int i = 0; i<Integer.MAX_VALUE; i++) {	
		if (shoe==1) {
			System.out.print("How many pair of sneakers you want to order: ");
			int q0=in.nextInt();
				if (q0<=5) {
					sum=(q0*j);
					System.out.printf("For sneakers you need to pay: RM%.2f\n",(sum));
					total+=sum;	
					offer=0;
					discount+=offer;
				} else
				if (q0>5 && q0<=10) {
					sum=(q0*j*0.9);
					System.out.printf("For sneakers you need to pay: RM%.2f\n",(sum));
					total+=sum;
					offer=(j*0.1*q0);
					discount+=offer;
				} else
				if (q0>10) {
					sum=(q0*j*0.8);
					System.out.printf("For sneakers you need to pay: RM%.2f\n",(sum));
					total+=sum;	
					offer=(j*0.2*q0);
					discount+=offer;
				} System.out.println();
			} else
		if (shoe==2) {
			System.out.print("How many pair of hikiing balls you want to order: ");
			double q0=in.nextInt();
				if (q0<=5) {
					sum=(q0*k);
					System.out.printf("For hiking boots you need to pay: RM%.2f\n",(sum));
					total+=sum;		
					offer=0;
					discount+=offer;
				} else
				if (q0>5 && q0<=10) {
					sum=(q0*k*0.9);
					System.out.printf("For hiking boots you need to pay: RM%.2f\n",(sum));
					total+=sum;	
					offer=(k*0.1*q0);
					discount+=offer;
				} else
				if (q0>10) {
					sum=(q0*k*0.8);
					System.out.printf("For hiking boots you need to pay: RM%.2f\n",(sum));
					total+=sum;		
					offer=(k*0.2*q0);
					discount+=offer;
				} System.out.println();
			} else
		if (shoe==3) {
			System.out.print("How many pair of basketball shoes you want to order: ");
			double q0=in.nextInt();
				if (q0<=5) {
					 sum=(q0*l);
					System.out.printf("For basketball shoes you need to pay: RM%.2f\n",(sum));
					total+=sum;
					offer=0;
					discount+=offer;
				} else
				if (q0>5 && q0<=10) {
					sum=(q0*l*0.9);
					System.out.printf("For basketball shoes you need to pay: RM%.2f\n",(sum));
					total+=sum;
					offer=(l*0.1*q0);
					discount+=offer;
				} else
				if (q0>10) {
					sum=(q0*l*0.8);
					System.out.printf("For basketball shoes you need to pay: RM%.2f\n",(sum));
					total+=sum;
					offer=(l*0.2*q0);
					discount+=offer;
				} System.out.println();
			} else	
		 if (shoe==0) {
			System.out.printf("Total: RM%.2f\n",(total));
			System.out.printf("Total discount given: RM%.2f\n",(discount));
			System.out.println("Thanks for shopping with us!!!");
			break;
		 } 
		else {
			System.out.println("Please enter 1, 2 or 3 only.");
			System.out.println("Please enter the code again.");				
			System.out.println();
		} 
		
		System.out.print("What product are you prefer (Enter the code, 0 to end): ");
		shoe=in.nextInt();
		} System.out.println();	
	}
	
	public static void afterservice() {
		Scanner in=new Scanner(System.in);
		int i=0;
			do {
				System.out.print("*");
				i++;
			} while (i<=35);
		System.out.print("\nAre you satisfied with our service (Press Y for yes / N for No): ");
		char service=in.next().charAt(0);
		System.out.println();
		
		if (service=='Y' || service=='y') {
			int a=0;
			while (a<6) {
				System.out.print("(^_^)   ");
				a++;
			 } System.out.println();
			System.out.println("We can't wait to serve you again!!\nWish you have a great day!!!");		
		} else
		if (service=='n' || service=='N') {
			int a=0;
			while (a<6) {
				System.out.print("(>_<)   ");
				a++;
			 } System.out.println();
			System.out.println("Kindly leave you comment here for our mistaken: ");
			String comment=in.next();
			System.out.println("Appreciate your advice and thanks for your patient.");
		} else
		if (service!='Y' && service!='y' && service!='n' && service!='N') {
			System.out.println("Not valid");			
		}
	}		

}
