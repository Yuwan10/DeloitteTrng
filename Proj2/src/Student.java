
public class Student {
	int studentId;
	String studentName;
	int marks;
	int fees;
	

	public Student(int studentId, String studentName, int marks, int fees) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.fees = fees;
	}


	public Student(int studentId, String studentName, int marks) {
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	

	public Student(int studentId, String studentName) {
       this();	
   		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Student() {
		studentId = 0;
		studentName = "A";
		marks = 90;
		fees = 4500;
	}
		public void display() 
		{
			System.out.println("Student ID:"+studentId+"Student Name:" +studentName +"Marks:"+marks+"Fees"+fees);
		}
		
	@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + fees;
			result = prime * result + marks;
			result = prime * result + studentId;
			result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (fees != other.fees)
				return false;
			if (marks != other.marks)
				return false;
			if (studentId != other.studentId)
				return false;
			if (studentName == null) {
				if (other.studentName != null)
					return false;
			} else if (!studentName.equals(other.studentName))
				return false;
			return true;
		}


	public static void main(String[] args) {
		Student s= new Student();
		Student s1= new Student(0,"A");
		Student s2= new Student(1,"A",90);
		Student s3= new Student(3,"C",95,1000);
		s.display();
		s1.display();
		s2.display();
		s3.display();
		System.out.println(s.equals(s1));
		
			}

}
