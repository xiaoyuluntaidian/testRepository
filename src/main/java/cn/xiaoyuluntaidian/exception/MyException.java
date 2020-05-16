package cn.xiaoyuluntaidian.exception;

//test
public class MyException extends Exception {
    private int code;
    private String myMesssion;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMyMesssion() {
        return myMesssion;
    }

    public void setMyMesssion(String myMesssion) {
        this.myMesssion = myMesssion;
    }

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
