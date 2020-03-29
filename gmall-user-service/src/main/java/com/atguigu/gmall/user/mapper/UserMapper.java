package com.atguigu.gmall.user.mapper;

//import tk.mybatis.mapper.common.Mapper;
import com.atguigu.gmall.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Author ZhangJian
 * @Description com.atguigu.gmall.user.mapper
 * @Date 2020/3/3
 * @Version 1.0
 */
@Mapper
    //@Repository


public interface UserMapper extends tk.mybatis.mapper.common.Mapper<UmsMember> {

}
