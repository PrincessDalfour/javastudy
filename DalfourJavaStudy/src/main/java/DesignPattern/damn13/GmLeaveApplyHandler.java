package DesignPattern.damn13;

public class GmLeaveApplyHandler extends LeaveApplyHandler{
	public GmLeaveApplyHandler(){
		super(LeaveApplyHandler.FIVE,10);
	}

	@Override
	protected void handleLeave(LeaveApply leave) {
		System.out.println("总经理审批同意");
	}
}
