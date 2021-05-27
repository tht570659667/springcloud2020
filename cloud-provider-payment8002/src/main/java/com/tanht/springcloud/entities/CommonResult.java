package com.tanht.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:Tanht
 * @Description:
 * @Date:4:02 PM 1/4/2021
 * @version:1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code , String message){
        this(code,message,null);
    }
}
