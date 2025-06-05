package com.project.demo.controller;

import com.project.demo.entity.DeliveryOrder;
import com.project.demo.service.DeliveryOrderService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 配送订单：(DeliveryOrder)表控制层
 *
 */
@RestController
@RequestMapping("/delivery_order")
public class DeliveryOrderController extends BaseController<DeliveryOrder, DeliveryOrderService> {

    /**
     * 配送订单对象
     */
    @Autowired
    public DeliveryOrderController(DeliveryOrderService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
