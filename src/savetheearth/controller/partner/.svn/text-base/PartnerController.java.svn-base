package savetheearth.controller.partner;

import java.util.HashMap;
import java.util.Map;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import savetheearth.service.PartnerService;

public class PartnerController extends Controller {

    private PartnerService service = new PartnerService();

    @Override
    public Navigation run() throws Exception {
        Map<String, Object> input = new HashMap<String, Object>();
        input.put("name", request.getParameter("name"));
        input.put("nationality", request.getParameter("nationality"));
        input.put("presentation", request.getParameter("presentation"));
        service.insert(input);
        return forward("inserted.jsp");
    }
    }
