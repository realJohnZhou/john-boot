package com.john.boot.common.dto;

import lombok.Data;

/**
 * @author john
 */
@Data
public class PageRequest {
    private Long current;

    private Long size;
}
