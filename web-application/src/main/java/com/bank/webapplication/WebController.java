package com.bank.webapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    WebAccountsService webAccountsService;

    @GetMapping("/")
    String home() {
        return "home";
    }

    @GetMapping("/accounts")
    String all(ModelMap modelMap) {
        modelMap.put("accounts", webAccountsService.getAllAccounts());
        return "accounts";
    }

}
