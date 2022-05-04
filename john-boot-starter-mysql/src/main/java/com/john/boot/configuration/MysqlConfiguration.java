package com.john.boot.configuration;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

/**
 * mysql starter configuration
 *
 * @author john
 */
public class MysqlConfiguration {
    @Bean
    public MetaObjectHandler metaObjectHandler() {
        return new MetaObjectHandler() {
            @Override
            public void insertFill(MetaObject metaObject) {
                LocalDateTime now = LocalDateTime.now();
                this.setFieldValByName("createTime", now, metaObject);
                this.setFieldValByName("updateTime", now, metaObject);
                // todo
                this.setFieldValByName("createBy", "", metaObject);
                this.setFieldValByName("updateBy", "", metaObject);
            }

            @Override
            public void updateFill(MetaObject metaObject) {
                // todo
                this.setFieldValByName("updateBy", "", metaObject);
                this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
            }
        };
    }
}
