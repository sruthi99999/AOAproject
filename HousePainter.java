//Java Program to implement the
// above approach
package AOAProject;
import java.io.*;
import java.util.*;

class House {
    int startDay;
    int endDay;

    public House(int startDay, int endDay) {
        this.startDay = startDay;
        this.endDay = endDay;
    }
}

 public class HousePainter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();// Number of days
    	int m = sc.nextInt();// Number of houses


        // Create an array of houses
        House[] houses = new House[m];
        for(int i=0; i<m; i++) {
        	houses[i] = new House(sc.nextInt(),sc.nextInt());
        }
        
        
       
        int i,k;
        for (i=1,k=0;i<=n;  )
        	
        {
        	if(houses[k].startDay<=i && houses[k].endDay>=i)
        	{
        		System.out.println(k+1);
        		i++;
        		}
        	k++;
        	
        	if(k>m-1) break;
        	
        	if(houses[k].startDay>i)
        		i=houses[k].startDay;
        	
        	
        	 }

        
    }
}


 
