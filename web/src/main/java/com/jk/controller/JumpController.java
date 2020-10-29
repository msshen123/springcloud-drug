package com.jk.controller;

/*import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;*/

import org.springframework.stereotype.Controller;
/*import org.springframework.ui.Model;*/
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String index() {
        return "admin/index";
    }

    //跳转活动页面
    @RequestMapping("act")
    public String act() {
        return "admin/act";
    }
<<<<<<< HEAD

    //跳转用户页面


    //跳用户页面

=======
    //跳转用户页面

    //跳用户页面
>>>>>>> 751cb76366088621dc4c64ee9dda2eb48481e68c
    @RequestMapping("find")
    public String find() {
        return "user";
    }

    //跳转会议页面
    @RequestMapping("meet")
    public String meet() {
        return "admin/meet";
    }
<<<<<<< HEAD

=======
>>>>>>> 751cb76366088621dc4c64ee9dda2eb48481e68c
    //跳转职务页面
    @RequestMapping("job")
    public String job() {
        return "jop";
    }
<<<<<<< HEAD


=======
    
>>>>>>> 751cb76366088621dc4c64ee9dda2eb48481e68c

    //跳转登录页面
    @RequestMapping("login")
    public String login() {
        return "login";
    }
<<<<<<< HEAD

=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 751cb76366088621dc4c64ee9dda2eb48481e68c
    //跳转回收站页面
    @RequestMapping("mat")
    public String mat() {
        return "admin/mat";
    }
<<<<<<< HEAD

=======
=======
>>>>>>> 7e7e12273e336f4a43b22165ec0d7151cbd7b9ba
>>>>>>> 6a9109c6077305d179d060b1e24749579bd62b0c
>>>>>>> bea2214c469e73639988d6cbd3ff72c1fbf5f9dd
>>>>>>> 751cb76366088621dc4c64ee9dda2eb48481e68c
}
