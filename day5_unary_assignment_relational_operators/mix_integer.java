package day5_unary_assignment_relational_operators;

public class mix_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i1=5;
        int i2=10;
        float f1=15.5f;
        double d1=20.5;
        
        int res1=i1+i2;
        float res2=i1+f1;
        double res3=i2+d1;
        
        short firstnumber=10;
        short secondnumber=20;
        
        int thirdnumber=firstnumber+secondnumber;
        
        short thirdnumber2=(short)(firstnumber+secondnumber);
        
        byte b1=20;
        byte b2=2;
        int b3=b1*b2;
        byte b3x=(byte)(b1*b2);// ya da boyle yazabiliriz/casting yaparak
        
        int b4=20;
        int b5=30;
        
        byte res=(byte)(b4+b5);// casting required
        
        byte res4=20+30; //no casting is required
        //value direk yazilirsa ve limit icindeyse(1 to 126) casting yapmaya gerek yok
        
        
        
	}

}
