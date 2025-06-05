package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 美食订单：(FoodOrders)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "FoodOrders")
public class FoodOrders implements Serializable {

    // FoodOrders编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_orders_id")
    private Integer food_orders_id;

    // 订单编号
    @Basic
    private String order_number;
    // 店铺名称
    @Basic
    private String store_name;
    // 商家用户
    @Basic
    private Integer merchant_users;
    // 美食名称
    @Basic
    private String food_name;
    // 美食类型
    @Basic
    private String food_types;
    // 美食价格
    @Basic
    private String food_prices;
    // 学生用户
    @Basic
    private Integer student_users;
    // 学生姓名
    @Basic
    private String student_name;
    // 联系电话
    @Basic
    private String contact_number;
    // 收货地址
    @Basic
    private String shipping_address;
    // 购买数量
    @Basic
    private Integer purchase_quantity;
    // 购买总价
    @Basic
    private String total_purchase_price;
    // 订单备注
    @Basic
    private String order_remarks;
    // 订单状态
    @Basic
    private String order_status;




    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;










    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
