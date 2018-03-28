import java.util.*;

//AUTHOR - YUNFEI ZHOU(s3598797)

public class MiniNet extends Menu 
{

	public static void main (String[] args) 
	{
		Menu M = new Menu();					// Object of menu
		
		int t,p;
		for(t=0;t<100;t++)
		{
			for(p=0;p<100;p++) 
			{
				M.friends[t][p]=""; 			// initializing the array with null value 
				 	
				M.family[t][p]="";			// initializing the array with null value 
				
			}
		}
		
		M.i=8;			// number of existing records of people in the net array
		M.fr=8;			// number	of existing records of people in the friends array
		M.fa=1;			// number	of existing records of people in the family array
		
		
		M.userDatabase();	// to automatically add some people in the network as the program is executed
		M.makeMenu();
		
		
		
	}
	
}

