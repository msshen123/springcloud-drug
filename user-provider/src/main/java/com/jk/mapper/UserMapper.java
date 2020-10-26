package com.jk.mapper;

import com.jk.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

List<User>  findSysUserByUsercode(String usercode);


}
