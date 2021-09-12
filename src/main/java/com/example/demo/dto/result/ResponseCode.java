package com.example.demo.dto.result;


import lombok.Getter;

@Getter
enum ResponseCode {
    /**
     * 成功返回的状态码
     */
    SUCCESS(200, "响应成功");

    /**
     * 状态码
     */
    private int code;
    /**
     * 返回信息
     */
    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}

