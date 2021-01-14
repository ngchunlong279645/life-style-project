import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		int choice;
		Scanner scan = new Scanner (System.in);
		do {
		System.out.println("Welcome ");
		
		System.out.println("1=camera 2=shoe 3=watches 4=pen 5=clothes 6=bag");
		System.out.print("Please choose your service :");
		int service = scan.nextInt();
		
		if(service==1) {
			Camera c = new Camera();
			c.main(args);
		}
		if(service==2) {
			Shoe s = new Shoe();
			s.main(args);
		}
		if(service==3) {
			Watches w = new Watches();
			w.main(args);
		}
		if(service==4) {
			Pen p = new Pen();
			p.main(args);
		}
		if(service==5) {
			clothes cl = new clothes();
			cl.main(args);
		}
		if(service==6) {
			bag b = new bag();
			b.main(args);
		}
		
		System.out.println("");
		System.out.println("DO YOU WANT TO CONTINUE ? 1=YES 2=NO");
		choice=scan.nextInt();
		}while (choice==2);
	}
}	