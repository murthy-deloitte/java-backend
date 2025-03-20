package com.udemy.spring.mapper;

import com.udemy.spring.dto.AccountsDto;
import com.udemy.spring.entity.Accounts;

public class AccountsMapper {

    /**
     * Maps the properties from an Accounts entity to an AccountsDto object.
     *
     * @param accounts The source Accounts entity containing the data.
     * @param accountsDto The target AccountsDto object where the data is placed.
     * @return The populated AccountsDto object.
     */
    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    /**
     * Maps the properties from an AccountsDto object to an Accounts entity.
     *
     * @param accountsDto The source AccountsDto object containing the data.
     * @param accounts The target Accounts entity to which the data is mapped.
     * @return The updated Accounts entity with data from the AccountsDto.
     */
    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }

}
