package com.example.RestDB;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="account", schema = "abconline")
public class Account {
    @Id
    private String accountId; // ACCOUNT_ID

    private String accountName; // ACCOUNT_NAME

    public Account() {
        super();
    }

    public Account(String accountId, String accountName) {
        super();
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
