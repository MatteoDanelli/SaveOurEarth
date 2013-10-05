package savetheearth.controller.partner;

import java.util.List;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import savetheearth.model.Partner;
import savetheearth.service.PartnerService;

public class IndexController extends Controller {
    
    private PartnerService service = new PartnerService();

    @Override
    public Navigation run() throws Exception {
        List<Partner> partnerList = service.getPartnerList();
        requestScope("partnerList", partnerList);
        return forward("index.jsp");
    }
}
