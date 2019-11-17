package day9_controlFlowStatements_Part3;

public class hki9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double massKg=90, massPound=massKg*2.2,
                heightMeter=1.75, heightInch=heightMeter/0.0254,
                bmi=massKg/(heightMeter*heightMeter);
        String result1 ="Normal Weight", result2="Overweight", result3="Obese",
                result4="Under Weight";
        
        System.out.println("Your weight in kg :  "  + massKg);
        System.out.println("Your weight in pounds :  "+ massPound);
        System.out.println("Your height in meter: "+ heightMeter);
        System.out.println("Your height in inches: "+ heightInch);
        System.out.println("Your BMI is  "+ bmi);
        
        if (bmi<18.5) {
            System.out.println("Your risk factory: "+ result4);
            }else if ((bmi>=8.5)&&(bmi<25)) {
            System.out.println("You are good in shape."+ result1);
            }else if ((bmi>=25)&&(bmi<30)) {
            System.out.println("Your risk factory: "+ result2 );
            }else if (bmi>=30) {
            System.out.println("Your risk factory : "+ result3);
    
            }
	}

}
