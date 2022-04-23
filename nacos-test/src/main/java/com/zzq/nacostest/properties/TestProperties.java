package com.zzq.nacostest.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.List;

@RefreshScope
@ConfigurationProperties(prefix = "test")
@Data
public class TestProperties {
    private String name;

    private List<String> list;
}
