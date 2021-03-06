package com.ktds.qna.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktds.qna.vo.QnaSearchVO;
import com.ktds.qna.vo.QnaVO;

@Repository
public class QnaDaoImpl extends SqlSessionDaoSupport implements QnaDao {
	
	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	
	@Override
	public int insertOneQna(QnaVO qnaVO) {
		return getSqlSession().insert("QnaDao.insertOneQna", qnaVO);
	}
	
	@Override
	public QnaVO selectOneQna(String qnaId) {
		return getSqlSession().selectOne("QnaDao.selectOneQna", qnaId);
	}
	
	@Override
	public List<QnaVO> selectAllQna(QnaSearchVO qnaSearchVO) {
		return getSqlSession().selectList("QnaDao.selectAllQna", qnaSearchVO);
	}
	
	@Override
	public int selectAllQnaCount(QnaSearchVO qnaSearchVO) {
		return getSqlSession().selectOne("QnaDao.selectAllQnaCount", qnaSearchVO);
	}
	
	@Override
	public int updateOneQna(QnaVO qnaVO) {
		return getSqlSession().update("QnaDao.updateOneQna", qnaVO);
	}

}
