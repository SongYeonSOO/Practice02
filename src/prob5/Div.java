package prob5;

public class Div extends Arith {
	Div(int a, int b){
		super(a,b);
	}

	public void calculate(){
		 System.out.println(this.geta()+"/"+this.getb());
		 System.out.println((int)((double)this.geta()/this.getb()));
		 System.out.println("quit");

}
}
