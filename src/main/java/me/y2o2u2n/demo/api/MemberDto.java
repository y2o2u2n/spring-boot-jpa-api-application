package me.y2o2u2n.demo.api;

import lombok.Data;

@Data
class MemberDto {
    private String name;

    MemberDto(String name) {
        this.name = name;
    }
}
