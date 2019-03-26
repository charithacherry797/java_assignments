package com.capgemini.bankapp.service;

import java.util.List;

import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;

public interface BankAccountService {
public double checkBalance(long accoundId);
public double withdraw(long accoundId,double amount)throws LowBalanceException;
public double deposite(long accountId,double amount);
public boolean deleteBankAccount(long accountId);
double fundTransfer(long fromAccount, long toAccount, double amount) throws LowBalanceException;
boolean addNewBankAccount(BankAccount account);
List<BankAccount> findAllBankAccounts();
public BankAccount searchBankAccount(long accountId);
}
			