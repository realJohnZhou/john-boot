package com.john.boot.common.util;

/**
 * 审计功能使用的用户
 *
 * @author john
 */
public class UserContextHolder {
    private static final ThreadLocal<String> USER_ID_HOLDER = new ThreadLocal<>();

    public static String getUserId() {
        return USER_ID_HOLDER.get();
    }

    public void setUserId(String userId) {
        USER_ID_HOLDER.set(userId);
    }

    public void remove() {
        USER_ID_HOLDER.remove();
    }
}
