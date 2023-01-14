package ir.cactus.cactusnewbankaacount.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordeNotFoundException extends Exception {

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    private static final long serialVersion=1l;
    public RecordeNotFoundException(String message){super(message);}

}
