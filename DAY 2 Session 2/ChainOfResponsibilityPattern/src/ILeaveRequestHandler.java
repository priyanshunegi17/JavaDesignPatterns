public interface ILeaveRequestHandler {
	
	ILeaveRequestHandler nextHandler=null;
	
	void HandleRequest(LeaveRequest leaveRequest);
	
	
}
