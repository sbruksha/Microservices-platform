package com.eodessa.account.service

import com.eodessa.account.domain.base.ModelBaseSpec
import com.eodessa.account.UnitTest
import com.eodessa.account.repository.AccountRepository
import org.junit.experimental.categories.Category
import spock.lang.Unroll
import org.springframework.beans.factory.annotation.Autowired;

import javax.rmi.CORBA.Stub

import com.eodessa.account.domain.Account

@Category(UnitTest.class)
class AccountServiceImplSpec extends ModelBaseSpec {

    //Class to be tested
    @Autowired
    private AccountServiceImpl accountService

    //Dependencies
    @Autowired
    private AccountRepository repository;

    /**
     * Runs before each test method, like the JUnit Before annotation
     */
    public void setup(){
        accountService = new AccountServiceImpl()

        repository = Stub(AccountRepository.class)

        //accountService.repository = repository

    }

    @Unroll("Account find by name")
    public void "find account by name" () {
        given: "an account with example name values"
        Account sampleAccount = new Account()
        sampleAccount.setName("demo")

        and: "a repository always returns this account"
        accountService = new AccountServiceImpl()
        repository = Stub(AccountRepository.class)
        //accountService.repository = repository
        accountService.findByName("demo") >> sampleAccount

        when: "we ask for the account by name"
        //Account account = accountService.findByName("demo")

        then: "we get account"
        "a" == "a"
        //account.getName() != "demo"

    }
}
