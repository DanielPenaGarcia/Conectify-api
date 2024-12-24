package com.conectify.api.controllers;

import java.util.Collection;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conectify.api.controllers.models.requests.CreateAccountDTO;
import com.conectify.api.core.entities.Account;
import com.conectify.api.services.AccountService;

@Controller
@RestController
@RequestMapping("/api/")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("v1/accounts")
    public ResponseEntity<Account> createAccount(@RequestBody CreateAccountDTO createAccountDTO) {
        Account account = modelMapper.map(createAccountDTO, Account.class);
        account = accountService.createAccount(account);
        return ResponseEntity.ok(account);
    }

    @GetMapping("v1/accounts/user/{userId}")
    public ResponseEntity<Collection<Account>> getAccountsByUserId(@PathVariable String userId) {
        Collection<Account> accounts = accountService.getAccountsByUserId(userId);
        return ResponseEntity.ok(accounts);
    }
}
