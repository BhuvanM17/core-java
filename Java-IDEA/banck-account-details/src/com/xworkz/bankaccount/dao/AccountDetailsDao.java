package com.xworkz.bankaccount.dao;

import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsDao {


    AccountDetailsDto dto;

    public boolean createAccount(AccountDetailsDto dto) {    //parametersied constructor
        System.out.println("The object is created");
        System.out.println("parametersied constructor is invoked");
        boolean isAccountCreated = false;
        if (dto != null) {
            this.dto = dto;
            isAccountCreated = true;
        }
        return isAccountCreated;
    }

    public void getAccountDetails() {

        System.out.println("customerId is:" + dto.customerId);
        System.out.println("bankName is:" + dto.bankName);
        System.out.println("branchName is:" + dto.branchName);
        System.out.println("ifscCode is:" + dto.ifscCode);
        System.out.println("accountNumber is:" + dto.accountNumber);
        System.out.println("accountType is:" + dto.accountType);
        System.out.println("address is:" + dto.address);


    }
}
