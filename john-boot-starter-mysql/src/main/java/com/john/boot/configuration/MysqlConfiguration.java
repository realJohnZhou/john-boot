package com.john.boot.configuration;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.john.boot.common.util.UserContextHolder;
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
                String userId = UserContextHolder.getUserId() == null ? "anonymous" : UserContextHolder.getUserId();
                this.setFieldValByName("createBy", userId, metaObject);
                this.setFieldValByName("updateBy", userId, metaObject);
            }

            @Override
            public void updateFill(MetaObject metaObject) {
                String userId = UserContextHolder.getUserId() == null ? "anonymous" : UserContextHolder.getUserId();
                this.setFieldValByName("updateBy", userId, metaObject);
                this.setFieldValByName("updateTime", LocalDateTime.now(), metaObject);
            }
        };
    }
}
