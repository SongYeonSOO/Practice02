package prob5;

public class Add extends Arith{
	Add(int a, int b){
		super(a,b);
	}

	public void calculate(){
		 System.out.println(this.geta()+"+"+this.getb());
		 System.out.println(this.geta()+this.getb());
		 System.out.println("quit");

}
}
