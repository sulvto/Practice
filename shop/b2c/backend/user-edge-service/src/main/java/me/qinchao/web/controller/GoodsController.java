package me.qinchao.web.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import me.qinchao.web.domain.Goods;
import me.qinchao.web.exception.EntryNotFoundException;
import me.qinchao.web.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static me.qinchao.web.util.Response.success;

/**
 * Created by sulvto on 9/20/18.
 */
@RestController
@RequestMapping(path = "/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @ApiOperation(value = "发布商品", notes = "")
    @ApiImplicitParam(name = "goods", value = "商品详细实体", required = true, dataType = "User")
    @PostMapping()
    public @ResponseBody
    String addNewGoods(@RequestBody Goods goods) {
        goodsService.add(goods);
        return success();
    }

    @ApiOperation(value = "获取商品详细信息", notes = "根据商品ID获取商品详细信息")
    @ApiImplicitParam(name = "id", value = "商品ID", required = true, paramType = "path", dataType = "Long")
    @GetMapping(path = "/{id}")
    public String getGoods(@PathVariable Long id) throws EntryNotFoundException {
        return success(goodsService.findById(id));
    }


    @ApiOperation(value = "更新商品详细信息", notes = "更新ID指定的商品详细信息")
    @ApiImplicitParam(name = "goods", value = "商品详细实体", required = true, dataType = "User")
    @PutMapping()
    public String updateGoods(@RequestBody Goods goods) throws EntryNotFoundException {
        return success(goodsService.update(goods, goods.getId()));
    }


    @ApiOperation(value = "删除商品", notes = "商品ID指定的商品")
    @ApiImplicitParam(name = "id", value = "商品ID", required = true, dataType = "Long")
    @DeleteMapping(path = "/{id}")
    public String deleteGoods(@PathVariable Long id) throws EntryNotFoundException {
        return success(goodsService.deleteById(id));
    }

    @GetMapping()
    @ApiOperation(value = "获取商品列表", notes = "")
    public String getAllGoods() {
        return success(goodsService.findAll());
    }

}
