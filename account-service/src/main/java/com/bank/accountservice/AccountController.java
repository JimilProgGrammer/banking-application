package com.bank.accountservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping(value = "/account")
    public Account save (@RequestBody Account account){
        return accountRepository.save(account);
    }

    @GetMapping(value = "/account")
    public Iterable<Account> all (){
        return accountRepository.findAll();
    }

    @GetMapping(value = "/account/{accountId}")
    public Account findByAccountId (@PathVariable Integer accountId){
        return accountRepository.findAccountByAccountId(accountId);
    }

    @PutMapping(value = "/account")
    public Account update (@RequestBody Account account){
        return accountRepository.save(account);
    }

    @DeleteMapping(value = "/account")
    public void delete (@RequestBody Account account){
        accountRepository.delete(account);
    }

}
