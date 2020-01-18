package me.y2o2u2n.demo.api.common;

import lombok.Data;

@Data
public class Result<T> {
    private T data;

    public Result(T data) {
        this.data = data;
    }
}
