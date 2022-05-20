package com.revature.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ShopRepository {

	@Query(value="UPDATE shops SET s_name=?1, s_inventory_count=?2 WHERE s_id=?3", nativeQuery=true)
	public boolean update(String name, int invCount, int id);
	
}
