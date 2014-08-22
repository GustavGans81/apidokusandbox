package de.franke.apisandbox.api;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author  Arnold Franke - franke@synyx.de
 */
@Controller
public class SampleApiController {

    @RequestMapping(value = "foo", method = RequestMethod.GET)
    public SampleResponse getSimpleSample() {

        return new SampleResponse("foocontent");
    }
}
