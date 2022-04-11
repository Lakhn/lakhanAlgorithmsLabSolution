package problem2;
import java.util.Arrays;
import java.util.Scanner;
public class currency {
	
	public static void main (String[] args)  {
	
		System.out.println("enter the size of curreny demonitation");
		Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] note=new int[size];
	System.out.println("enter the curreny demonitation");

	for(int i=0;i<size;i++) {
		note[i]=sc.nextInt();
	}
	System.out.println("enter the amount you want to pay");
	int amount=sc.nextInt();
	Arrays.sort(note,0,note.length-1);
	currency.notecounterimp(note,amount);
	}



public static void notecounterimp(int note[],int amount) {
	int[] notecounter=new int[note.length];
		
	try {
		for (int i=0;i<note.length;i++){
	if(amount>=note[i]) {
		notecounter[i]=amount/note[i];
		amount=amount-notecounter[i]*note[i];
	}
	}
	if(amount>0) {
		System.out.println("Extract amount cannot given high demnistation");
	}
	else {
		System.out.println("your payment approach in order to minnimum no of note");
	for(int i=0;i<note.length;i++) {
		if(notecounter[i]!=0) {
			System.out.println(note[i]+":"+notecounter[i]);
		}
	}
	}
	}
	catch (ArithmeticException e) {
		System.out.println(e+"note denomination insvalid 0");
	}
	}
}

