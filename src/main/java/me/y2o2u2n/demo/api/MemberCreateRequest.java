package me.y2o2u2n.demo.api;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
class MemberCreateRequest {
    @NotEmpty
    private String name;
}
