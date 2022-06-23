package com.john.boot.common.dto;

import lombok.Data;

/**
 * @author john
 */
@Data
public class PageRequest {
    /**
     * current page
     */
    private Long current;
    /**
     * page size
     */
    private Long size;
}
