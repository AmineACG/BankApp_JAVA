package DAO.Interfaces;

import Model.Account;
public interface IAccountDAO {

     void createAccount(Account account);
     Account getAccountById(int accountId);
     void updateAccount(Account account);
     void deleteAccount(String accountId); 
} 
//@AMINEACG