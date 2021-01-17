import java.util.Scanner;

public class Camera {
	public static void main(String[] args) {
		char next;	
// ITEM LIST	
		display();	
		
//CALCULATION FOR ITEM 

		do {
			double total,output,price1,price2=0,price3 = 0,quantity1,quantity2=0,quantity3=0,dis;
			Scanner scan = new Scanner(System.in);
			String[] info = new String[3];
			System.out.print("Enter Your Name : ");
			info[0] = scan.nextLine();
			System.out.print("Enter Your Age : ");
			info[1] = scan.next();
			System.out.print("Enter Your City : ");
			info[2] = scan.next();
			
		System.out.print("Enter the number of item : ");
		int number = scan .nextInt();
		
		if(number==1) {
			System.out.print("Enter price of first item : RM");
			price1 = scan.nextDouble();
			System.out.print("Enter quantity of first item : ");
			quantity1 = scan.nextDouble();
			
			
			}else if(number==2) {
				System.out.print("Enter price of first item : RM");
				price1 = scan.nextDouble();
				System.out.print("Enter quantity of first item : ");
				 quantity1 = scan.nextDouble();
				System.out.print("Enter price of second item : RM");
				 price2 = scan.nextDouble();
				System.out.print("Enter quantity of second item : ");
				 quantity2 = scan.nextDouble();
				
				
				
			}else {
				System.out.print("Enter price of first item : RM");
				 price1 = scan.nextDouble();
				System.out.print("Enter quantity of first item : ");
				quantity1 = scan.nextDouble();
				System.out.print("Enter price of second item : RM");
				 price2 = scan.nextDouble();
				System.out.print("Enter quantity of second item : ");
				 quantity2 = scan.nextDouble();
				System.out.print("Enter price of third item : RM");
				 price3 = scan.nextDouble();
				System.out.print("Enter quantity of third item : ");
				 quantity3 = scan.nextDouble();
				
				
			}
		
		total = (price1*quantity1)+(price2*quantity2)+(price3*quantity3);
		if(total>100) {
			dis = (total*25)/100;
		}else {
			dis = (total*15)/100;
		}
		output = total -dis;
		System.out.println();
		//System.out.println("Thank You "+name+ " , "+age+" years old from "+city);
		output(info);
		
		System.out.printf("Total price : RM%.2f%n",total);
		System.out.printf("Discount received : RM%.2f%n",dis);
		System.out.printf("Price to be paid : RM%.2f%n",output);
		System.out.println();
		
//**********************************	
		
		for (int i = 1; i <= 10; i++) {
	        for (int j = 1; j <= 4; j++) {
	            System.out.print("*");
	        }
	        System.out.print("!");
	    }
	    System.out.println();
	      
// CALCULATION + BAG	
    
		 System.out.print("Do You Want A Bag ? (Y)=yes (N)=no: ");
	      char bag = scan.next().charAt(0);
	      
	      if((bag == 'Y') ||(bag == 'y')|| (bag == 'N')|| (bag == 'n')){
	         if(bag =='Y'||(bag == 'y')){
	            output= output +0.50;
	            System.out.print("Plastic bag or Paper bag? [ 1=plastic 2=paper ]: ");
	            char type = scan.next().charAt(0);
	            if((type == '1') || (type == '2')){
	               if(type == '1'){
	            	   output = output + 0.10;
	               System.out.printf("Total cash payment: RM%.2f",output);
	               System.out.println("");
	               System.out.println("THANK YOU AND PLEASE COME AGAIN!");
	               }
	               else {
	            	   output = output + 0.15;
	               System.out.printf("Total cash payment: RM%.2f",output);
	               System.out.println("");
	            System.out.println("THANK YOU AND PLEASE COME AGAIN!");
	               }
	            }
	            else
	            System.out.print("Invalid Input Please try again!");
	         }
	         else{
	        	 System.out.printf("Total cash payment: RM%.2f",output);
	        	 System.out.println("");
		            System.out.println("THANK YOU NO PLASTIC BAG IS GOOD FOR NATURE!");
	         }
	      }else  {
	    	  System.out.println("Invalid Input Please try again! !");
	      }

	     
//continue			      
	      System.out.print("Do You Want To Continue ?(Y)=yes (N)=no: ");
	     
			next = scan.next().charAt(0);
	}while(next=='y' || next=='Y');
		
		
		 System.out.println("THANK YOU AND PLEASE COME AGAIN!");
		 
} 


	public static void display() {
	String[][] product ={{"Fujifilm X-T4","Canon EOS R6","Nikon Z6 II"},
					{"RM1500","RM2000","RM1750"}
					};
	
	System.out.println("-------------------------------------");
	
	System.out.println("!!WELCOME TO LALAZA CAMERA SHOP!!");
	System.out.println("!!!!! BIG SALES !!!!! ");
	System.out.println("ITEM 1 ***"+product[0][0]+"-"+product[1][0]+"***");
	System.out.println("ITEM 2 ***"+product[0][1]+"-"+product[1][1]+"***");
	System.out.println("ITEM 3 ***"+product[0][2]+"-"+product[1][2]+"***");
	
	System.out.println("---------------------------------------");
	}
	
	
	public static void output(String[] input) {
		int x=0;
		while(x<=39) {
			System.out.print(">");
			x++;
		}
		System.out.println();
		System.out.println("");
	System.out.println("<---------PERSONAL"+" "+"INFORMATION--------->");
	System.out.println("");
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("");
	
	System.out.println("Name = "+input[0]);
	System.out.println("Age = "+input[1]);
	System.out.println("City = "+input[2]);
	
	
	}
	
	
	
	
	
	
	
	
	}


