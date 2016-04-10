package me.qinchao.nio.jnio.client;

/**
 * Created by SULVTO on 16-4-9.
 */
public class TimeClient {
    public static void main(String [] args) {
        int port = 8800;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
            }
        }
        new Thread(new TimeClientHandle("127.0.0.1", port)).start();
    }
}
