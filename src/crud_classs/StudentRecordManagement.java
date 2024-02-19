package crud_classs;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecordManagement {

	// Creating an empty LinkedList
	LinkedList<Record> list;

	public StudentRecordManagement() {
		list = new LinkedList<>();
	}

	// Method 1
	// Adding Record
	// @param record
	public void add(Record record) {
//    	check record 
//    	if not add it to record list otherwise
		if (!find(record.getIdNumber())) {
			list.add(record);
		} else {

			// Print statement
			System.out.println("Record already exists in the Record list");
		}
	}

//	Method 2 searching record 

	public boolean find(int idNumber) {
		for (Record l : list) {

			// Checking record by id Number
			if (l.getIdNumber() == idNumber) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	// Method 3
	// Delete Record
	// @param recIdNumber
	public void delete(int recIdNumber) {
		Record recordDel = null;

		// Iterating record list
		for (Record ll : list) {

			// Finding record to be deleted by id Number
			if (ll.getIdNumber() == recIdNumber) {
				recordDel = ll;
			}
		}

		// If recordDel is null, then show error message,
		// otherwise remove the record from Record list
		if (recordDel == null) {

			// Displaying no record found
			System.out.println("Invalid record Id");
		} else {

			list.remove(recordDel);

			// Display message for successful deletion of
			// record
			System.out.println("Successfully removed record from the list");
		}
	}
	public Record findRecord(int recIdNumber) {
		Record recordDel = null;

		// Iterating record list
		for (Record ll : list) {

			// Finding record to be deleted by id Number
			if (ll.getIdNumber() == recIdNumber) {
				 
				recordDel= ll;
				return recordDel;
			}
		}
		return recordDel;

		// If recordDel is null, then show error message,
		// otherwise remove the record from Record list
//		if (recordDel == null) {
//
//			// Displaying no record found
//			System.out.println("Invalid record Id");
//		} else {
//
//			list.remove(recordDel);
//
//			// Display message for successful deletion of
//			// record
//			System.out.println("Successfully removed record from the list");
//		}
	}	
//	method 5 
	public void update(int id, Scanner input) {
		if(find(id)) {
			  Record rec = findRecord(id);
			  
	            // Display message only
	            System.out.print(
	                "What is the new Student id Number ? ");
	            int idNumber = input.nextInt();
	 
	            // Display message only
	            System.out.print(
	                "What is the new Student contact Number ");
	            int contactNumber = input.nextInt();
	            input.nextLine();
	 
	            // Display message only
	            System.out.print(
	                "What is the new Student Name ? ");
	            String name = input.nextLine();
	 
	            rec.setIdNumber(idNumber);
	            rec.setName(name);
	            rec.setContactNumber(contactNumber);
	            System.out.println(
	                "Record Updated Successfully");
		}  else {
 
            // Print statement
            System.out.println(
                "Record Not Found in the Student list");
        }
	}
	
	 public void display()
	    {
	 
	        // If record list is empty then
	        // print the message below
	        if (list.isEmpty()) {
	 
	            // Print statement
	            System.out.println("The list has no records\n");
	        }
	        // Iterating Record list
	        // using for each loop
	        for (Record record : list) {
	 
	            // Printing the list
	            System.out.println(record.toString());
	        }
	    }
}
