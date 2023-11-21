package DesignPattern.damn13;

public class Main {

	public static void main(String[] args) {
		LeaveApply leave = new LeaveApply("张三", 15);
		PmLeaveApplyHandler pmLeaveApplyHandler = new PmLeaveApplyHandler();
		DmLeaveApplyHandler dmLeaveApplyHandler = new DmLeaveApplyHandler();
		GmLeaveApplyHandler gmLeaveApplyHandler = new GmLeaveApplyHandler();
		pmLeaveApplyHandler.setHandler(dmLeaveApplyHandler);
		dmLeaveApplyHandler.setHandler(gmLeaveApplyHandler);
		System.out.println("张三请假：" + leave.getNum() + "天");
		pmLeaveApplyHandler.handlerApply(leave);
	}
}