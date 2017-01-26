package ru.windwail;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by schukanov on 26.01.17.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeServer {

    @WebMethod
    String getTimeAsString();
    @WebMethod
    long getTimeAsElapsed();

}
