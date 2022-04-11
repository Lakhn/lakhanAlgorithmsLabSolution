package lab2problem;
import java.util.Scanner;


public class paymoney {
	public static void main(String[] args)  {
		  {  
			    int c, n, target, array[];  
			   
			    Scanner in = new Scanner(System.in);  
			    System.out.println("Enter size of transition");  
			    n = in.nextInt();   
			    array = new int[n];  
			    System.out.println("Enter the value of array");  
			   
			    for (c = 0; c < n; c++)  
			      array[c] = in.nextInt();  
	     

		System.out.println("Enter the total no of targets that needs to be achieved");	
		  target= in.nextInt();  
		   
		  
		  while(target--!=0) {
			  int flag=0;
			  long targetno;
			  System.out.println("Enter the value of target");
			  targetno=in.nextInt(); 
			   long sum=0;
			   
			   for (c = 0; c < n; c++)  {
				   sum+=array[c];
				   
				   if (sum>=targetno){
					   
					   System.out.println("Target achieved after"+(c+1)+"transaction");   
					   flag=1;
					   break;
					   
				   }
			   } 
				   
				 if(flag==0)  {
					System.out.println("target not achieved"); 
					 
				 }
				   
		  }
}
}
}		
			   
				   
				   
			
			   
			   
			   
			   
		
	
