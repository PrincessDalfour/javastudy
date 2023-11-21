package DesignPattern.damn01_1;

public class test {
	public static void main(String[] args) {
		Shape shape;
		AbstractShapeFactory factory = new DiamondFactory();
		shape = factory.createShape();
		shape.Draw();
	}
}
/**
 * 新建两个接口,并实现他们:
 * 		1.抽象工厂
 * 			实现生产的方法:无输入,返回值为产品
 * 		2.抽象产品
 * 			实现产品的方法
 * 测试类:
 * 		首先要psvm
 * 		1.定义一个产品的接口
 * 		2.实现抽象工厂(抽象工厂 = 具体工厂)\
 * 		3.调用工厂里的生产方法
 * 		4.调用产品的方法
 */
