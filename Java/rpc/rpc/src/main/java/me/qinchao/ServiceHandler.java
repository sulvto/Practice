package me.qinchao;

import me.qinchao.api.ProtocolConfig;
import me.qinchao.api.ReferenceConfig;
import me.qinchao.api.RegistryConfig;
import me.qinchao.protocol.Protocol;
import me.qinchao.protocol.impl.DefaultProtocol;
import me.qinchao.registry.Registry;
import me.qinchao.registry.RegistryFactory;

import java.util.List;

/**
 * Created by SULVTO on 16-4-3.
 */
public class ServiceHandler {
    private Registry registry = RegistryFactory.getRegistry();
    private Protocol protocol = new DefaultProtocol();

    private ProtocolConfig protocolConfig;
    private RegistryConfig registryConfig;

    public ServiceHandler() {

    }

    public ServiceHandler(ProtocolConfig protocolConfig, RegistryConfig registryConfig) {
        this.protocolConfig = protocolConfig;
        this.registryConfig = registryConfig;
    }

    void export(Object service) {
        protocol.export(service, protocolConfig);
        registry.register(registryConfig);
    }

    Object refer() {
        List<RegistryConfig> subscribe = registry.subscribe(registryConfig.getServiceName());
        RegistryConfig registryConfig = subscribe.get(0);
        return protocol.refer(registryConfig.getReferenceClass(), registryConfig);
    }


    public ProtocolConfig getProtocolConfig() {
        return protocolConfig;
    }

    public void setProtocolConfig(ProtocolConfig protocolConfig) {
        this.protocolConfig = protocolConfig;
    }

    public Registry getRegistry() {
        return registry;
    }

    public void setRegistry(Registry registry) {
        this.registry = registry;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public RegistryConfig getRegistryConfig() {
        return registryConfig;
    }

    public void setRegistryConfig(RegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
    }
}
