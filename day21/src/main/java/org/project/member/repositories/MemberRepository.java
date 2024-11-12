package org.project.member.repositories;
import org.project.member.entities.Member;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends ListCrudRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
    List<Member> findByUsernameContainingOrderBySeqDesc(String keyword);
}