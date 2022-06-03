package com.john.boot.mysql.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.john.boot.common.dto.PageRequest;

/**
 * @author john
 */
public class PageUtil {

    public static <T> Page<T> getPage(PageRequest pageRequest) {
        return new Page<>(pageRequest.getCurrent(), pageRequest.getSize());
    }
}
