package xin.nimil.mall.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Category
 *
 * @author amin
 * @date 2020/1/3 9:16 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {

	private Integer id;

	private Integer parentId;

	private String name;

	private Integer status;

	private Integer sortOrder;

	private Date createTime;

	private Date updateTime;


}
