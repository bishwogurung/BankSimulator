package com.gbank.domain;

public class ClientAccount {
    int accountId;
    Client clientId;
    String accountType;
    long accountBalance;

    public ClientAccount(Client clientId, String accountType, long accountBalance) {
        this.clientId = clientId;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "ClientAccount{" +
                "accountId=" + accountId +
                ", clientId=" + clientId +
                ", accountType='" + accountType + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
