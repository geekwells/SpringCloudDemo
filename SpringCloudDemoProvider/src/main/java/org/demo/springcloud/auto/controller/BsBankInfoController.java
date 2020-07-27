package org.demo.springcloud.auto.controller;


import org.demo.springcloud.auto.service.impl.BsBankInfoServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author autoGenerateByMyBatisPlus
 * @since 2020-07-27
 */
@RestController
@RequestMapping("/auto/bs-bank-info")
public class BsBankInfoController {
    @Resource
    BsBankInfoServiceImpl bsBankInfoService;


}

