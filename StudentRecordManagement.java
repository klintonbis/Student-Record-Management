package cse207fproject;

public class StudentRecordManagement {
	

	    private Node start;

 public StudentRecordManagement() {

	        this.start = null;

	    }
private boolean checkRecord(int rollNumber) {

	        Node temp = start;

	        while (temp != null) {

	            if (temp.rollNumber == rollNumber) {

	                return true; 

	            }

	            temp = temp.next;

	        }

	        return false; 

	    }

public void insertRecord(String name,int rollNumber,String course,int totalMarks) {
if (checkRecord(rollNumber)) {

	           System.out.println("Record with Roll Number " + rollNumber + " already exists.");

	            return;

	        }

Node newNode = new Node(name, rollNumber, course, totalMarks);

 if (start== null || rollNumber < start.rollNumber) {

	            newNode.next = start;

	            start = newNode;

	        } else {

	            Node temp = start;

	            while (temp.next != null && rollNumber > temp.next.rollNumber) {

	                temp = temp.next;

	            }

	            newNode.next = temp.next;

	            temp.next = newNode;

	        }



	        System.out.println("Record inserted successfully.");

	    }



	    

	    public void searchRecord(int rollNumber) {
       
	        Node temp = start;

	        while (temp != null) {

	            if (temp.rollNumber == rollNumber) {

	                System.out.println("Record found:");

	                System.out.print("\t\tName: " + temp.name);
                    System.out.print("\t\tRoll Number: " + temp.rollNumber);
                    System.out.print("\t\tCourse: " + temp.course);
                    System.out.print("\t\tTotal Marks: " + temp.totalMarks);

	                return;

	            }

	            temp = temp.next;

	        }



	        System.out.println("Record with Roll Number " + rollNumber + " not found.");

	    }



	    

	    public int deleteRecord(int rollNumber) {

	        if (start == null) {

	            System.out.println("Empty database. No records to delete.");

	            return -1;

	        }
if (start.rollNumber == rollNumber) {

	            start = start.next;

	            System.out.println("Record deleted successfully.");

	            return 0;

	        }



	        Node temp = start;

	        while (temp.next != null && temp.next.rollNumber != rollNumber) {

	            temp = temp.next;

	        }



	        if (temp.next == null) {

	            System.out.println("Record with Roll Number " + rollNumber + " not found.");

	            return -1;

	        }



	        temp.next = temp.next.next;

	        System.out.println("Record deleted successfully.");

	        return 0;

	    }

 public void showRecords() {

	        if (start == null) {

	            System.out.println("Empty database. No records to display.");

	            return;

	        }

 System.out.println("Student Records:");

	        Node temp = start;

	        while (temp != null) {

	           System.out.print("\t\tName: " + temp.name);
               System.out.print("\t\tRoll Number: " + temp.rollNumber);
               System.out.print("\t\tCourse: " + temp.course);
               System.out.print("\t\tTotal Marks: " + temp.totalMarks);
             System.out.println("");
	            

	            temp = temp.next;

	        }
  System.out.println("**************END***************");
	    }

	}



