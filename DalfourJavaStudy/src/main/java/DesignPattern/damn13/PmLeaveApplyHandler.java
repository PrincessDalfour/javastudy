package DesignPattern.damn13;

public class PmLeaveApplyHandler extends LeaveApplyHandler{
	public PmLeaveApplyHandler(){
		super(0,LeaveApplyHandler.THREE);
	}

	@Override
	protected void handleLeave(LeaveApply leave) {
		System.out.println("项目经理审批同意");
	}
}
