import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
@Produces(MediaType.APPLICATION_JSON)
public class Resources {

    @GET
    public Response addUsers() {
        String[] users = {"Offizzer Lutz", "Black Condom", "Masked Jew", "Luftwaffe"};
        return Response.ok(users).build();
    }

    @DELETE
    public Response deleteUsers() {
        return Response.ok().build();
    }
}
