package org.switchyard.quickstarts.jca.outbound;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("echo")
public interface CamelEchoResource {
	@POST
	public String echo( String input );

}
