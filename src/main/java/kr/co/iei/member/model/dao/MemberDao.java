package kr.co.iei.member.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.iei.member.model.vo.Member;

@Mapper
public interface MemberDao {

	Member login(Member m);

	Member checkId(Member m);

	

}
