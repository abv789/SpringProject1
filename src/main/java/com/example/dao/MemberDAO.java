package com.example.dao;

import com.example.dto.MemberDTO;
import com.example.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
    @Autowired
    private SqlSession sqlSession;

    public MemberDTO selectMember(final String id){

        MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);

        MemberDTO memberDto = mapper.selectMember(id);

        return  memberDto;
    }
}
