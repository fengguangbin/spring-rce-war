package com.pinger.fun.model;

import lombok.Data;

/**
 * @author : p1n93r
 * @date : 2022/3/29 18:22
 */
@Data
public class CommonBean {

    public CommonBean(){
        System.out.println("[+] 调用了com.example.spbdemo.pojo.CommonBean.CommonBean");
    }


    public String name;


    public String getName() {
        System.out.println("[+] 调用了com.example.spbdemo.pojo.CommonBean.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("[+] 调用了com.example.spbdemo.pojo.CommonBean.setName");
        this.name = name;
    }
}
