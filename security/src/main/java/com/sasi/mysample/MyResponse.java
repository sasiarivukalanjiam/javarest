package com.sasi.mysample;

import java.util.Date;

public class MyResponse {

    String _x;
    String _y;
    String _result;
    String _time;

    public MyResponse(String x, String y,  String result) {
        _x = x;
        _y = y;
        _result = result;
        _time = new Date().toString();
    }

    public String getX() {
        return _x;
    }

    public String getY() {
        return _y;
    }


    public String getResult() {
        return _result;
    }


    public String getTime() {
        return _time;
    }
    
    
}