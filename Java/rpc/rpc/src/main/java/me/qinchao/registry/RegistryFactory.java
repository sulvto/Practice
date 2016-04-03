package me.qinchao.registry;

/**
 * Created by SULVTO on 16-4-3.
 */
public class RegistryFactory {
    private static Registry registry;

    private RegistryFactory() {

    }

    private static Registry createRegistry() {
        return new ZookeeperRegistry();
    }

    public static Registry getRegistry() {
        if (registry == null) {
            registry = createRegistry();
        }
        return registry;
    }
}
