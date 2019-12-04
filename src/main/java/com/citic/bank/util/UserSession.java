package com.citic.bank.util;

import com.citic.bank.model.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: ym
 * @Date: 2019/12/4 16:30
 * @Version 1.0
 */
public class UserSession {
    public static final String USER_IN_SESSION = "user";
    private static HttpSession getSession() {
        ServletRequestAttributes threadAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = threadAttributes.getRequest();
        HttpSession session = request.getSession();
        return session;
    }

    public static void putUserSession(User user) {
        // 得到session,并把current放到session中
        getSession().setAttribute(USER_IN_SESSION, user);
    }

    public static User getUserSession() {

        return (User) getSession().getAttribute(USER_IN_SESSION);
    }
    public static void removeSession(){
        getSession().invalidate();
    }//Of removeSession

}
