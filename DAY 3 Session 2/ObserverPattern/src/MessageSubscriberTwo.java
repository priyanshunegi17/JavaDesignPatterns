public class MessageSubscriberTwo implements Observer {

	
	private State observerState;
	public MessageSubscriberTwo(String state) {
		this.observerState = new State(state);
	}
	
	@Override
	public void update(Message m) {

		System.out.println("MessageSubscriberTwo :: \n" + "Message: " +  m.getMessageContent() + "\tState: " + observerState.getState());
	}

}
