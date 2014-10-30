package org.switchyard.quickstarts.jca.outbound;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;

public class CamelEchoProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		Message message = exchange.getIn();
		exchange.setPattern(ExchangePattern.InOnly);
		ExchangePattern ep = exchange.getPattern();
		exchange.setProperty("prop", "one");

	}

}
