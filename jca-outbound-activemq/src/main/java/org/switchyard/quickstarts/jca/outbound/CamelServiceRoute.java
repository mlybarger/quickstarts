package org.switchyard.quickstarts.jca.outbound;

import org.apache.camel.builder.RouteBuilder;

public class CamelServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		from("switchyard://CamelService")
			.log("Received message for 'CamelService' : ${body}")
			.to("switchyard://EchoClientService");
	}

}
