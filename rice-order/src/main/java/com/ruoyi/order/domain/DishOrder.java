package com.ruoyi.order.domain;

import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 菜品订单对象 rice_dish_order
 *
 * @author panghai
 * @date 2021-11-07
 */
public class DishOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单id */
    private Long orderId;

    /** 菜品id */
    private Long dishId;

    /** 菜品名称 */
    private String dishesName;

    /** 菜品url */
    private String url;

    /** 菜品数量 */
    private int number;

    /** 菜品价格 */
    private double price;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getDishId() {
        return dishId;
    }

    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DishOrder{" +
                "orderId=" + orderId +
                ", dishId=" + dishId +
                ", dishesName='" + dishesName + '\'' +
                ", url='" + url + '\'' +
                ", number=" + number +
                ", price=" + price +
                '}';
    }
}
