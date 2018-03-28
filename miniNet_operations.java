import java.util.*;


// AUTHOR - MANAN TYAGI(s3674211)

public class miniNet_operations extends Network {
	
	private int s;
	
													// method to add user
	
	public void addUser() 
	{
		super.makeProfile();							// this method is defined in the super class which Network
	}
													//METHOD TO SHOW PEOPLE IN THE NETWORK
	
	
	public void showPeopleInNetwork() {
			for(int y=0;y<i;y++) {
				if(!"".equals(net[y][0])) {		//this condition make sure that the code doesn't print null  values
					
					System.out.println(net[y][0]);
					
				}	
		}
		}
	
													// method to select person
	
	public void selectPerson(String NAME) {
		for(s=0;s<i;s++) 
		{										
			if(net[s][0].equals(NAME)) 				
			{
				name=NAME;
				age=net[s][1];
				status= net[s][2];
				showProfile(NAME);				// this method is in the network class
			}
		}
	}
	
													//method to to make connections between people
	
	public void connections(String user1, String user2) {
		int age1=0,age2=0;
		for( s=0;s<i;s++)
		{
			if(user1.equals(net[s][0])) 
				age1= Integer.valueOf(net[s][1]);	// this type casting string value into interger value
				
				if(net[s][0].equals(user2)) 
					 age2 = Integer.valueOf(net[s][1]);	 
				
			
				
		}
														// logic to add connection according to the age of the user
		
					if((age1<=16 && age2<=16 && Math.abs(age1-age2)<=3)||(age1>16 && age2>16)) 
					{
						for(m=0;m<i;m++) 
						{
							if(friends[m][0].equals(user1)) 
							{	
								for(int n=0;n<100;n++) 
								{	
									if("".equals(friends[m][n])) 	// this checks for the null value in the array
									{
										friends[m][n]=user2;
										break;
									}
								}
							}
							else if(friends[m][0].equals(user2))
							{
								for(int n=0;n<100;n++) 
								{
									if("".equals(friends[m][n])) 
									{			
										friends[m][n]=user1;
										break;
									}
								}
							}
						
							else
								continue;		
						}
					
				}
					else
						System.out.println("connection not possible");	
					System.out.println("\n\n");
			}
			
																		//method to check direct friend relation between two people
	
	public String directFriend(String user1, String user2) 
	{
		for(int v=0;v<=i;v++) 
		{
			if(user1.equals(friends[v][0])) 
			{
				
				for(s=0;s<=i;s++) 
				{
					if(user2.equals(friends[v][s]))
						return ("THEY ARE DIRECT FRIENDS");
					
				}
			}
		}
		return ("THEY ARE NOT DIRECT FRIENDS");
	}
	
																		// METHOD FOR FINDING PARENTS of a child
	
	public void findParents(String child1) {
 		for(m=0;m<=i;m++) {
			
			if(family[m][0].equals(child1))
			{
				System.out.println("PARENTS ARE:");
				for(s=0;s<=2;s++)
					System.out.println(family[m][s+1]);
				System.out.println("\n\n");
			}
		}
	}
	
																		// METHOD FOR FINDING CHILD'S NAME when his/her parents is provided
	
	public void findChild(String parent1, String parent2) 
	{
	//	System.out.println("NAME OF THE CHILD IS:");
		for(m=0;m<=i;m++) 
		{
			if(((family[m][1].equals(parent1)) && (family[m][2].equals(parent2)) )) 
			{
							System.out.println("Name of their child is:");
							System.out.println(family[m][0]);	
			}
			 if(((family[m][1].equals(parent2)) && (family[m][2].equals(parent1)) )) {
				System.out.println("Name of their child is:");
				System.out.println(family[m][0]);	
				
				
			}
		}
	}
																		//METHOD TO DELETE PEOPLE FROM THE NETWORK(FOR ADMIN USE)
	public void deletePeople(String user1) {
		int b=0,c=0;
			for(int q=0;q<i;q++) 
			{
				
				if(user1.equals(net[q][0])) 
				{
					
					c=q;
				for(c=q;c<=i;c++) 
					{
					for(b=0;b<3;b++) 						//deleting record from the net array
					net[c][b]=net[c+1][b];					//this statement copy's next column element into the current
															//deleting record from the friends array
					b=0;
							
					}
				
				
				
				
				}
				for(c=0;c<i;c++) {							// fr is the number of persons in the friends array
					if(friends[q][c].equals(user1)) {
						for(int d=c;d<i;d++)
						friends[q][d]=friends[q][d+1];}			//this statement copy's next column element into the current
					else if("".equals(friends[q][c]))
						break;
					else
						continue;
					}
			}
			i--;
		}
	
	
																		//METHOD TO DELETE PEOPLE FROM THE NETWORK(FOR ADMIN USE)
	public void deletefriend(String user, String friend) {
		int b=0,c=0;
		for(int q=0;q<i;q++) 
		{
			
			if(user.equals(friends[q][0])) 
			{
				
				for( c=0;c<=i;c++) 
				{
					if(friend.equals(friends[q][c])) {
								
								for(int cc=c;cc<=i;cc++)
								
								friends[q][cc]=friends[q][cc+1];			// this statement copy's next column element into the current
							}
				}
			
			 }
		}
		System.out.println("\nDELETED");
	}
																		//METHOD TO SHOW FRIENDS
	public void showfriends(String user) {
		for(int q=0;q<i;q++) 
		{
			if(user.equals(friends[q][0]))
			{
				for(int y=0;y<i;y++)
				{
					if(!"".equals(friends[q][y])) 						//this condition make sure that the code doesn't work on null  values
					{
				
				System.out.println(friends[q][y+1]);
				
					}	
				}
			}
			
		}
	}
	
}
