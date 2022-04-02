package com.ql.model;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * config_info
 * </p>
 *
 * @author liang qu
 * @since 2022-03-31
 */
@Data
public class ConfigInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * data_id
     */
    private String dataId;

    private String groupId;

    /**
     * content
     */
    private String content;

    /**
     * md5
     */
    private String md5;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    private LocalDateTime gmtModified;

    /**
     * source user
     */
    private String srcUser;

    /**
     * source ip
     */
    private String srcIp;

    private String appName;

    /**
     * 租户字段
     */
    private String tenantId;

    private String cDesc;

    private String cUse;

    private String effect;

    private String type;

    private String cSchema;


}
