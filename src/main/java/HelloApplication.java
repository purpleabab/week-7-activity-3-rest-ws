import javax.ws.rs.core.Application;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by karen.rahmeier on 10/13/2016.
 */
//Defines the base URI for all resource URIs.
@ApplicationPath("/")
public class HelloApplication extends Application {


    //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(HelloWorld.class);
        return h;
    }
}

