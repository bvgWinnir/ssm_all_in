package com.sishuok.architecture1.customermgr.service;

import com.sishuok.architecture1.customermgr.vo.CustomerModel;

public interface ICustomerService {
	CustomerModel getByCustomerId(String customerId);

	void create(CustomerModel cm);

	CustomerModel getByUuid(int customerUuid);

    void update(CustomerModel cm);

    void delete(int customerUuid);

}
