package com.ssafy.shallwemeetthen.domain.groupmember.repository;

import com.ssafy.shallwemeetthen.domain.group.entity.Groups;
import com.ssafy.shallwemeetthen.domain.groupmember.entity.GroupMember;
import com.ssafy.shallwemeetthen.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroupMemberRepository extends JpaRepository<GroupMember, Long> {

    @Query("select gm from GroupMember gm where gm.group.seq=:groupSeq and gm.member.seq=:memberSeq")
    Optional<GroupMember> findByGroupAndMember(@Param("groupSeq") Long groupSeq, @Param("memberSeq") Long memberSeq);


}
