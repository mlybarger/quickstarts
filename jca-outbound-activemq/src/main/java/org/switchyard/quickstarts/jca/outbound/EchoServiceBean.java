package org.switchyard.quickstarts.jca.outbound;

import org.switchyard.component.bean.Service;

@Service(EchoService.class)
public class EchoServiceBean implements EchoService {
	public String echo( String message ) {
		System.out.println("got:" + message);
		return message.toLowerCase();
	}
}
