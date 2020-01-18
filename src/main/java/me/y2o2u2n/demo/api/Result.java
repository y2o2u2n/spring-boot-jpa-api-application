package me.y2o2u2n.demo.api;

import lombok.Data;

@Data
class Result<T> {
    private T data;

    Result(T data) {
        this.data = data;
    }
}
