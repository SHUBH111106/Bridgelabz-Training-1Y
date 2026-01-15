class demo2{
	static int x=50 ;
	public static void m2(){
		int y = 20 ;
		System.out.println(y);
	}
	public static void m1(){
		int y = 30 ;
		System.out.println(y);
		m2();
	}
	public static void main(String[] args){
		int y = 10;
		System.out.println(x);
		System.out.println(y);
		m1();
		demo2 obj = new demo2();
	}
}