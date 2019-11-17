package day8_controlFlowStatements2;

public class task_32 {

	public static void main(String[] args) {
		
		int a=53,b=67,c=89;
		if((a>b) && (a>c)) {
			System.out.println("a is greatest one");
		}else if((b>c)&&(b>a)) {
			System.out.println("b is greatest one");
		}else if((c>a)&&(c>b)) {
			System.out.println("c is greatest one");
		}else {
			System.out.println("numbers are equal");
		}
            
	}

}
