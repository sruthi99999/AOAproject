//Java Program to implement the
// above approach
package AOAProject;
import java.io.*;
import java.util.*;

class Housen {
    int startDay;
    int endDay;
    int number;

    public Housen(int startDay, int endDay,int number) {
        this.startDay = startDay;
        this.endDay = endDay;
        this.number=number;
    }

		
}

class Strat2Comparator implements Comparator<Housen>
{
	public int compare(Housen a,Housen b) {
		return a.startDay < b.startDay ? 1 : -1;
	}
}

 public class Strat2 {
    public static void main(String[] args) {
        //int n = 7; // Number of days
        //int m = 5; // Number of houses
    	
        
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();// Number of days
    	int m = sc.nextInt();// Number of houses


        // Create an array of houses
        Housen[] houses = new Housen[m];
        for(int i=0; i<m; i++) {
        	houses[i] = new Housen(sc.nextInt(),sc.nextInt(),i+1);
        }
        Comparator <Housen> comparator = new Strat2Comparator();
        PriorityQueue<Housen> queue=new PriorityQueue<Housen>(5,comparator);
        int index=0;
        for(int i=1;i<=n;i++)
        {
        	while (index < m && houses[index].startDay <= i)
            {
              queue.add(houses[index]);
              //System.out.println(queue.peek().startDay);
              index++;
            }
        	
        	while (queue.size() > 0 && queue.peek().endDay < i)
                queue.poll();
        	
        	if (queue.size() == 0)
                continue;
        	
        	System.out.println(queue.peek().number);
        	
        	queue.poll();
        	
        	
        }
        	
        	
        	
        	 

        
    }
}


 
