package savetheearth.controller.agency;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class HistoryControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/agency/history");
        HistoryController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/agency/history.jsp"));
    }
}
