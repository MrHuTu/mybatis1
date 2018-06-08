package cn.test.classload;

public class Human {
	
	private static String name=setName();
	
	private int age =setAge();
	
	static{
		
		System.out.println("Human  加载静态代码块");
	}
	{
		System.out.println("Human  加载非静态代码块");
	}
	public Human() {
		
		System.out.println("Human  加载构造方法");
		
	}
	private static  String setName(){
		
		System.out.println("Human 初始化静态变量name");
		
		return "人类";
				
	}
	
	private int setAge(){
		
		System.out.println("Human 初始化非静态变量age");
		
		return 12;
		
	}
	
	public static void main(String[] args) {
		
		BlackHuman BlackHuman = new BlackHuman();
		
		
		System.out.println("--------------------------");
		
		BlackHuman BlackHuman1 = new BlackHuman();
	
		
		
		
	}
	public int  getAge(){
		
		return age;
		
	}

}

class BlackHuman  extends Human{
	
	private static String name=setName();
	
	private int age =setAge();
	
	static{
		
		System.out.println("BlackHuman  加载静态代码块");
	}
	{
		System.out.println("BlackHuman  加载非静态代码块");
	}
	public BlackHuman() {
		
		System.out.println("BlackHuman  加载构造方法");
		
	}
	private static  String setName(){
		
		System.out.println("BlackHuman 初始化静态变量name");
		
		return "人类";
				
	}
	
	private int setAge(){
		
		System.out.println("BlackHuman 初始化非静态变量age");
		
		return 14;
		
	}
	
	public int  getAge(){
		
		return age;
		
	}
	
}
/**
 * Human 初始化静态变量name
Human  加载静态代码块
BlackHuman 初始化静态变量name
BlackHuman  加载静态代码块
Human 初始化非静态变量age
Human  加载非静态代码块
Human  加载构造方法
BlackHuman 初始化非静态变量age
BlackHuman  加载非静态代码块
BlackHuman  加载构造方法
*/

