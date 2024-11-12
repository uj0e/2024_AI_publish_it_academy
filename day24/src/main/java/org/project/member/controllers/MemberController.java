package org.project.member.controllers;

import org.project.member.entities.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/member") // /member/login, /member/join
public class MemberController {

    @GetMapping("/join")
    public String join(Model model) {

        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setPassword("12345678");
        form.setConfirmPassword("12345678");
        form.setName("User01");

        model.addAttribute("requestJoin", form);
        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs() {
        return "redirect:/member/login";
    }

    @GetMapping("/list")
    public String list(Model model) {

        List<Member> members = IntStream.rangeClosed(1, 10)
                .mapToObj(i->{
                    Member member = new Member();
                    member.setSeq(i);
                    member.setName("<h1>User" + i + "</h1>");
                    member.setEmail("User" + i + "@test.org");
                    member.setPassword("123456789");
                    member.setRegDt(LocalDateTime.now());
                    member.setModDt(LocalDateTime.now());

                    return member;
                }).toList();

        model.addAttribute("members", members);

        return "member/list";
    }
}
