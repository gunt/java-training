package oop;

public class BankAccount {
	// Define variables
	String accountNumber;
	
	// static >> belongs to the CLASS not the object instance 
	// final >> constant (often static final)
	static String routingNumber = "01356";
	String name;
	String ssn;
	String accountType;
	
	
	// Constructor definition: unique methods
		// 1. They are used to define / setup / initialize properties of an object.
		// 2. Constructors are IMPLICITY called upon INSTANTIATION
		// 3. The same name as the class itself
		// 4. Constructors have NO return type. (no VOID, no STRING, no DOUBLE) 
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Overloading : call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		if (initDeposit < 1000) {
			String errorMsg = "ERROR: Minimum deposit must be at least$1,000";
			System.out.println(errorMsg);
		}
	}
	
	// Define methods
	void deposit() {
		
	}
	
	void checkBalance() {
		
	}
	
	void checkStatus() {
		
	}
	
	void getStatus() {
		
	}
	
	
}
