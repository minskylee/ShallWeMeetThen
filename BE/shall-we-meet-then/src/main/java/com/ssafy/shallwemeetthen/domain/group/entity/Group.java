package com.ssafy.shallwemeetthen.domain.group.entity;

import com.ssafy.shallwemeetthen.domain.group.entity.enumerate.AgreeState;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Group {

    @Id @GeneratedValue
    @Column(name = "gr_seq", nullable = false)
    private Long seq;

    @Column(name = "gr_name", length = 20, nullable = false)
    private String name;

    @Column(name = "gr_invitation_code", length = 50, nullable = false)
    private String invitationCode;

    @Column(name = "gr_bgm_origin_name", nullable = false)
    private String bgmOriginName;

    @Column(name = "gr_bgm_uuid_name", length = 50, nullable = false)
    private String bgmUuidName;

    @Column(name = "gr_open_date_time", nullable = false)
    private LocalDateTime openDateTime;

    @Column(name = "gr_headcount", nullable = false)
    private int headcount;

    @Column(name = "gr_agree", length = 1, nullable = false)
    private AgreeState agree;

    @Builder
    public Group(Long seq, String name, String invitationCode, String bgmOriginName, String bgmUuidName, LocalDateTime openDateTime, int headcount, AgreeState agree) {
        this.seq = seq;
        this.name = name;
        this.invitationCode = invitationCode;
        this.bgmOriginName = bgmOriginName;
        this.bgmUuidName = bgmUuidName;
        this.openDateTime = openDateTime;
        this.headcount = headcount;
        this.agree = agree;
    }
}
