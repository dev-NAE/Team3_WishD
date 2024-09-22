package com.teamproject.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.teamproject.domain.*;

@Repository
public class ManagerDAO {
	
	private static final String namespace = "com.teamproject.mapper.ManagerMapper.";
	
	@Inject
	private SqlSession sqlSession;
	
//	메인 페이지에 넣을 프로젝트 목록
	public List<ProjectDTO> getMainProList() {
		
		return sqlSession.selectList(namespace+"getMainProList");
	}

//	메인 페이지에 넣을 프리랜서 목록
	public List<FreelancerDTO> getMainFreeList() {
		
		return sqlSession.selectList(namespace+"getMainFreeList");
	}
	
//	요청 프리랜서 리스트
	public List<ProjectRequestDTO> getRqfList(PageDTO pageDTO) {
		
		return sqlSession.selectList(namespace+"getRqfList", pageDTO);
	}

//	요청 프리랜서 수
	public int getRqfCount(PageDTO pageDTO) {
		
		return sqlSession.selectOne(namespace+"getRqfCount",pageDTO);
	}

//	요청 프로젝트 리스트
	public List<FreelancerRequestDTO> getRqcList(PageDTO pageDTO) {
		
		return sqlSession.selectList(namespace+"getRqcList", pageDTO);
	}

//	요청 프로젝트 수
	public int getRqcCount(PageDTO pageDTO) {
		
		return sqlSession.selectOne(namespace+"getRqcCount",pageDTO);
	}

//	요청 프리랜서 승인
	public void freelancerApprove(Long pboard_id) {
		
		sqlSession.update(namespace+"freelancerApprove", pboard_id);
	}

//	공지사항 목록
	public List<CommunityDTO> getNcoList(PageDTO pageDTO) {
		
		return sqlSession.selectList(namespace+"getNcoList", pageDTO);
	}

//	공지사항 수
	public int getNcoCount(PageDTO pageDTO) {
		
		return sqlSession.selectOne(namespace+"getNcoCount",pageDTO);
	}

//	전체 회원 목록
	public List<MemberDTO> getUserList(PageDTO pageDTO) {
		
		return sqlSession.selectList(namespace+"getUserList", pageDTO);
	}

//	전체 회원 수
	public int getUserCount(PageDTO pageDTO) {
		
		return sqlSession.selectOne(namespace+"getUserCount", pageDTO);
	}

	public List<FreelancerSkillDTO> getMainFreeSkill(Long freelancer_id) {

	  return sqlSession.selectList(namespace+"getMainFreeSkill", freelancer_id);
	}

	public List<ProjectSkillDTO> getMainProSkill(Long pboard_id) {
		
		return sqlSession.selectList(namespace+"getMainProSkill", pboard_id);
	}

	
	
}
