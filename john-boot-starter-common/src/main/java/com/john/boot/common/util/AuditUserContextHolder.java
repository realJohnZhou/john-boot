package com.john.boot.common.util;

import com.john.boot.common.dto.AuthUser;

/**
 * 审计功能使用的用户
 *
 * @author john
 */
public class AuditUserContextHolder {
    private static final ThreadLocal<AuthUser> USER_ID_HOLDER = new ThreadLocal<>();

    /**
     * get user
     *
     * @return
     */
    public static AuthUser getUser() {
        return USER_ID_HOLDER.get();
    }

    public static void setUser(AuthUser auditUser) {
        USER_ID_HOLDER.set(auditUser);
    }

    public static void remove() {
        USER_ID_HOLDER.remove();
    }
}
