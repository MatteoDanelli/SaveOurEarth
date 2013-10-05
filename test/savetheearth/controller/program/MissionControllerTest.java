package savetheearth.controller.program;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class MissionControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/program/mission");
        MissionController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/program/mission.jsp"));
    }
}
