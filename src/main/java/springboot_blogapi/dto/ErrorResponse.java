package springboot_blogapi.dto;
import java.time.Instant;

public class ErrorResponse {

    private Instant timestamp;
    private String error;
    private String message;
    private String path;

    public ErrorResponse(String error, String message, String path) {
        this.timestamp = Instant.now();
        this.error = error;
        this.message = message;
        this.path = path;
    }

    public Instant getTimestamp() {        return timestamp;    }
    public String getError() {        return error;    }
    public String getMessage() {        return message;    }
    public String getPath() {        return path;    }

}
