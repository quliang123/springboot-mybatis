package com.ql.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ql.mapper.ConfigInfoMapper;
import com.ql.model.ConfigInfo;
import com.ql.service.IConfigInfoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * config_info 服务实现类
 * </p>
 *
 * @author liang qu
 * @since 2022-03-31
 */
@Service
@AllArgsConstructor
public class ConfigInfoServiceImpl  implements IConfigInfoService {

    private final ConfigInfoMapper configInfoMapper;

    @Override
    public List<Map> list() {
        return configInfoMapper.list();
    }

    @Override
    public List<Map> sourceIpStatistics() {
        return configInfoMapper.sourceIpStatistics();
    }

    @Override
    public IPage configList(Page page) {
        return configInfoMapper.configList(page);
    }

    @Override
    public List<Map> configList2() {
        return configInfoMapper.configList();
    }

}
