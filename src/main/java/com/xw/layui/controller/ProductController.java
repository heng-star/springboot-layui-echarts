package com.xw.layui.controller;

import com.xw.layui.mapper.ProductMapper;
import com.xw.layui.service.ProductService;
import com.xw.layui.vo.BarVO;
import com.xw.layui.vo.DataVO;
import com.xw.layui.vo.ProductBarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductMapper productMapper;

    @RequestMapping("/list")
    @ResponseBody
    public DataVO list(Integer page, Integer limit){
        return productService.findData(page, limit);
    }

    @RequestMapping("/barVO")
    @ResponseBody
    public BarVO getBarVO(){
        return productService.getBarVO();
    }

//    @RequestMapping("/pieVO")
//    @ResponseBody
//    public List<PieVO> getPieVO(){
//        return productService.getPieVO();
//    }

    @RequestMapping("/pieVO")
    @ResponseBody
    public List<ProductBarVO> getPieVO(){
        return productMapper.findAllProductBarVO();
    }

}
