public class ProjectManager implements ILeaveRequestHandler{

	private ILeaveRequestHandler nextHandler = new HR();
	
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		int days = leaveRequest.getLeaveDays();
		if(days<5) {
			System.out.println("Leave approved by Project Manager for "+leaveRequest.getEmployee());
		}
		else {
			nextHandler.HandleRequest(leaveRequest);
		}
	}

}
