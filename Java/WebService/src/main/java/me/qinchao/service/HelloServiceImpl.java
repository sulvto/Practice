package me.qinchao.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by SULVTO on 16-3-10.
 */
@WebService(targetNamespace = "hello.qinchao.me",name = "hello")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloServiceImpl {

    @WebMethod(operationName = "hello")
    public @WebResult(name = "helloName") String hello(@WebParam(name = "name") String name) {
        return "hello:" + name;
    }
}
