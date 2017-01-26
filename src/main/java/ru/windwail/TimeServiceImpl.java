package ru.windwail;

import javax.jws.WebService;
import java.util.Date;

@WebService(endpointInterface = "ru.windwail.TimeServer")
public class TimeServiceImpl implements TimeServer {
    public String getTimeAsString() { return new Date().toString(); }
    public long getTimeAsElapsed() { return new Date().getTime(); }
}
