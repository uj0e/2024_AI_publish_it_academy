package org.project.member.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
    @Id
    private long seq;
    private String email;
    private String password;
    private String username;
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}
