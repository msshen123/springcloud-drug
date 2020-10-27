package com.jk.controller;

/*import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;*/
import org.springframework.stereotype.Controller;
/*import org.springframework.ui.Model;*/
import org.springframework.web.bind.annotation.RequestMapping;

/*import javax.servlet.http.HttpServletRequest;*/

@Controller
@RequestMapping("jump")
public class JumpController {
    //跳转登录页面
    /*@RequestMapping("login")
    public String login(HttpServletRequest request, Model model) {
       //获取异常提示信息
       String exception= (String) request.getAttribute("shiroLoginFailure");
       String message = "";
       if(exception!=null){
        if(UnknownAccountException.class.getName().equals(exception)){
              System.out.println("UnknownAccountException -->账号不存在");
              message ="UnknownAccountException-->账号不存在";
        } else{
            message="else >>"+exception;
            System.out.println("eles >>"+exception);
        }
       }
        model.addAttribute("message",message);
        return "login";
    }*/
    //跳转树页面
    @RequestMapping("index")
    public String index(){
        return "admin/index";
    }
    //跳转活动页面
    @RequestMapping("act")
    public String act(){
        return "admin/act";
    }

    @RequestMapping("find")
    public String find() {
        return "user";
    }
    //跳转会议页面
    @RequestMapping("meet")
    public String meet(){
        return "admin/meet";
    }
}
