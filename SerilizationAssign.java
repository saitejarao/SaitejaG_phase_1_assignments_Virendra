package assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationAssign {
	
	     public static void main(String args[]) throws IOException 
		  {
		    Employee emp1= new Employee("sai",457,45,"account","hahjdudvj@email.com",2340085,'m');
		    Employee emp2= new Employee("anand",458,50,"finance","gthjdudvj@email.com",4540098,'m');
		    
		    FileOutputStream fos= null;
		    ObjectOutputStream oos= null;
		    
		    try{ 
		      fos = new FileOutputStream("C://Users//simplilearn//Student.ser"); 
		      oos = new ObjectOutputStream(fos);
		      oos.writeObject(emp1);
		      oos.writeObject(emp2);
		      System.out.println("Serialzation Done!!");
		   }catch(IOException ioe){
		      System.out.println(ioe);
		    }
		    finally{
			      oos.close();
			      fos.close();
		    }
	     
	     //Deserialization
	     Employee o=null;
	     try{
	       FileInputStream fis = new FileInputStream("C:\\Users\\simplilearn\\Student.ser");
	       ObjectInputStream ois = new ObjectInputStream(fis);
	       o = (Employee)ois.readObject();
	       ois.close();
	       fis.close();
	     }
	     catch(IOException ioe)
	     {
	        ioe.printStackTrace();
	        return;
	     }catch(ClassNotFoundException cnfe)
	      {
	        System.out.println("Student Class is not found.");
	        cnfe.printStackTrace();
	        return;
	      }
	     System.out.println("Employee Name:"+o.getEmpName());
	     System.out.println("Employee id:"+o.getEmpid());
	     System.out.println("Employee age:"+o.getEmpAge());
	     System.out.println("Employee deptname:"+o.getDeptname());
	     System.out.println("Employee email:"+o.getEmail());
	     System.out.println("Employee contact:"+o.getContact());
	     System.out.println("Employee gender:"+o.getGender());
	  }
	}

	//------------------------------Student-------------------------//
	class Employee implements java.io.Serializable{
		  private  String EmpName;
		  private int Empid;
		  private int EmpAge;
		  private String deptname;  
		  private String email;
		  private long contact;
		  private char gender;
		  
		  public Employee(String name, int id, int age,String deptname, String email, long contact, char gender) {
		    this.EmpName = name;
		    this.Empid = id;
		    this.EmpAge = age;
		    this.deptname = deptname;
		    this.email = email;
		    this.contact = contact;
		    this.gender = gender;
		  }
		  public String getEmpName() {
				return EmpName;
			}

			public void setEmpName(String empName) {
				EmpName = empName;
			}

			public int getEmpid() {
				return Empid;
			}

			public void setEmpid(int empid) {
				Empid = empid;
			}

			public int getEmpAge() {
				return EmpAge;
			}

			public void setEmpAge(int empAge) {
				EmpAge = empAge;
			}

			public String getDeptname() {
				return deptname;
			}

			public void setDeptname(String deptname) {
				this.deptname = deptname;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public long getContact() {
				return contact;
			}

			public void setContact(long contact) {
				this.contact = contact;
			}

			public char getGender() {
				return gender;
			}

			public void setGender(char gender) {
				this.gender = gender;
			}

}


