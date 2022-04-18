package com.example.mapper;

import com.example.dto.MemberDTO;

public interface MemberMapper {

    MemberDTO selectMember(String id);
}
