package com.wyt.HikariCP.demo.controller;

import com.wyt.HikariCP.demo.mapper.ChatDetailMapper;
import com.wyt.HikariCP.demo.model.ChatDetailExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyitao on 2019/3/27.
 */
@RestController
@RequestMapping("/cdc")
public class ChatDetailController {

    @Autowired
    private ChatDetailMapper chatDetailMapper;

    @RequestMapping("/query")
    @ResponseBody
    public String query(long companyId) {
        long start = System.currentTimeMillis();
        ChatDetailExample example = new ChatDetailExample();
        example.createCriteria().andCompanyIdEqualTo(companyId);
        int count = chatDetailMapper.countByExample(example);
        long end = System.currentTimeMillis();
        System.out.println("query count:" + count + " cost:" + (end - start) + "ms");
        return String.valueOf(count);
    }

    @RequestMapping("/queryLike")
    @ResponseBody
    public String queryLike(long companyId) {
        long start = System.currentTimeMillis();
        int count = chatDetailMapper.countByLike(companyId, "%欢迎语%");
        long end = System.currentTimeMillis();
        System.out.println("queryLike count:" + count + " cost:" + (end - start) + "ms");
        return String.valueOf(count);
    }
}
