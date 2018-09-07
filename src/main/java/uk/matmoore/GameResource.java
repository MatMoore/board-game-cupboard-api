package uk.matmoore;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;

import uk.matmoore.models.Game;

@Path("games")
public class GameResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Game> getIt() {
        Game game = new Game("Terraforming Mars", "Mat");
        return Arrays.asList(game);
    }
}
