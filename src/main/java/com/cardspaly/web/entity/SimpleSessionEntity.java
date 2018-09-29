/**
 * 
 */
package com.cardspaly.web.entity;


import java.io.Serializable;
 
import org.apache.shiro.session.mgt.SimpleSession;
 
/**
 * @Project: incomeservice
 * @Description xxx业务层
 * @author Mr.Silence
 * @date 2018年9月26日 
 * @version V1.0
 */

public class SimpleSessionEntity {
 
    private Long id;
    private String cookie;
    private Serializable session;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Serializable entity() {
        return session;
    }
    public void setSession(Serializable session) {
        this.session = session;
    }
    public String getCookie() {
        return cookie;
    }
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }
    public Serializable getSession() {
        return session;
    }
}
