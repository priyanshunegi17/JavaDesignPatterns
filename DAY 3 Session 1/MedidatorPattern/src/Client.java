public class Client {

	public static void main(String[] args) {
		ChatMediator cm = new ChatMediator();
		BasicUser user1 = new BasicUser(cm,"Priyanshu");
		BasicUser user2 = new BasicUser(cm,"Sandeep");
		PremiumUser user3 = new PremiumUser(cm,"Rahul");
		PremiumUser user4 = new PremiumUser(cm,"Archit");
		
		cm.AddUser(user1);
		cm.AddUser(user2);
		cm.AddUser(user3);
		cm.AddUser(user4);
		
		user1.SendMessage("Hello Everyone");
//		user2.SendMessage("Hiii");
//		user3.SendMessage("when is our exam");
//		user4.SendMessage("I think its on Monday");
		
	}

}
