package exam.project.library.controllers;

import exam.project.library.models.Member;
import exam.project.library.services.MemberService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("api/v1/member")
@RestController
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public ResponseEntity<Member> getAllMembers() {
        return new ResponseEntity(memberService.getAllMember(), HttpStatus.OK);
    }

    @GetMapping("/{memberId}")
    public ResponseEntity getMemberById(@PathVariable("memberId") Long memberId) {
        return new ResponseEntity(memberService.getMemberById(memberId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addMember(@Valid @RequestBody Member member) {
        memberService.saveNewMember(member);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "api/v1/member/");

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{memberId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateMember(@PathVariable("memberId") Long memberId, @Valid @RequestBody Member member) {
        memberService.updateMember(memberId, member);
    }

    @DeleteMapping("/{memberId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMember(@PathVariable("memberId") Long memberId) {
        memberService.deleteMember(memberId);
    }
}
