package com.example.demo.dto.result;

import cn.hutool.core.date.DateTime;
import com.example.demo.utils.hutoolUtils;
import lombok.Data;


@Data
public class resultData<T> {

    private int    code;
    private String msg;
    private T      data;
    private DateTime time;

    public resultData(){
        this.time = hutoolUtils.getTime();
    }

    public static <T> resultData<T> success(T data) {
        resultData<T> resultData = new resultData<>();
        resultData.setCode(ResponseCode.SUCCESS.getCode());
        resultData.setMsg(ResponseCode.SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }


}
