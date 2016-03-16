package me.qinchao.CXF.interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.common.util.CollectionUtils;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

import javax.xml.soap.SOAPMessage;
import java.util.List;

/**
 * Created by SULVTO on 16-3-11.
 */
public class AuthInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    public AuthInterceptor() {
        super(Phase.PRE_INVOKE);
    }

    public void handleMessage(SoapMessage soapMessage) throws Fault {
        List<Header> headers = soapMessage.getHeaders();
        if (CollectionUtils.isEmpty(headers)) {
            throw new Fault(new IllegalAccessException("认证信息不能为空"));
        }
        Header header = headers.get(0);
        Element element = (Element) header.getObject();
        System.out.println(element.toString());
    }
}
