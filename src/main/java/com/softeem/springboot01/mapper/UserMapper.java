package com.softeem.springboot01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.softeem.springboot01.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
