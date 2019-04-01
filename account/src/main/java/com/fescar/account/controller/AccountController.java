package com.fescar.account.controller;

import com.fescar.account.service.ITAccountService;
import com.fescar.model.AccountDTO;
import com.fescar.response.ObjectResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  账户扣钱
 * </p>
 *
 * @author
 * @since 2019-01-13
 */
@RestController
@RequestMapping("/account")
//解决跨域的问题
@CrossOrigin
public class AccountController {

    @Resource
    private ITAccountService accountService;

    @PostMapping("/dec_account")
    ObjectResponse decreaseAccount(AccountDTO accountDTO){
        System.out.print(accountDTO.toString());
        return accountService.decreaseAccount(accountDTO);
    }

}
