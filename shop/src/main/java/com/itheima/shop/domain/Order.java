package com.itheima.shop.domain;

import com.itheima.shop.state.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/*****
 * @Author: http://www.itheima.com
 * @Description: com.itheima.shop.domain.Order
 ****/
@Data
@AllArgsConstructor
@ToString
public class Order implements Serializable {
    private String itemId;
    private String id;
    private Integer money;
    private Integer paymoney;
    private Integer status;
    private Integer num;
    private String username;
    private String couponsId;

    //状态改变时，执行不同的行为
    private State state;
    public Order() {
        this.state = null;
    }
}
