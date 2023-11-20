package com.maxi.exception;


/*
*BusinessException 业务异常
* 让自定义异常类继承RuntimeException的好处是，后期在抛出这两个异常的时候，就不用在try..catch..或throws了
*自定义异常类中添加code属性的原因是为了更好的区分异常是来自哪个业务的
*/
public class BusinessException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }


}
