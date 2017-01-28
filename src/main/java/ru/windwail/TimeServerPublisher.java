package ru.windwail;

import javax.xml.ws.Endpoint;


public class TimeServerPublisher {
    public static void main(String[] args) {
        // Out of the box, the Endpoint publisher handles one client request at a
        // time
        Endpoint.publish("http://127.0.0.1:9876/ts", new TimeServiceImpl());


    }
}
