package xin.nimil.mall;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xin.nimil.mall.dao.CategoryMapper;
import xin.nimil.mall.pojo.Category;

@SpringBootTest
class MallApplicationTests {


	@Autowired
	private CategoryMapper categoryMapper;

	@Test
	void contextLoads() {

		Category category = categoryMapper.findById(100001);

		System.out.println(category);
	}


	@Test
	void queryByIdTest() {

		Category category = categoryMapper.queryById(100001);

		System.out.println(category);
	}


}
