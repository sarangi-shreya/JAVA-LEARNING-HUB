class Student_info_cmd{
	public static void display(String sic,String name,String branch,double s1,double s2,double s3,double s4,double s5,double s6){
		double avg;
		avg = (s1+s2+s3+s4+s5+s6)/6;
		System.out.println("SIC is:"+sic);
		System.out.println("Name is:"+name);
		System.out.println("Branch is:"+branch);
		System.out.println("Average mark is:"+avg);
	}
	public static void main(String[] args){
		//char sic;
		String name,branch,sic;
		double s1,s2,s3,s4,s5,s6;
		sic = args[0];
		name = args[1];
		branch = args[2];
		s1 = Integer.parseInt(args[3]);
		s2 = Integer.parseInt(args[4]);
		s3 = Integer.parseInt(args[5]);
		s4 = Integer.parseInt(args[6]);
		s5 = Integer.parseInt(args[7]);
		s6 = Integer.parseInt(args[8]);
		display(sic,name,branch,s1,s2,s3,s4,s5,s6);
	}
}
		
		
		