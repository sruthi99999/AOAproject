package AOAProject;
import java.io.*;
import java.util.*;

class Strat4Comparator implements Comparator<Housen>
{
	@Override
	public int compare(Housen a,Housen b) {
		return a.endDay > b.endDay? 1 : -1;
	}
}

 public class strat4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();// Number of days
    	int m = sc.nextInt();// Number of houses


        // Create an array of houses
        Housen[] houses = new Housen[m];
        for(int i=0; i<m; i++) {
        	houses[i] = new Housen(sc.nextInt(),sc.nextInt(),i+1);
        }
        Comparator <Housen> comparator = new Strat4Comparator();
        PriorityQueue<Housen> queue=new PriorityQueue<Housen>(m,comparator);
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


 
