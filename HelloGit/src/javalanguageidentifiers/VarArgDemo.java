package javalanguageidentifiers;

public class VarArgDemo {
	public static void main(String[] args){
		m1(10,20);
		m1(20,60,80);
		m1();
	}
	
	public static void m1(int...x){
		int total=0;
		for(int x1:x){
			total=total+x1;
		}
		System.out.println("Sum is :"+ total);
	}

}
