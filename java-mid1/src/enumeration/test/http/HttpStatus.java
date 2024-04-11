package enumeration.test.http;

public enum HttpStatus {

    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404,  "Not Found"),
    INTERNAL_SERVER_ERROR(500,  "Internal Server Error");

    public final int code;
    public final String message;

    HttpStatus (int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code){
        if(String.valueOf(code).startsWith("2")){
            return HttpStatus.OK;
        } else if (code == 400) {
            return HttpStatus.BAD_REQUEST;
        } else if (code == 404) {
            return HttpStatus.NOT_FOUND;
        } else if (code == 500){
            return HttpStatus.INTERNAL_SERVER_ERROR;
        } else {
            return null;
        }
    }

    public boolean isSuccess(){
        return getCode() == 200;
    }
}
