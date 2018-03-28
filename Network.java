import java.util.*;

// AUTHOR - YUNFEI ZHOU(s3598797)
public abstract class Network {
	String status,age;
	String name;
	String[][] net = new String[100][100];
	String[][] friends = new String[100][100];
	String[][] family = new String[100][100];
	String parent1, parent2;
	int[] h = new int[100]; 		// an array for pre family	count
	int i,m,fa,fr;
	int[] k = new int[100];		// an array for pre-friends count
	
	// Rows represent the name of the user and columns represents data about them
	public void userDatabase() {
		net[0][0]="subhneet";net[0][1]="32";net[0][2]="business";
		net[1][0]="trapti";net[1][1]="30";net[1][2]="housewife";
		net[2][0]="aarav";net[2][1]="5";net[2][2]="kindergarten";
		net[3][0]="manan";net[3][1]="25";net[3][2]="student";
		net[4][0]="sam";net[4][1]="33";net[4][2]="trainer";
		net[5][0]="anu";net[5][1]="31";net[5][2]="house wife";
		net[6][0]="jacky";net[6][1]="24";net[6][2]="student";
		net[7][0]="yoyo";net[7][1]="44";net[7][2]="unemployed";
		friends[0][0]="subhneet";friends[0][1]="trapti";friends[0][2]="aarav";friends[0][3]="manan";friends[0][4]="sam";
		friends[1][0]="trapti";friends[1][1]="subhneet";friends[1][2]="aarav";friends[1][3]="manan";friends[1][4]="anu";
		friends[2][0]="aarav";friends[2][1]="subhneet";friends[2][2]="trapti";
		friends[3][0]="manan";friends[3][1]="trapti";friends[3][2]="jacky";friends[3][3]="subhneet";
		friends[4][0]="sam";friends[4][1]="subhneet";
		friends[5][0]="anu";friends[5][1]="trapti";
		friends[6][0]="jacky";friends[6][1]="manan";
		friends[7][0]="yoyo";
		family[0][0]="aarav";family[0][1]="subhneet";family[0][2]="trapti"; // row represents child's name, the first column represents father and the other column is for mother
		
	}
	


	public void makeProfile()													// THIS IS HOW A USER'S DATA IS SAVED
	{
		int aa=0,bb=0;
		System.out.println("Enter the name of the person");
		Scanner a = new Scanner (System.in);
		name = a.nextLine();
		
		System.out.println("Enter age");
		age=a.nextLine();
		Integer Age = Integer.valueOf(age);
		if(Age<=16 )
		{	
			System.out.println("ENTER FATHER'S NAME");
			parent1=a.next();
			System.out.println("ENTER MOTHER'S NAME");
			parent2=a.next();
			
			for(int nn=0;nn<100;nn++) {
				if(parent1.equals(net[nn][0])) {
					aa++;
				}
				else if(parent2.equals(net[nn][0])) {
					bb++;
				}
					else 
						continue;
					
					}
			
			addFamily(name,parent1,parent2,aa,bb);
			
		}
		else {
			net[i][0]=name;
			net[i][1]=age;
			friends[i][0]=name;
			System.out.println("ENTER THE STATUS");
		
			status = a.next();
		
		
			net[i][2]=status;
		i++;
		fr++;
		System.out.println("\n\n");
		}
		}
		
	
	
																						// method to add family members
	
	
	public void addFamily(String NAME,String name1,String name2,int aa, int bb) {
		
		
		
		
			if(aa!=0 && bb!=0) {
				
				
				net[i][1]=age;
				net[i][0]=name;
				System.out.println("ENTER THE STATUS");
				Scanner a = new Scanner (System.in);
				status = a.next();
			
			
				net[i][2]=status;
				i++;
				friends[fr][0]=NAME;
				friends[fr][1]=name1;friends[fr][2]=name2;
				fr++;
				
				family[fa][0]=NAME;
				family[fa][1]=name1;
				family[fa][2]=name2;
				fa++;
			}
			else
				System.out.println("user can't be added as both parents of his/her are needed to be in the Network");
			System.out.println("\n\n");
			
		}
	
	
																						// method to show profile of the selected person
	
	public void showProfile(String NAME) {
		System.out.println("name:"+name+"\t age:"+age+"\t status:"+status );
		System.out.println("\n");
		System.out.println("friends are:");
		System.out.println("\n\n");
		
		for(m=0;m<100;m++) {
				if(NAME.equals(friends[m][0])) {
					
					for(int n=0;n<99;n++) {
			if (!"".equals(friends[m][n+1]))
			System.out.print(friends[m][n+1]+"\t"+"\t"+"\t");
					}
				}
		}
		
		System.out.println("\n\n\n\n\n\n\n\n");
	}
	
	
}
