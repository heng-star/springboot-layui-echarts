package com.xw.layui.service;

import com.xw.layui.vo.BarVO;
import com.xw.layui.vo.DataVO;
import com.xw.layui.vo.PieVO;
import com.xw.layui.vo.ProductVO;


import java.util.List;

public interface ProductService {
    public DataVO<ProductVO> findData(Integer page, Integer limit);
    public BarVO getBarVO();
    public List<PieVO> getPieVO();
}
