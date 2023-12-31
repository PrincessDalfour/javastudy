package TransferMajor.homework3;

class Point {
	int x;
	int y;
	/**
	 * 平面坐标下点所在的象限
	 * @return 返回点所在的象限，右上的称为第一象限，返回值为1；
	 * 			左上的称为第二象限，返回值为2；左下的称为第三象限，返回值为3；
	 * 			右下的称为第四象限，返回值为4。坐标轴上的点不属于任何象限，返回值为0。
	 */
	int quadrant() {
		int iRet=-1;
		//添加代码	
		if(x>0 && y>0)
		                iRet=1;
		            else if (x>0 && y<0)
		                iRet=4;
		            else if (x<0 && y>0)
		                iRet=2;
		            else if (x<0 && y<0)
		                iRet=3;
		            else
		                iRet=0;	
		return iRet;
	}	
	/**
	 * 获取当前点关于x轴对称的点
	 * @return 
	 */
	Point xAxialSymmetry() {
		Point pointRet=null;
		//添加代码	
		pointRet = new Point();
	    pointRet.x = x;
	    pointRet.y = -y;
		return pointRet;
	}
	/**
	 * 获取当前点关于y轴对称的点
	 * @return 
	 */
	Point yAxialSymmetry() {
		Point pointRet=null;
		//添加代码	
		pointRet = new Point();
	    pointRet.x = -x;
	    pointRet.y = y;
	    return pointRet;
	}
}

public class PointDemo {

    public static void main(String[] args) {
            //  TODO  Auto-generated  method  stub
            Point p1=new Point();
            p1.x=10;
            p1.y=20;
            Point p2=new Point();
            p2.x=30;
            p2.y=50;
            System.out.println("p1("+p1.x+","+p1.y+")");
            System.out.println("p2("+p2.x+","+p2.y+")");
            Point  pt=p2;
            System.out.println("p2("+p2.x+","+p2.y+")");
            System.out.println("pt("+pt.x+","+pt.y+")");
            pt.x=20;
            pt.y=30;
            System.out.println("p2("+p2.x+","+p2.y+")");
            System.out.println("pt("+pt.x+","+pt.y+")");
            Point  p3  =  p1.xAxialSymmetry();
            System.out.println("p3("+p3.x +","+p3.y+")");
            Point  p4  =  p2.yAxialSymmetry();
            System.out.println("p4("+p4.x+","+p4.y+")");
            
                    
    }

}

