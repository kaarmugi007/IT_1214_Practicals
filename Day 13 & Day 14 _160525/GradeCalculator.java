
class Student{
	private String name;
	private int exam1;
	private int exam2;
	private int exam3;
	
	
	
	boolean validateMarks(int marks){
		if (marks<=100 && marks>=0){
			return true;
		} else
		{
			return false;
		}
	}
	
	Student(String name, int exam1, int exam2, int exam3){
		this.name=name;
		
		if(validateMarks(exam1)&& validateMarks(exam2) && validateMarks(exam3)){
			this.exam1=exam1;
			this.exam2=exam2;
			this.exam3=exam3;
		try{
			/*if(validateMarks(exam1)&& validateMarks(exam2) && validateMarks(exam3)){
			this.exam1=exam1;
			this.exam2=exam2;
			this.exam3=exam3;
			}*/
		}
		catch (Exception e){
			System.out.println(e.getMessage());
			System.out.println("Exam scores must be between 0 and 100.");
		}
		}
	}
	
	public String getName(){
		return name;
	}
	
	public int getExam1(){
		return exam1;
	}
	
	public int getExam2(){
		return exam2;
	}
	
	public int getExam3(){
		return exam3;
	}
	
	public double calculateAverage(){
		double average;
		average = (exam1 + exam2 + exam3)/3.0;
		
		return average;
	}
}
	
class GradeCalculator{
	public static void main(String[] args){
		Student s1 = new Student("John",75,110,90);
		System.out.println("Average marks of " + s1.getName() + " is " + s1.calculateAverage());
		
		Student s2 = new Student("Harry",175,110,190);
		System.out.println("Average marks of " + s2.getName() + " is " + s2.calculateAverage());
		
		Student s3 = new Student("Ron",75,80,90);
		System.out.println("Average marks of " + s3.getName() + " is " + s3.calculateAverage());
			
	} 
}

	