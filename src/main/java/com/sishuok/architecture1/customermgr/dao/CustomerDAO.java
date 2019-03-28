package com.sishuok.architecture1.customermgr.dao;

import com.sishuok.architecture1.customermgr.vo.CustomerModel;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO {
	CustomerModel getByCustomerId(String customerId);

	void create(CustomerModel cm);

	CustomerModel getByUuid(int customerUuid);

	void update(CustomerModel cm);

	void delete(int customerUuid);
}
