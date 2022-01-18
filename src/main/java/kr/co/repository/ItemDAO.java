package kr.co.repository;

import java.util.List;
import java.util.Map;

import kr.co.domain.ItemVO;
import kr.co.domain.PageTO;

public interface ItemDAO {

	void insert(ItemVO vo);

	ItemVO read(int item_no);

	ItemVO updateUI(int item_no);

	void update(ItemVO vo);

	int getAmount();

	List<ItemVO> list(PageTO<ItemVO> pt);

	void delete(int item_no);

	List<ItemVO> searchitem(Map<String, Object> map);

	List<ItemVO> getItem_size(String item_name);

	List<ItemVO> getItem_color(String item_name);

	int getAmountbycategory(String item_category);

	List<ItemVO> listbycategory(PageTO<ItemVO> pt, String item_category);

	void updatebycategory(ItemVO ivo);

	int getAmountOfAll();

	List<ItemVO> listofall(PageTO<ItemVO> pt);
	
//	List<ItemVO> searchitemAll(SearchPageTO<ItemVO> spt);
//
//	int getAmountSearchAll(SearchPageTO<ItemVO> spt);


}
