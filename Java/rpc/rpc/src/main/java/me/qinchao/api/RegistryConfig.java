package me.qinchao.api;

/**
 * Created by SULVTO on 16-4-3.
 */
public class RegistryConfig extends AbstractConfig {

    private String serviceName;
    private Class<?> referenceClass;

    public RegistryConfig(String serviceName) {
        this.serviceName = serviceName;
    }

    public RegistryConfig(String host, int port, String serviceName) {
        super(host, port);
        this.serviceName = serviceName;

    }

    public Class<?> getReferenceClass() {
        return referenceClass;
    }

    public void setReferenceClass(Class<?> referenceClass) {
        this.referenceClass = referenceClass;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
