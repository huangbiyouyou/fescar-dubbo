package com.fescar.account.service;


import com.baomidou.mybatisplus.service.IService;
import com.fescar.account.model.TAccount;
import com.fescar.model.AccountDTO;
import com.fescar.response.ObjectResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author
 * @since 2019-01-13
 */
public interface ITAccountService extends IService<TAccount> {

    /**
     * 扣用户钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
