package com.rete;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.bstek.urule.action.ActionId;
import com.bstek.urule.model.ExposeAction;

/**
 * Created by hankl on 2017/11/24.
 */
public class MethodTest {

    @ActionId("helloKey")
    public String hello(String username){
        System.out.println("hello "+username);
        return "hello"+username;
    }
    @ExposeAction("方法1")
    public boolean evalTest(String username){
        if(username==null){
            return false;
        }else if(username.equals("张三")){
            return true;
        }
        return false;
    }

    @ExposeAction("测试Int")
    public int testInt(int a,int b){
        return a+b;
    }
    public int testInteger(Integer a,int b){
        return a+b*10;
    }

    @ExposeAction("打印内容")
    public void printContent(String username,Date birthday){
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(birthday!=null){
            System.out.println(username+"今年已经"+sd.format(birthday)+"岁了!");
        }else{
            System.out.println("Hello "+username+"");
        }
    }
//    @ExposeAction("打印Member")
//    public void printUser(Member m){
//        System.out.println("Hello "+m.getUsername()+", has house:"+m.isHouse());
//    }
}
