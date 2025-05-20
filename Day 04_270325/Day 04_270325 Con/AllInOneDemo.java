class AllInOneDemo{
	
	static void print(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args){
		Student s1=new Student("Charle");
		Student s2=new Student();
		Student s3=new Student("Don",55);
		
		print("Name of the student s1 is "+s1.name + " & Marks = "+s1.marks);
		print("Name of the student s2 is "+s2.name + " & Marks = "+s2.marks);
		print("Name of the student s3 is "+s3.name + " & Marks = "+s3.marks);
		
		Car c1=new Car("Mazda S3");
		Car c2=new Car("Nissan Navara");
		print("Model of the Car c1 is "+c1.model);
		print("Model of the Car c2 is "+c2.model);
		
		
	}
}