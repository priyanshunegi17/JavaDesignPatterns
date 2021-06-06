public class HR implements ILeaveRequestHandler{

	private ILeaveRequestHandler nextHandler = null;
	
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		int days = leaveRequest.getLeaveDays();
		if(days>=7) {
			System.out.println("Meet HR for your Leave Request");
		}
		else {
			System.out.println("Leave approved by HR for "+leaveRequest.getEmployee());
		}
	}

}
