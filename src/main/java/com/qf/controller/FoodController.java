package com.qf.controller;
import com.qf.entity.Food;
import com.qf.service.FoodService;
import com.qf.utils.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "食品Controller",tags = "食品模块的接口文档")
@RestController
@CrossOrigin
public class FoodController {
    @Autowired
    private FoodService foodService;

    /**
     * 查询所有的食物
     * @return
     */
    @ApiOperation( "查询所有的食物接口")
    @RequestMapping("findAllFoods.do")
    public ResultVo findAll(){  return foodService.findAll(); }

    /**
     * 根据id查询对应的食物
     * @param id
     * @return
     */
    @ApiOperation("实现根据id，响应对应的食物")
    @RequestMapping("findFoodById.do")
    public ResultVo findById(@ApiParam(value = "传入的id值") Integer id){
        return foodService.selectByPrimaryKey(id);
    }

    /**
     * 根据id删除食物
     * @param id
     * @return
     */
    @ApiOperation("根据id删除对应的食物接口")
    @RequestMapping("deleteFoodById.do")
    public ResultVo deleteFoodById(@ApiParam(value = "传入食物的id值")Integer id){
        return foodService.deleteByPrimaryKey(id);
    }

    /**
     * 根据食物的id属性对其进行修改
     * @param food
     * @return
     */
    @ApiOperation("根据食物id修改食品")
    @GetMapping("updatefood.do")
    public ResultVo updateByfood(@ApiParam(value = "传来的json格式对象") Food food){
        return foodService.updateByPrimaryKeySelective(food);
    }

    /**
     * 根据输入的食品属性新增食品
     * @param food
     * @return
     */
    @ApiOperation("新增食物接口")
    @PostMapping("addFood.do")
    public ResultVo addFood(@ApiParam(value = "传来的json格式对象")Food food){
        return foodService.insertSelective(food);
    }
}
