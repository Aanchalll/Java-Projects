package com.demo;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
//Inheritance
public class OptionMenu extends Account {
 
	Scanner menuinput=new Scanner(System.in);
	DecimalFormat moneyformat =new DecimalFormat("'$'###,##0.00"); 
	HashMap<Integer,Integer> data=new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				//insert the data
				//customer number as key & pin to that customer
				data.put(01, 8770);
				data.put(02, 9654);
				
				System.out.println("Welcome to ATM Project");
				System.out.println("Enter you customer number: ");
				setCustomerNumber(menuinput.nextInt());
				System.out.println("Enter your PIN number: ");
				setPinNumber(menuinput.nextInt());
			}catch(Exception e)
			{
				System.out.println("\n Invalid characters. Only numbers. \n");
				x=2;
			}
			int cn =getCustomerNumber();
			int pn=getPinNumber();
			if(data.containsKey(cn)&& data.get(cn)==pn) {
				getAccountType();
			}else
			{
				System.out.println("Wrong customer Number or pin number!");
			}
			
		}while(x==1);	
	}
	public void getAccountType() {
		System.out.println("Select the Account you want to access:");
		System.out.println("type1 - Checking Account. \n type 2- Saving Account \n type 3 - Exit.");
	    System.out.println("Enter 1,2,3 or 4");
		int selection = menuinput.nextInt();
	switch(selection) {
	case 1:
		getChecking();
		break;
	case 2:
		getSaving();
	case 3:
		System.out.println("Thankyou for using this ATM");
		break;
	default:
		System.out.println("Invalid choice");
		getAccountType();
	}
	}
public void getChecking() {
	System.out.println("Checking Account");
	System.out.println("Type 1: View Balance");
	System.out.println("Type 2:Withdraw Funds");
	System.out.println("Type 3:Deposit Funds");
	System.out.println("Type 4:Exit");
	System.out.println("Enter 1,2,3 or 4");
	System.out.println("Choice- ");
	int selection=menuinput.nextInt();
	switch(selection) {
	case 1: 
		System.out.println("Checking Account Balance"+moneyformat.format(getCheckingBalance()));
	    getAccountType();
	    break;
	case 2:
		getCheckingWithdrawInput();
	    getAccountType();
	    break;
    case 3:
    	getCheckingDepositInput();
        getAccountType();
        break;
    case 4:
    	System.out.println("Thankyou for using this ATM!");
    default:
    	System.out.println("INVALID CHOICE!");
	}
}
public void getSaving() {
	System.out.println("Checking Account:");
	System.out.println("Type 1: View Balance");
	System.out.println("Type 2:Withdraw Funds");
	System.out.println("Type 3:Deposit Funds");
	System.out.println("Type 4:Exit");
	System.out.println("Enter 1,2,3 or 4");
	System.out.println("Choice- ");
	int selection=menuinput.nextInt();
	switch(selection) {
	case 1:
		System.out.println("Checking Account Balance"+moneyformat.format(getSavingBalance()));
	    getAccountType();
	    break;
	case 2:
		getsavingWithdrawInput();
	    getAccountType();
	    break;
    case 3:
    	getSavingDepositInput();
        getAccountType();
        break;
    case 4:
    	System.out.println("Thankyou for using this ATM!");
    default:
    	System.out.println("INVALID CHOICE!");
}
}

}
