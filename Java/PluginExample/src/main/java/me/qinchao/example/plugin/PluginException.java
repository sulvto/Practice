package me.qinchao.example.plugin;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: PluginException.java, v0.1 02/09/2020 17:39 sulvto Exp$$
 */
public class PluginException extends RuntimeException {

    private static final long serialVersionUID = -4697337958884065317L;

    public PluginException() {
        super();
    }

    public PluginException(String message) {
        super(message);
    }

    public PluginException(String message, Throwable cause) {
        super(message, cause);
    }

    public PluginException(Throwable cause) {
        super(cause);
    }
}
