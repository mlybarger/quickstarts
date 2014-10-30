package org.switchyard.quickstarts.rest.binding;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.switchyard.component.bean.Service;

@Service(EchoService.class)
public class EchoServiceBean implements EchoService {
	
	public String echo( String input ) {
		System.out.println("echo() - start");
		return input.toLowerCase();
	}
	
	@Override
	public Response echoRequest( @Context HttpServletRequest request ){
		System.out.println("echoRequest() - start");
		String body = "";
		try {
			body = this.getRequestBodyAsString(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.status(Response.Status.OK).entity(body.toLowerCase()).build();
	}
	
	public String getRequestBodyAsString( HttpServletRequest request ) throws Exception{
	    StringBuilder buffer = new StringBuilder();
	    BufferedReader reader = request.getReader();
	    String line;
	    while ((line = reader.readLine()) != null) {
	        buffer.append(line);
	    }
	    return buffer.toString();		
	}

}
