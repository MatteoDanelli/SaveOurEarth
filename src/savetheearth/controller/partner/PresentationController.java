package savetheearth.controller.partner;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;
import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;

import savetheearth.model.Partner;

public class PresentationController extends Controller {

    @Override
    public Navigation run() throws Exception {
        

       //@Matteo: Takes the parameter from the form!! Remember!  
       Key key = asKey("key");
       Partner partner = Datastore.get(Partner.class, key);
       requestScope("partner", partner);
       return forward("presentation.jsp");
    }
}