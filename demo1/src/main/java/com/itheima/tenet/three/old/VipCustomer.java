package com.itheima.tenet.three.old;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.tenet.three.old.VipCustomer
 ****/
public class VipCustomer {

    private String name;

    private String phone;

    public VipCustomer() {
    }

    public VipCustomer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String sefInfo() {
        return "给VIP客户发消息，客户名字：" + name + ",客户手机号："+phone;
    }

}
