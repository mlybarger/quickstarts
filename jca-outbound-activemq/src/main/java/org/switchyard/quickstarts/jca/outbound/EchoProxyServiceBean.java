package org.switchyard.quickstarts.jca.outbound;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(EchoProxyService.class)
public class EchoProxyServiceBean implements EchoProxyService {
	
	@Inject
	@Reference
	EchoProxyServiceReference echoProxyServiceReference;
	
	public String proxy(String message){
		String ret = echoProxyServiceReference.process(message);
		System.out.println("EchoProxyServiceBean proxy() - ret:" + ret);
		return ret;
	}

}
