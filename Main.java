package cse207fproject;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentRecordManagement record = new StudentRecordManagement();



        while (true) {

            System.out.println("\nStudent Record Management System");

            System.out.println("1. Insert Record");

            System.out.println("2. Delete Record");

            System.out.println("3. Search Record");

            System.out.println("4. Show Records");

            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");



            int choice = scanner.nextInt();

            scanner.nextLine(); 



            switch (choice) {

                case 1:

                	System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Roll Number: ");
                   int rollNumber = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter Total Marks: ");
                    int totalMarks = scanner.nextInt();
                    record.insertRecord(name,rollNumber,course,totalMarks);
                    break;



                case 2:

                        System.out.print("Enter Roll Number to delete: ");
                        int rollNumToDelete = scanner.nextInt();
                        record.deleteRecord(rollNumToDelete);

                    break;


                 case 3:

                    System.out.print("Enter Roll Number to search: ");
                    int rollNumToSearch = scanner.nextInt();
                    record.searchRecord(rollNumToSearch);

                    break;

                 case 4:

                    record.showRecords();

                    break;



                case 5:

                    System.out.println("Exiting the program.");

                    System.exit(0);



                default:

                    System.out.println("Invalid choice. Please enter a valid option.");

            }

        }

    }

}



