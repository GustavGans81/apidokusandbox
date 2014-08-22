package de.franke.apisandbox.api;

/**
 * @author  Arnold Franke - franke@synyx.de
 */
public class SampleResponse {

    private String foo;

    public SampleResponse(String foo) {

        this.foo = foo;
    }

    public String getFoo() {

        return foo;
    }


    public void setFoo(String foo) {

        this.foo = foo;
    }
}
