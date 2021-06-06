public class MessageSubscriberThree implements Observer {

	
	private State observerState;
	public MessageSubscriberThree(String state) {
		this.observerState = new State(state);
	}
	
	@Override
	public void update(Message m) {

		System.out.println("MessageSubscriberThree :: \n" + "Message: " +  m.getMessageContent() + "\tState: " + observerState.getState());
	}

}
