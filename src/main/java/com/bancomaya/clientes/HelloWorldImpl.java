
package com.bancomaya.clientes;

import javax.jws.WebService;

@WebService(endpointInterface = "com.bancomaya.clientes.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello Holi" + text + "crayoli";
    }
}

