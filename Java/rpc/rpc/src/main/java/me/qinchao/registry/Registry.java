package me.qinchao.registry;

import me.qinchao.RegistryConfig;
import me.qinchao.RegistryObject;

import java.util.List;

/**
 * Created by SULVTO on 16-4-3.
 */
public interface Registry {
    void register(RegistryConfig config);

    List<RegistryObject> subscribe();
}
