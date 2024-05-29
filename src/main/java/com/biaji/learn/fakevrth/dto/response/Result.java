package com.biaji.learn.fakevrth.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 结果返回类
 */
@Getter
@Setter
public class Result<T> {

    /**
     * 返回码
     */
    private int code;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 构造方法
     * @param code
     */
    public Result(int code){
        this.code = code;
    }

}
