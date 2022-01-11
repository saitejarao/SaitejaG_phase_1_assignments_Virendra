package assignment;

public class StudentConstructorAssign3 {
	String name;
    int age;
    char section;
    char gender;
    int subject1;
    int subject2;
    int subject3;
    
    StudentConstructorAssign3(String n, int a, char s, char g, int s1, int s2, int s3){
        name = n;
        age = a;
        section = s;
        gender = g;
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
    }
    public int marks(){
        return subject1+subject2+subject3;
    }
    public float percentage(){
        return (marks()*100)/300;
    }
    public static void main(String[] args) {
    	
    	StudentConstructorAssign3 s1 = new StudentConstructorAssign3("sai", 21, 'B','M', 98,85,78);
    	StudentConstructorAssign3  s2 = new StudentConstructorAssign3("swathic", 24, 'B','M', 0,46,75);
    	StudentConstructorAssign3 s3 = new StudentConstructorAssign3("teja", 29, 'A','M', 0,79,56);
    	StudentConstructorAssign3 s4 = new StudentConstructorAssign3("ram", 27, 'A','M', 38,88,9);
        
        System.out.println("Marks of student s1 "+ s1.marks() + " Percentage of student s1 " + s1.percentage());
        System.out.println("Marks of student s2 "+ s2.marks() + " Percentage of student s2 " + s2.percentage());
        System.out.println("Marks of student s3 "+ s3.marks() + " Percentage of student s3 " + s3.percentage());
        System.out.println("Marks of student s4 "+ s4.marks() + " Percentage of student s4 " + s4.percentage());
}
}