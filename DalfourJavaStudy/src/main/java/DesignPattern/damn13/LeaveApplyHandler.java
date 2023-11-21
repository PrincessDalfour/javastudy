package DesignPattern.damn13;

public abstract class LeaveApplyHandler {
	protected final static int THREE = 3;
	protected final static int FIVE = 5;

	private int numStart,numEnd;//审批区间

	private LeaveApplyHandler nextHandler;

	public LeaveApplyHandler(int numStart){
		this.numStart = numStart;
	}

	public LeaveApplyHandler(int numStart,int numEnd){
		this.numStart = numStart;
		this.numEnd = numEnd;
	}

	public void setHandler(LeaveApplyHandler nextHandler) {//设置下一级领导
		this.nextHandler = nextHandler;
	}

	//各级领导处理接口
	protected abstract void handleLeave(LeaveApply leave);
	//提交
	public final void handlerApply(LeaveApply leave){
		this.handleLeave(leave);
		if(this.nextHandler != null && leave.getNum() > this.numEnd){
			this.nextHandler.handlerApply(leave);
		}else {
			System.out.println("通过");
		}

	}
}

