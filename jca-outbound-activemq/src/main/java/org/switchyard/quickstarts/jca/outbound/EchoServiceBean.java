package org.switchyard.quickstarts.jca.outbound;

import org.switchyard.component.bean.Service;

@Service(EchoService.class)
public class EchoServiceBean implements EchoService {

	public String echo(String message) {
		System.out.println("EchoServiceBean echo() :" + message);
		String ret = message.toLowerCase();
		System.out.println("EchoServiceBean echo() :" + ret);

		return ret;
	}
}
