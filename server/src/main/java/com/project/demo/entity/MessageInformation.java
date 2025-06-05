package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 留言信息：(MessageInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "MessageInformation")
public class MessageInformation implements Serializable {

    // MessageInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_information_id")
    private Integer message_information_id;

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
    // 留言内容
    @Basic
    private String message_content;
    // 回复内容
    @Basic
    private String reply_content;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
