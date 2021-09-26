 class Singleton{
	private static Singleton instance;
	private Singleton(){

	}
	public static Singleton getInstance(){
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public void print(){
		System.out.println("www.baidu.com");
	}
}
	

public class TestDemo{

 
	public static void main(String arg[]){
	Singleton inst =null;
	inst=Singleton.getInstance();
	inst.print();
	}
}