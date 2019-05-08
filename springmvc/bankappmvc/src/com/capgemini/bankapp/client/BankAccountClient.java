package com.capgemini.bankapp.client;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.bankapp.exception.AccountNotFoundException;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;

@Controller
@RequestMapping("/bank")
public class BankAccountClient {

	@Autowired
	private BankAccountService service;

	@RequestMapping("/")

	public String homePage() {

		return "index";
	}

	@RequestMapping("/new account")

	public String addNew() {

		return "new account";
	}

	@RequestMapping("/add")
	public String addNewBankAccount(@RequestParam("Customer name") String accountHolderName,
			@RequestParam("Account Type") String accountType, @RequestParam("Account Balance") double amount) {

		service.addNewBankAccount(new BankAccount(accountHolderName, accountType, amount));
		return "success";

	}
	@RequestMapping("/deleteAccount")

	public String check() {

		return "deleteAccount";
	}

	@RequestMapping("/delete")
	public String deleteBankAccount(@RequestParam("accountId") long accountId)throws  AccountNotFoundException  {

		service.deleteBankAccount(accountId);
		return "success";
	}

	
	@RequestMapping("/all accounts")
	
	public String findAllBankAccountsDetails() {

	
		
		return "all accounts";

	}

	/*
	 * @RequestMapping("/all") public String
	 * findAllBankAccountsDetails1(@RequestParam("accountId") long
	 * accountId,@RequestParam("Customer name") String accountHolderName,
	 * 
	 * @RequestParam("Account Type") String
	 * accountType, @RequestParam("Account Balance") double amount)throws
	 * AccountNotFoundException {
	 * 
	 * list service.findAllBankAccountsDetails();
	 * 
	 * return "success"; }
	 */
	@RequestMapping("/deposit")

	public String deposite() {

		return "deposit";
	}

	@RequestMapping("/success")
	public String deposite(@RequestParam("AccountId") long accountId, @RequestParam("Amount") double amount)throws  AccountNotFoundException  {


		service.deposit(accountId,amount);
		return "success";
	}

	@RequestMapping("/checkbalance")

	public String checkbal() {

		return "checkbalance";
	}

	@RequestMapping("/successs")
	public String checkbal(@RequestParam("AccountId") long accountId,Model model) throws  AccountNotFoundException  {

		double cb=service.checkBalance(accountId);
		model.addAttribute("check",cb);
		return "successs";
	}
	@RequestMapping("/searchAccount1")

	public String search() {

		return "searchAccount1";
	}

	@RequestMapping("/succes")
	public String searchAccountDetails1(@RequestParam("AccountId") long accountId,Model model) throws  AccountNotFoundException  {

		BankAccount account=service.searchAccountDetails(accountId);
		
		model.addAttribute("cherry", account);
		return "succes";
	}
	
	@RequestMapping("/fundTransfer")

	public String fund() {

		return "fundTransfer";
	}


	@RequestMapping("/success")
	public String fundTransfer1(@RequestParam("fromaccount") long fromAccount, @RequestParam("toaccount") long toAccount, @RequestParam("amount") double amount) throws  AccountNotFoundException, LowBalanceException  {

		service.fundTransfer( fromAccount, toAccount, amount);
	
		return "success";
	}
	
	@RequestMapping("/withdraw")

	public String withr() {

		return "withdraw";
	}


	@RequestMapping("/success")
	public String withDrawl(@RequestParam("AccountId ") long fromAccount, @RequestParam("Amount") double amount) throws  AccountNotFoundException, LowBalanceException  {

		service.withdraw(fromAccount, amount);
	
		return "success";
	}
	
	/*
	 * @RequestMapping("/updateBankAccountDetails1")
	 * 
	 * public String update() {
	 * 
	 * return "updateBankAccountDetails1"; }
	 * 
	 * 
	 * @RequestMapping("/success") public String update1(@RequestParam("accountId ")
	 * long accountId, @RequestParam("accoutHolder")
	 * accountHolderName, @RequestParam("accountType") String accountType) throws
	 * AccountNotFoundException, LowBalanceException {
	 * 
	 * service.updateBankAccountDetails(accountId, accountHolderName, accountType)
	 * 
	 * return "success"; }
	 */
	
}