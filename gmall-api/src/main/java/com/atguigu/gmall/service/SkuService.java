package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsSkuInfo;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author ZhangJian
 * @Description com.atguigu.gmall.service
 * @Date 2020/3/11
 * @Version 1.0
 */
public interface SkuService {
     void saveSkuInfo(PmsSkuInfo pmsSkuInfo) ;

    PmsSkuInfo getSkuById(String skuId,String id);

    List<PmsSkuInfo> getSkuSaleAttrValueListBySpu(String productId);

    List<PmsSkuInfo> getAllSku(String catalog3Id);

    boolean checkPrice(String productSkuId, BigDecimal productPrice);
}
