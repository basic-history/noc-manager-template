CREATE TABLE `pub_sequence` (
  `current_id` varchar(20) NOT NULL DEFAULT '0' COMMENT '当前值',
  `sequence_name` varchar(20) COMMENT '序列名',
  `cache_size` int(11) NOT NULL DEFAULT '1' COMMENT '步长，不可小于1',
  `padding_length` int(11) NOT NULL DEFAULT '0' COMMENT '补位，缺失的位补零',
  `remark` varchar(255) NOT NULL DEFAULT '' COMMENT '介绍',
  PRIMARY KEY (`sequence_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
