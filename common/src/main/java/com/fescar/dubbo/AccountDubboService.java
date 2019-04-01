package com.fescar.dubbo;


import com.fescar.model.AccountDTO;
import com.fescar.response.ObjectResponse;

/**
 * @Author:
 * @Description  账户服务接口
 * @Date Created in 2019/1/13 16:37
 */
public interface AccountDubboService {

    /**
     * 从账户扣钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
