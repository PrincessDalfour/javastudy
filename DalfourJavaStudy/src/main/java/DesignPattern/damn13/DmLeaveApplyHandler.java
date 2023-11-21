package DesignPattern.damn13;

public class DmLeaveApplyHandler extends LeaveApplyHandler{
	public DmLeaveApplyHandler(){
		super(LeaveApplyHandler.THREE,LeaveApplyHandler.FIVE);
	}

	@Override
	protected void handleLeave(LeaveApply leave) {
		System.out.println("部门经理审批同意");
	}
}
