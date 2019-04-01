package com.fescar.storage.controller;



import com.fescar.model.CommodityDTO;
import com.fescar.response.ObjectResponse;
import com.fescar.storage.service.ITStorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author
 * @since 2019-01-13
 */
@RestController
@RequestMapping("/storage")
@Slf4j
public class TStorageController {


    @Autowired
    private ITStorageService storageService;

    /**
     * 扣减库存
     */
    @PostMapping("dec_storage")
    ObjectResponse decreaseStorage(CommodityDTO commodityDTO){
        return storageService.decreaseStorage(commodityDTO);
    }
}

