import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		char choices;
		Scanner scan = new Scanner (System.in);
		do {
		System.out.println("^#^  ^~^  Welcome To Group 6 MegaMall ^.^  ^_^   ");
		
		System.out.println("1=Camera 2=Shoe 3=Watches 4=Pen 5=Clothes 6=Bag");
		System.out.print("Please choose your service :");
		int service = scan.nextInt();
		
		if(service==1) {
			Camera c = new Camera();
			c.main(args);
		}
		else if(service==2) {
			Shoe s = new Shoe();
			s.main(args);
		}
		else if(service==3) {
			Watches w = new Watches();
			w.main(args);
		}
		else if(service==4) {
			Pen p = new Pen();
			p.main(args);
		}
		else if(service==5) {
			clothes cl = new clothes();
			cl.main(args);
		}
		else if(service==6) {
			bag b = new bag();
			b.main(args);
		}else {
			System.out.println("Invalid Number ! Please Try Again ~ ^.^");
		}
		
		
		System.out.println("");
		System.out.println("DO YOU WANT TO RETURN TO THE MAIN MENU  ? Y=YES N=NO");
		choices=scan.next().charAt(0);
		}while (choices=='y' || choices=='Y');
	}
}	