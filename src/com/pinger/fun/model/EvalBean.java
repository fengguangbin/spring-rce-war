package com.pinger.fun.model;

import com.pinger.fun.controller.IndexController;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ClassUtils;

/**
 * @author : p1n93r
 * @date : 2022/3/29 17:34
 */
@Setter
@Getter
public class EvalBean {

    public EvalBean() throws ClassNotFoundException {
        System.out.println("[+] 调用了EvalBean.EvalBean");
    }

    public String name;

    public CommonBean commonBean;


    public String getName() {
        System.out.println("[+] 调用了EvalBean.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("[+] 调用了EvalBean.setName");
        this.name = name;
    }

    public CommonBean getCommonBean() {
        System.out.println("[+] 调用了EvalBean.getCommonBean");
        return commonBean;
    }

    public void setCommonBean(CommonBean commonBean) {
        System.out.println("[+] 调用了EvalBean.setCommonBean");
        this.commonBean = commonBean;
    }
}
