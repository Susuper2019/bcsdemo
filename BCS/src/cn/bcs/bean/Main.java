package cn.bcs.bean;

public class Main {

//	设计程序，创建一个整型变量toes，并将toes设置为10，程序中还要计算toes的两倍，和toes的平方，
//	该程序应打印三个值，并分别将这三个值打印在三行（注意），每一行都要说明打印的数字的含义。如：
//	toes：10
//	toes的两倍：20
//	toes的平方：100
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int toes=10;
		System.out.println("toes:"+toes);
		System.out.println("toes的两倍:"+toes*2);
		System.out.println("toes的平方:"+(int)Math.pow(toes, 2));
	}

}
