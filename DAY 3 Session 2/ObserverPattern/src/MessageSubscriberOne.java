public class MessageSubscriberOne implements Observer
{
	private State observerState;
	
	public MessageSubscriberOne(String state) {
		this.observerState=new State(state);
	}
	
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}
}