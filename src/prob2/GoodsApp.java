package prob2;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name;
		int price;
		int quantity;
		
		Goods g[] = new Goods[3];
		for(int i=0;i<3;i++){
			g[i]= new Goods(s.next(), s.nextInt(), s.nextInt());
			
		}
		
		for(Goods a:g){
			System.out.println(a.getName()+"(가격:"+a.getPrice()+"원)이 "+a.getQuantity()+"개 입고 되었습니다.");
		}
		
		
		s.close();
	}
}
