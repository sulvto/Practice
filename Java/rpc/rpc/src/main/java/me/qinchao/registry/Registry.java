package me.qinchao.registry;

import me.qinchao.api.RegistryConfig;

import java.util.List;

/**
 * Created by SULVTO on 16-4-3.
 */
public interface Registry {
    void register(RegistryConfig config);

    List<RegistryConfig> subscribe(String serviceName);
}
