class Details{
	public static void display(int id,String name,int d_no,double sal){
		System.out.println("Name is:"+name);
		System.out.println("Employee id:"+id);
		System.out.println("Departement no is:"+d_no);
		System.out.println("Salary is:"+sal);
	}
	public static void main(String[] args){
		int id;
		String name;
		int d_no;
		double sal;
		id = Integer.parseInt(args[0]);
		name = args[1];
		d_no = Integer.parseInt(args[2]);
		sal = Integer.parseInt(args[3]);
		if(args.length != 4)
		{
			System.out.print("Please provide exactly 4 arguments!");
		}
		else
		{
			display(id,name,d_no,sal);
		}
	}
}
		
		
		