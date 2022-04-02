package com.ql.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ql.model.ConfigInfo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * config_info 服务类
 * </p>
 *
 * @author liang qu
 * @since 2022-03-31
 */
public interface IConfigInfoService {

    List<Map> list();

    List<Map> sourceIpStatistics();

    IPage configList(Page page);

    List<Map> configList2();
}
