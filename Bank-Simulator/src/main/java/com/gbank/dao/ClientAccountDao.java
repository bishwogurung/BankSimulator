package com.gbank.dao;

import com.gbank.domain.Client;
import com.gbank.domain.ClientAccount;

import java.util.List;

public interface ClientAccountDao {
    public List<ClientAccount> getClientAllAccounts(int clientId);
    public ClientAccount getClientAccountInfo(int clientId, int clientAccountId);
    public void createBankAccount(int clientId);
    public void deposit(int clientId, int clientAccountId, long amount);
    public void withdraw(int clientId, int clientAccountId, long amount);
    public int deleteAccount(int clientId, int clientAccountId);

}
