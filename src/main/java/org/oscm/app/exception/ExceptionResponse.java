package org.oscm.app.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {

    public ExceptionResponse(LocalDateTime timestamp, String errorMessage) {
        this.timestamp = timestamp;
        this.errorMessage = errorMessage;
    }

    private LocalDateTime timestamp;

    private String errorMessage;


    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
