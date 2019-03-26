package com.capgemini.bankapp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.dao.impl.BankAccountDaoImpl;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.service.impl.BankAccountServiceImpl;

public class BankAccountClient {
	public static void main(String[] args) {
    	int choice;
    	String accountHolderName;
    	String accountType;
    	double accountBalance;
    	long accountId;
    	double amount;
    	long fromAccount;
    	long toAccount;
    	
    	BankAccountService bankService = new BankAccountServiceImpl();
    	BankAccountDao bankaccountDao=new BankAccountDaoImpl();

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			while (true) {
				System.out.println("1. Add New BankAccount\n2. Withdraw\n3. Deposit\n4. Fund Transfer");
				System.out.println("5. Delete BankAccount\n6. Display All BankAccount Details");
				System.out.println("7. Search BankAccount\n8. Update Balance\n9. Exit\n");

				System.out.print("Please enter your choice = ");
				choice = Integer.parseInt(reader.readLine());

				switch (choice) {

			
			case 1:
				System.out.println("Enter account holder name: ");
				accountHolderName = reader.readLine();
				System.out.println("Enter account type: ");
				accountType = reader.readLine();
				System.out.println("Enter account balance: ");
				accountBalance = Double.parseDouble(reader.readLine());
				BankAccount account = new BankAccount(accountHolderName, accountType, accountBalance);
				if (bankService.addNewBankAccount(account))
					System.out.println("Account created successfully...\n");
				else
					System.out.println("failed to create new account...\n");
				break;
			case 2:
				System.out.println("enter account id:");
				accountId = Long.parseLong(reader.readLine());
				System.out.println("enter the balance:");
				amount =Double.parseDouble(reader.readLine());
				try {
				      bankService.withdraw(accountId,amount);
				      System.out.println("amount is debit sucessfully...\n");
				      
				}
				catch(LowBalanceException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
			System.out.println("enter account id:");
			accountId = Long.parseLong(reader.readLine());
			System.out.println("enter the balance:");
			amount =Double.parseDouble(reader.readLine());
			
			      bankService.deposite(accountId,amount);
			      System.out.println("amount is credited sucessfully...\n");
			      break;
			case 4:
				System.out.println("enter amountid to transfer account");
				fromAccount=Long.parseLong(reader.readLine());
				System.out.println("enter amount to transfer fund to account");
				toAccount=Long.parseLong(reader.readLine());
				System.out.println("enter the balance:");
				amount =Double.parseDouble(reader.readLine());
				try {
				      bankService.fundTransfer(fromAccount,toAccount,amount);
				      System.out.println("amount is debit sucessfully...\n");
				      
				}
				catch(LowBalanceException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				System.out.println("enter the account id");
				accountId = Long.parseLong(reader.readLine());
				 bankService. deleteBankAccount(accountId);
			      System.out.println("deleted successfully...\n");
			      break;
			case 6:
				List<BankAccount> account1 =bankService.findAllBankAccounts();
                for (BankAccount bankAccount : account1) {
					System.out.println(bankAccount);
				}
                break;
			case 7:
				System.out.println("You are in Searching Specific Account Details Section");
				System.out.println("Enter Account Id : ");
				accountId=Long.parseLong(reader.readLine());
				System.out.println(bankService.searchBankAccount(accountId));
				//System.out.println("Details of Account"+accountId);

									
				break;
			
			case 8:
				System.out.println("You are in update Balance Section");
				System.out.println("Enter accountId: ");
				accountId=Long.parseLong(reader.readLine());
				System.out.println("Enter Amount:");
				amount=Double.parseDouble(reader.readLine());
				
				bankaccountDao.updateBalance(accountId, amount);
				break;	
			
			
			case 9:
				System.out.println("Thanks for banking with us.");
				System.exit(0);
				}
			}
		}
		
	 catch (IOException e) {
		e.printStackTrace();
}
		
    }
}
