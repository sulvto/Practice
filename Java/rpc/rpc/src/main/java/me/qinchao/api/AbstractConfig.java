package me.qinchao.api;

/**
 * Created by SULVTO on 16-4-3.
 */
public abstract class AbstractConfig {
    private String host;
    private int port;

    public AbstractConfig() {
    }

    public AbstractConfig(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
