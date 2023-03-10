package ir.cactus.cactusnewbankaacount.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter

public class ErrorDetails {

    private Date timestamp;

    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    private String message;
    private String details;

}
