package day35_encapsulation;

import java.util.ArrayList;

public class JobTest {

	public static void main(String[] args) {
		
		Job job1=new Job();
		Job job2=new Job("Jva Developer");
		Job job3=new Job("SDET", "Amazon", 130000);
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		
		//create a list of jobs
		//add 5 different jobs with company salary title
		
		ArrayList<Job> jobList= new ArrayList<>();
		jobList.add(job3);
		jobList.add(new Job("SM","abc", 190000));
		jobList.add(new Job("BA","xxx", 98000));
		jobList.add(new Job("FT","kkk", 100000));
		
		System.out.println(jobList.toString());
		
		// find the highest paying job and print it
		
		double maxSalary=0;
		int highestIndex=0;
		
		for(int i=0;i<jobList.size();i++) {
			if(jobList.get(i).getAnnualSalary()>maxSalary) {
				maxSalary=jobList.get(i).getAnnualSalary();
				highestIndex=i;//which index has the highest salary
			}
		}
		System.out.println(jobList.get(highestIndex).getAnnualSalary());
		
	}

}
