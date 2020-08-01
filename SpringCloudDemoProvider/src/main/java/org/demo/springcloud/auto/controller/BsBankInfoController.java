package org.demo.springcloud.auto.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.demo.springcloud.auto.entity.BsBankInfo;
import org.demo.springcloud.auto.service.impl.BsBankInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author autoGenerateByMyBatisPlus
 * @since 2020-08-01
 */
@RestController
@RequestMapping("/auto/bs-bank-info")
public class BsBankInfoController {

    @Resource
    BsBankInfoServiceImpl bankInfoService;

    /**
     * 查询列表
     *
     * @param bsBankInfo
     * @return
     */
    @PostMapping("list")
    public Object list(@RequestBody BsBankInfo bsBankInfo) {
        Wrapper queryWrapper = new QueryWrapper<>(bsBankInfo);
        return bankInfoService.list(queryWrapper);
    }

    @PostMapping("listbyPage")
    public Object listbyPage(@RequestBody BsBankInfo bsBankInfo) {
        Page<BsBankInfo> pager = new Page(1, 1);//这里测试固定了
        Wrapper queryWrapper = new QueryWrapper<>(bsBankInfo);
        return bankInfoService.page(pager, queryWrapper);
    }

    @PostMapping("add")
    public Object add(@RequestBody BsBankInfo bsBankInfo) {
        return bankInfoService.save(bsBankInfo);
    }

    @PostMapping("update")
    public Object update(@RequestBody BsBankInfo bsBankInfo) {
        return bankInfoService.updateById(bsBankInfo);
    }

    @PostMapping("delete")
    public Object delete(@RequestBody BsBankInfo bsBankInfo) {
        return bankInfoService.remove(new QueryWrapper<>(bsBankInfo));
    }
}

