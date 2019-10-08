import jdk.management.resource.internal.inst.SocketInputStreamRMHooks;

import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by sulvto on 2/14/19.
 */
public class HttpProcessor {
    public void process(Socket socket) {
        SocketInputStream input = null;
        OutputStream output = null;

        try {
            input = new SocketInputStream(socket.getInputStream(), 2048);
            output = socket.getOutputStream();
            // create Request object and parse
            Request request = new HttpRequest(input);
            request.parse();
            // create Response object
            Response response = new Response(output);
            response.setRequest(request);
            // check if this is a request for a servlet or
            // a static resource
            // a request for a servlet begins with "/servlet/"
            if (request.getUri().startsWith("/servlet/")) {
                ServletProcessor2 processor = new ServletProcessor2();
                processor.process(request, response);
            } else {
                StaticResourceProcessor processor = new StaticResourceProcessor();
                processor.process(request, response);
            }
            // Close the socket
            socket.close();
            // no shutdown for this application
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
