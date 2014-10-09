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
		return echoReference.process(message);
	}

}
