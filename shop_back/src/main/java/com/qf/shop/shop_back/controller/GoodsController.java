package com.qf.shop.shop_back.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Goods;
import com.qf.service.IGoodService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Reference
    private IGoodService iGoodService;

    @RequestMapping("/goodslist")
    public String goodManager(){
        List<Goods> list = iGoodService.queryAll();
        System.out.println(list+"======查询的所有商品=========");
        return  "goodslist";
    }
}
