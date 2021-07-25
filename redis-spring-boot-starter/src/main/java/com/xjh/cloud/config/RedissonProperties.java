package com.xjh.cloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xujiahui
 * @create 2021/7/24 17:24
 * @Description
 */
@ConfigurationProperties(prefix = "gp.redisson")
public class RedissonProperties {

    private String host = "localhost";

    private String username;

    private String password;

    private int port = 6379;

    private int timeout;

    private boolean ssl;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }
}
