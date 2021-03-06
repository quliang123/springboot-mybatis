package com.ql.ctrl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ql.service.IConfigInfoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * config_info 前端控制器
 * </p>
 *
 * @author liang qu
 * @since 2022-03-31
 */
@RestController
@RequestMapping("/config/config-info")
@AllArgsConstructor
public class ConfigInfoController {

    private final IConfigInfoService configInfoService;

    @GetMapping
    public ResponseEntity list() {
        return ResponseEntity.ok(configInfoService.list());
    }

    @GetMapping("/sourceIpStatistics")
    public ResponseEntity sourceIpStatistics() {
        return ResponseEntity.ok(configInfoService.sourceIpStatistics());
    }

    /**
     * 127.0.0.1:8081/config/config-info/list?current=1&size=1
     *
     * @param page current 当前页    默认：1
     *             size    每页数据量 默认10条数据
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity configList(Page page) {
        return ResponseEntity.ok(configInfoService.configList(page));
    }

    @GetMapping("/test")
    public ResponseEntity test(){
        return ResponseEntity.status(HttpStatus.OK).body("test");
    }

    @GetMapping("/test1")
    public ResponseEntity test2(Page page){
        Map retMap = new HashMap();
        IPage iPage = configInfoService.configList(page);
        List<Map> list2 = configInfoService.configList();
        retMap.put("ipage", iPage);
        retMap.put("list", list2);
        return ResponseEntity.ok(retMap);
    }

    @GetMapping("/{id}")
    public ResponseEntity dateil(@PathVariable("id") Long id) {
        return ResponseEntity.ok(configInfoService.configList(id));
    }
}
