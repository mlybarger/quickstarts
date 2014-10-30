package org.switchyard.quickstarts.rest.binding;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;

public interface EchoService {

	public String echo(String input);
	public Response echoRequest(HttpServletRequest request);

}
