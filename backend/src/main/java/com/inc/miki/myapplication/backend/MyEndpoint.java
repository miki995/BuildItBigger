package com.inc.miki.myapplication.backend;

import com.inc.miki.JokeTeller;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.miki.inc.com",
                ownerName = "backend.myapplication.miki.in.com"
        )
)
public class MyEndpoint {


    @ApiMethod(name = "sayHi")
    public MyBean sayHi() {
        MyBean response = new MyBean();
        response.setData(JokeTeller.getJoke());
        return response;
    }
}
