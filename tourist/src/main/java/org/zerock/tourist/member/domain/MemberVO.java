package org.zerock.tourist.member.domain;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;


@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {

    private String member_id;
    private String member_pw;
    private String name;
    private String phone;
    private String email1;
    private String email2;
    private String gender;
    private boolean agree;
    private Date create_date;
}
