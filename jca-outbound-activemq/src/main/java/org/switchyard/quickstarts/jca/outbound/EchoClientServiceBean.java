package org.switchyard.quickstarts.jca.outbound;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(EchoClientService.class)
public class EchoClientServiceBean implements EchoClientService {
	
	@Inject
	@Reference
	EchoReference echoReference;

	@Override
	public String echo(String message) {
		System.out.println("EchoClientServiceBean echo() :" + message);
		String ret = echoReference.process(message);
		System.out.println("EchoClientServiceBean echo() :" + ret);
		
		return ret;
	}

}
