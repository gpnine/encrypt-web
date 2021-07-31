package com.zcl.controller;

import com.zcl.bean.User;
import com.zcl.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zcl.beans.RespBean;

/**
 * .
 *
 * @Author Chenglin Zhu
 * @Date 2021/7/30 10:20 上午
 */
@RestController
@RequestMapping("/manage/user")
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserService userService;

    /**
     * 通过会员id获取会员信息及详情
     *
     * @param id 会员id
     * @return app msg
     */
    @GetMapping("/query/{id}")
    public RespBean edit(@PathVariable Integer id) {
        if (null == id) {
            return RespBean.error("会员ID不能为空");
        }

        // 查询会员对象
        User user = userService.queryById(id);
        if (user == null) {
            return RespBean.error("根据会员ID未查询到对应会员");
        }

        return RespBean.ok("用户", user);
    }

}