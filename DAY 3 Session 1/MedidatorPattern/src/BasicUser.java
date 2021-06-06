public class BasicUser implements IUser {

	ChatMediator cm;
	String name;

	public BasicUser(ChatMediator cm,String name) {
		this.cm = cm;
		this.name=name;
	}

	@Override
	public void SendMessage(String msg) {
		cm.SendMessage(msg, name);
	}

	@Override
	public void ReceiveMessage(String msg, String sender) {
		if (name != sender) {

			System.out.println("[Sender-"+sender+", Receiver-"+name + "], Message: \"" + msg+"\"");
		}
	}
}
