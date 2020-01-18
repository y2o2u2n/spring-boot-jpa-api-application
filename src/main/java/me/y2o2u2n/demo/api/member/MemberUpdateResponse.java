package me.y2o2u2n.demo.api.member;

import lombok.Data;

@Data
class MemberUpdateResponse {
    private Long id;
    private String name;

    MemberUpdateResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
