package prob5;

public abstract class Arith {
	private int a;
	private int b;

	Arith(int a, int b){
		this.a = a;
		this.b =b;
	}
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int geta(){return a;}
	public int getb(){return b;}
	public abstract void calculate();
}
