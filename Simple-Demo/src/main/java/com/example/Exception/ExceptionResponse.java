package com.example.Exception;

import java.time.LocalDateTime;

public class ExceptionResponse {

    //TimeStamp to indicate when the Exception happened
    private LocalDateTime timeStamp;
    //Message
    private String message ;
    //Details about the exception
    private String exceptionDetail ;

    public ExceptionResponse(LocalDateTime timeStamp, String message, String exceptionDetail) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.exceptionDetail = exceptionDetail;
    }


    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getExceptionDetail() {
        return exceptionDetail;
    }
}
