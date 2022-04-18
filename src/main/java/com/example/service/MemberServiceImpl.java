package com.example.service;

import com.example.dao.MemberDAO;
import com.example.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDAO memberDao;

    public MemberDTO selectMember(String id) {

        MemberDTO memberDto = memberDao.selectMember(id);

        return memberDto;
    }
}
