package me.qinchao.demo.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sulvto on 17/03/2020.
 */
@RestController
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 探针检查响应类
     * @return String
     */
    @RequestMapping("/health")
    public String health() {
        return "health";
    }

    /**
     * 返回远程调用的结果
     * @return String
     */
    @RequestMapping("/getservicedetail")
    public String getservicedetail(
            @RequestParam(value = "servicename", defaultValue = "") String servicename) {
        return "Service [" + servicename + "]'s instance list : "
                + JSON.toJSONString(discoveryClient.getInstances(servicename));
    }

    /**
     * 返回发现的所有服务
     * @return String
     */
    @RequestMapping("/services")
    public String services() {
        return this.discoveryClient.getServices().toString()
                + ", "
                + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
