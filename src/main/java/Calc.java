import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("calc")
@Produces(MediaType.APPLICATION_JSON)
public class Calc {
    private static ArrayList<Integer> counter = new ArrayList<Integer>();
    private static int cn = 0;
    @POST
    public Response counterUp() {
        cn++;
        counter.add(cn);
        return Response.ok().build();
    }

    @DELETE
    public Response counterDown() {
        counter.remove(counter.size() - 1);
        return Response.ok().build();
    }

    @GET
    public Response counterGet() {
        return Response.ok(counter).build();
    }
}
