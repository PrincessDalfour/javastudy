package TransferMajor.homework5;

class Shape {
	
    private int x;
    private int y;
    
    public Shape() {
    	super();
    }

    public Shape(int x,int y) {
    	
    	super();
    	setX(x);
    	setY(y);
    	
    }

    public int getX() {
    	return x;
    }
    
    public void setX(int x) {
    	this.x = x;
    }
    
    public int getY() {
    	return y;
    }
    
    public void setY(int y) {
    	this.y = y;
    }
    
    public void show() {
    	System.out.println("("+getX()+",  "+getY()+")");
    }
    
}

class Rect extends Shape {
	
	private int len;
    private int wid;
    
    public Rect() {
    }
    
    public Rect(int x,int y,int len,int wid) {
    	super(x,y);
    	setLen(len);
    	setWid(wid);
    }
    
    public int getLen() {
    	return len;
    }
    
    public void setLen(int len) {
    	this.len = len;
    }
    
    public int getWid() {
    	return wid;
    }
    
    public void setWid(int wid) {
    	this.wid = wid;
    }
    
    @Override
    public void show(){
    	System.out.println("Rect");
    	System.out.println("("+super.getX()+", "+super.getY() +")");
    	System.out.println("len = "+len+",wid = "+wid);
    }
}

class Circle extends Shape {
	
    private int r;
    
    public Circle() {
    	super();
    }
    
    public Circle(int x,int y,int r) {
    	super(x,y);
            setR(r);
    }
    
    public int getR() {
    	return r;
    }

    public void setR(int r) {
    	this.r = r;
    }
    @Override
    public void show(){
    	System.out.println("Circle");
    	System.out.println("("+super.getX()+", "+super.getY() +")");
    	System.out.println("r = "+r);
    }
}
public  class  TestShape{
	
    public static void draw(Shape s) {
    	s.show();
    }

    public static void main(String[] args){
          for(String arg:args) {    
        	  int type = Integer.parseInt(arg);
        	  Shape s = null;
        	  if(type % 3 == 1){
        		  s = new Rect(type,type,type,type);
        	  }else{
        		  s = new Circle(type,type,type);
        	  }
        	  TestShape.draw(s);
        	  
            }
    }
}