package io.github.noc.manager.model.po.pub;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 序列表
 */
@Data
@TableName("pub_sequence")
@Accessors(chain = true)
@ToString
public class PubSequencePO {

	@TableField("current_id")
	private String currentId;

	@TableField("column_name")
	private String columnName;

	@TableField("cache_size")
	private Integer cacheSize;

	@TableField("padding_length")
	private Integer paddingLength;

}
