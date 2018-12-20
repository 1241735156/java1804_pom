package com.qf.shop.shop_service_impl.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.entity.Goods;
import com.qf.service.IGoodService;
import com.qf.shop.dao.IGoodsDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodService {


    @Autowired
    private IGoodsDao iGoodsDao;

    @Override
    public List<Goods> queryAll() {
        System.out.println("调用的service的实现了类");
        return iGoodsDao.queryAll();
    }
}
