package xin.nimil.mall.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import xin.nimil.mall.pojo.Category;

/**
 * CategoryMapper
 *
 * @author amin
 * @date 2020/1/3 9:19 下午
 */
public interface CategoryMapper {

	@Select("select * from mall_category where id=#{id}")
	Category findById(@Param("id") Integer id);

	Category queryById(Integer id);
}
