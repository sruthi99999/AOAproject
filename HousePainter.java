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
        //int n = 7; // Number of days
        //int m = 5; // Number of houses
        
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();// Number of days
    	int m = sc.nextInt();// Number of houses


        // Create an array of houses
        House[] houses = new House[m];
        for(int i=0; i<m; i++) {
        	houses[i] = new House(sc.nextInt(),sc.nextInt());
        }
        
        /*House[] houses = new House[m];
        houses[0] = new House(1, 2);
        houses[1] = new House(2, 2);
        houses[2] = new House(2, 7);
        houses[3] = new House(3, 3);
        houses[4] = new House(4, 6);*/

       
        int i,k;
        // Iterate over each day and paint the house with the earliest end day for that start day
        for (i=1,k=0;i<=n;  )
        	
        {
        	
        	
        	if(houses[k].startDay<=i && houses[k].endDay>=i) {
        		System.out.println(k+1);
        		i++;
        		}
        	//else i--;
        	k++;
        	if(k>m-1) break;
        	
        	if(houses[k].startDay>i)
        		i=houses[k].startDay;
        	
        	/*if(k<m-1)
        	{
        			if(houses[k+1].startDay>i )
        		i++;
        			k++;
        	}*/
        	
        	/*if(k<m)
    		{
    			k++;
    			
    			
    		}*/
    		
        	
        	
        	
        	 }

        
    }
}


 
