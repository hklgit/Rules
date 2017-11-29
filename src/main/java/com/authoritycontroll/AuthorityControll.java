package com.authoritycontroll;

import com.bstek.urule.console.DefaultUser;
import com.bstek.urule.console.EnvironmentProvider;
import com.bstek.urule.console.User;
import com.bstek.urule.console.servlet.RequestContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hankl on 2017/11/27.
 */
     public class AuthorityControll implements EnvironmentProvider {

//getLoginUser返回的是固定的用户名为"admin"的用户.這個返回的就是admin用戶
    @Override
    public User getLoginUser(RequestContext requestContext) {
        DefaultUser user=new DefaultUser();
        user.setCompanyId("coocaa");
        user.setUsername("admin");
        user.setAdmin(true);
        return user;
    }

    @Override
    public List<User> getUsers() {

        DefaultUser user1=new DefaultUser();
        user1.setCompanyId("coocaa");
        user1.setUsername("user1");
        DefaultUser user2=new DefaultUser();
        user2.setCompanyId("coocaa");
        user2.setUsername("user2");
        DefaultUser user3=new DefaultUser();
        user3.setCompanyId("coocaa");
        user3.setUsername("user3");
        List<User> users=new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;



    }
}
