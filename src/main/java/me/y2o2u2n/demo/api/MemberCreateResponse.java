package me.y2o2u2n.demo.api;

import lombok.Data;

@Data
class MemberCreateResponse {
    private Long id;

    MemberCreateResponse(Long id) {
        this.id = id;
    }
}
