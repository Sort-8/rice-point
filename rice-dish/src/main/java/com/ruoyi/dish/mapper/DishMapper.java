package com.ruoyi.dish.mapper;

import java.util.List;
import com.ruoyi.dish.domain.Dish;

/**
 * 菜品Mapper接口
 *
 * @author panghai
 * @date 2021-10-23
 */
public interface DishMapper
{
    /**
     * 查询菜品
     *
     * @param dishId 菜品主键
     * @return 菜品
     */
    public Dish selectDishByDishId(Long dishId);

    /**
     * 查询菜品列表
     *
     * @param dish 菜品
     * @return 菜品集合
     */
    public List<Dish> selectDishList(Dish dish);

    /**
     * 查询今日上架菜品列表
     *
     * @param dish 菜品
     * @return 菜品集合
     */
    public List<Dish> selectTodayDishList(Dish dish);

    /**
     * 新增菜品
     *
     * @param dish 菜品
     * @return 结果
     */
    public int insertDish(Dish dish);

    /**
     * 修改菜品
     *
     * @param dish 菜品
     * @return 结果
     */
    public int updateDish(Dish dish);

    /**
     * 删除菜品
     *
     * @param dishId 菜品主键
     * @return 结果
     */
    public int deleteDishByDishId(Long dishId);

    /**
     * 批量删除菜品
     *
     * @param dishIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDishByDishIds(Long[] dishIds);

    /**
     * 校验菜品名称是否唯一
     *
     * @param dish 菜品信息
     * @return 结果
     */
    public int checkDishUnique(Dish dish);

    /**
     * 修改菜品状态
     *
     * @param dish 菜品
     * @return 结果
     */
    public int updateDishStatus(Dish dish);

    /**
     * 上架菜品
     *
     * @param dish 菜品
     * @return 结果
     */
    public int updateDishByDishId(Dish dish);

    /**
     * 批量上架菜品
     *
     * @param dish 菜品
     * @return 结果
     */
    public int updateDishByDishIds(Dish dish);
}
