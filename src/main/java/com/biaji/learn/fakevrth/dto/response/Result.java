package com.biaji.learn.fakevrth.dto.response;

import lombok.Getter;
import lombok.Setter;

/**
 * 结果返回类
 */
@Getter
@Setter
public class Result {

    /**
     * 返回码
     */
    private int code;

    /**
     * 构造方法
     * @param code
     */
    public Result(int code){
        this.code = code;
    }

}
