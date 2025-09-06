class Add_cmd {
	public static void main(String[] args) {
		if (args.length < 2)
			System.out.println("Provide two arguments!");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a+b;	
		System.out.print("Sum is: "+sum);
	}
}
	
	
