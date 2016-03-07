package prob5;

public class Sub extends Arith {
	Sub(int a, int b){
		super(a,b);
	}

	public void calculate(){
		 System.out.println(this.geta()+"-"+this.getb());
		 System.out.println(this.geta()-this.getb());
		 System.out.println("quit");

}
}
