package com.john.boot.common.util;

import com.john.boot.common.dto.AuditUser;

/**
 * 审计功能使用的用户
 *
 * @author john
 */
public class AuditUserContextHolder {
    private static final ThreadLocal<AuditUser> USER_ID_HOLDER = new ThreadLocal<>();

    public static AuditUser getUser() {
        return USER_ID_HOLDER.get();
    }

    public void setUser(AuditUser AuditUser) {
        USER_ID_HOLDER.set(AuditUser);
    }

    public void remove() {
        USER_ID_HOLDER.remove();
    }
}
