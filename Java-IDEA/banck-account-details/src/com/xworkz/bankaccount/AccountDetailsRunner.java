package com.xworkz.bankaccount;

import com.xworkz.bankaccount.dao.AccountDetailsDao;
import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsRunner {
    public static void main(String[] args) {
        AccountDetailsDto dto = new AccountDetailsDto();
        dto.customerId=12;
        dto.bankName="sbi";
        dto.ifscCode="sbin13252";
        dto.accountNumber=1277373L;
        dto.branchName="hiriyur";
        dto.accountType="Savings";
        dto.address="hiriyur";

        AccountDetailsDao dao =new AccountDetailsDao();
        dao.createAccount(dto);
        dao.getAccountDetails();

    }


}
