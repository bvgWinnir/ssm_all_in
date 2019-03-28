package com.sishuok.architecture1.customermgr.service;

import com.sishuok.architecture1.customermgr.dao.CustomerDAO;
import com.sishuok.architecture1.customermgr.vo.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerDAO dao;


    public CustomerModel getByCustomerId(String customerId) {
        return dao.getByCustomerId(customerId);
    }

    @Override
    public void create(CustomerModel cm) {
        dao.create(cm);
    }

    @Override
    public CustomerModel getByUuid(int customerUuid) {
        return dao.getByUuid(customerUuid);
    }

    @Override
    public void update(CustomerModel cm) {
        dao.update(cm);
    }

    @Override
    public void delete(int customerUuid) {
        dao.delete(customerUuid);
    }

}
