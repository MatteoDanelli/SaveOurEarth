package savetheearth.controller.partner;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class PartnerByNationalityController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("partnerByNationality.jsp");
    }
}
