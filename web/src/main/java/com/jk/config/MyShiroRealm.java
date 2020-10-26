package com.jk.config;

import com.jk.entity.User;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyShiroRealm extends AuthorizingRealm {
   @Reference
  // private UserService userService;
    /**
     * 授权器
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
    /**
     * 认证器
     * @param token
     * @return
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

    //获取 前台用户输入的用户名
        String usercode= (String) token.getPrincipal();

    //通过用户查询数据库 判断当前用户是否存在
     //   User sysUser =userService.findUserByUserCode(usercode);

    //判断当前用户是否存在
    //  if(sysUser==null){

          return  null;
      }
     //  SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(usercode,
       //        sysUser.getPassword());
    //    return simpleAuthenticationInfo;
    }





