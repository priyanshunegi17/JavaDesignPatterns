public class Supervisor implements ILeaveRequestHandler{

	private ILeaveRequestHandler nextHandler = new ProjectManager();
	
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		int days = leaveRequest.getLeaveDays();
		if(days>0 && days<3) {
			System.out.println("Leave approved by Supervisor for "+leaveRequest.getEmployee());
		}
		else if(days>=3) {
			nextHandler.HandleRequest(leaveRequest);
		}
	}

}
