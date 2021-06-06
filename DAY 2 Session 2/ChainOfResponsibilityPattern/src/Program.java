public class Program {

	public static void main(String[] args) {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployee("Priyanshu");
		leaveRequest.setLeaveDays(1);
		
		ILeaveRequestHandler supervisor = new Supervisor();
		supervisor.HandleRequest(leaveRequest);
		
	}
	
}
