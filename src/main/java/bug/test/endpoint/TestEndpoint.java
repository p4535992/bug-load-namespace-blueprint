package bug.test.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class TestEndpoint {
	
	private org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(TestEndpoint.class);

	
	@GET
	@Path("/ping")
	@Produces(MediaType.APPLICATION_JSON)
	@WebMethod(operationName = "ping")
	@WebResult(name = "Response")
	public Response ping() {
		logger.info("PING SIGNATURE SERVICE");
		return Response.ok().entity("PING SIGNATURE SERVICE").build();
	}
}
