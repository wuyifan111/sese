package com.zb.mapper;
import com.zb.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface GoodsMapper {

	public Goods getGoodsById(@Param(value = "id") Long id)throws Exception;

	public List<Goods>	getGoodsListByMap(Map<String,Object> param)throws Exception;

	public Integer getGoodsCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertGoods(Goods goods)throws Exception;

	public Integer updateGoods(Goods goods)throws Exception;


}