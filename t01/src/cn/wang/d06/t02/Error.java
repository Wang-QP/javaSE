package cn.wang.d06.t02;

//Exception 编译时错误
//RuntimeException 运行时错误
public class Error extends Exception {
    public Error() {
        super();
    }

    public Error(String message) {
        super(message);
    }
}

class TimeError extends RuntimeException {
    public TimeError() {
        super();
    }

    public TimeError(String message) {
        super(message);
    }
}
