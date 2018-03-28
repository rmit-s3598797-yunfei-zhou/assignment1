import java.util.*;

//AUTHOR - YUNFEI ZHOU(s3598797)
public class Menu extends miniNet_operations {
	
	
	int z=0;
	Scanner a = new Scanner (System.in);
	public void makeMenu() {
		String CH,yo,username,password;
		String Name,user1,user2;
		yo="3";
		
		System.out.println("================================================================");
		System.out.println("WELCOME TO MiniNet!\n");
		System.out.println("================================================================");
		
		System.out.println("ENTER USERNAME");
		System.out.println("=============");
		username=a.next();
		System.out.println("=============");
		
		System.out.println("ENTER PASSWORD");
	password=a.next();
		System.out.println("=============");
		
		if(username.equals("admin") && password.equals("password"))
			yo="0";
		while(yo=="0") 		
		{
				System.out.println("press 1 for admin and 2 for user view");
					String cha = a.next();
					
					if(cha.equals("1")) 
			{
				
				System.out.println("================================================================");
				System.out.println("1. ADD A PERSON \n2. SELECT A PERSON TO VIEW PROFILE \n3. DELETE A PERSON \n4. EXIT");
				System.out.println("================================================================");
			
			CH = a.next();
					
			if(CH.equals("1")) {
				
				addUser();
			}
			else if(CH.equals("2")){
				showPeopleInNetwork();					// shows the list of people to select from
				
				System.out.println("ENTER THE NAME OF PERSON WHOSE PROFILE TO BE SELECTED");
				Name = a.next();
				selectPerson(Name);
					
			}
			
			
			else if(CH.equals("3")) 
			{
				
				System.out.println("THE LIST OF PEOPLE");
				for(int y=0;y<i;y++) 
				{
					if(!"".equals(net[y][0])) 
					{
					
					System.out.println(net[y][0]);
					
					}	
				}
				System.out.println("ENTER THE NAME OF THE PERSON WHOSE PROFILE HAS TO BE DELETED");
				user1=a.next();
				deletePeople(user1);
			}
			else if(CH.equals("4"))
			yo="1";	
			else
					continue;
			}
					
			else if(cha.equals("2")){
				System.out.println("================================================================");
				System.out.println("1. MAKE A NEW CONEECTION \n2. find connection between 2 people(direct friends  or not) \n3. FIND PARENTS \n4. FIND CHILDREN \n5. delete friend\n6. show friend list\n7. exit");
				System.out.println("================================================================");
				CH = a.next();
					
				 if(CH.equals("1")) {
					System.out.println("ENTER NAMES OF THE PEOPLE BETWEEN WHICH CONNECTION HAS TO BE MADE");
					user1=a.next();
					user2=a.next();
					connections(user1,user2);
					System.out.println("CONNECTED");
					
				}
				 else if(CH.equals("2")) {
						System.out.println("ENTER THE NAMES OF THE PEOPLE TO BE CHECKED");
						user1=a.next();
						user2=a.next();
						System.out.println(directFriend(user1,user2));
						
					}
					else if(CH.equals("3")) {
						System.out.println("ENTER THER NAME OF THE CHILD WHOSE PARENTS HAVE TO BE SEARCHED");
						Name=a.next();
						findParents(Name);
					}
					else if(CH.equals("4")) {
						System.out.println("ENTER THE NAME OF THE FATHER AND THE MOTHER OF THE CHILD");
						user1=a.next();
						user2=a.next();
						findChild(user1,user2);
					}
					else if(CH.equals("5")) {
						System.out.println("enter your name and the friends name to be deleted");
						user1=a.next();
						user2=a.next();
						deletefriend(user1,user2);
						System.out.println("DELETED");
					}
					else if(CH.equals("6")) {
						System.out.println("enter the name of the existing user whose friend list has to be seen");
						user1=a.next();
						showfriends(user1);
					}
					else if(CH.equals("7"))
						yo="1";
				 
					else
						continue;
			}
			}
	}
	
	}
