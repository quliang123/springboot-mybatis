package com.ql.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ql.model.ConfigInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * config_info Mapper 接口
 * </p>
 *
 * @author liang qu
 * @since 2022-03-31
 */
@Mapper
public interface ConfigInfoMapper {

    List<Map> list();

    List<Map> sourceIpStatistics();

    IPage<ConfigInfo> configList(Page page);
}
