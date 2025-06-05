package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 配送订单：(DeliveryOrder)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "DeliveryOrder")
public class DeliveryOrder implements Serializable {

    // DeliveryOrder编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_order_id")
    private Integer delivery_order_id;

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
    private String purchase_quantity;
    // 配送用户
    @Basic
    private Integer delivery_users;
    // 配送状态
    @Basic
    private String delivery_status;
    // 配送描述
    @Basic
    private String delivery_description;
    // 收货状态
    @Basic
    private String receiving_status;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
