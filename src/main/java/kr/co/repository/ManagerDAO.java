package kr.co.repository;

import java.util.List;
import java.util.Map;


import kr.co.domain.ManagerVO;
import kr.co.domain.MemberVO;
import kr.co.domain.OrderVO;
import kr.co.domain.OrdersVO;


public interface ManagerDAO {

	void insert(ManagerVO vo);

	List<OrdersVO> list();

	
	 List<Object> saleRank();
	 
	 List<Object> daySale();

	 List<Object> likeRank();

	List<Object> getName();

	List<Object> keywordRank();

	ManagerVO idcheck(String manager_id);

	List<Object> managerList();

	void updateCode(ManagerVO vo);

	void managerDelete(ManagerVO vo);

	ManagerVO read(String manager_id);

	List<Object> ageRank();

	List<Object> categoryRank();

	ManagerVO managerLogin(ManagerVO vo);

	ManagerVO updateUI(String manager_id);

	void update(ManagerVO vo);

	List<Object> monthSale();

	List<MemberVO> memberList();






	


}
