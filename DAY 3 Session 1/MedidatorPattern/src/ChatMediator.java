import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator{

	List<IUser> users= new ArrayList<>();

	public ChatMediator() {
		
	}
	
	@Override
	public void AddUser(IUser user) {
		users.add(user);
	}

	@Override
	public void SendMessage(String msg,String sender) {
		
		for(IUser user:users) {
			user.ReceiveMessage(msg,sender);
		}
	}


}
