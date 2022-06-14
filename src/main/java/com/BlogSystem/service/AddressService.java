package com.BlogSystem.service;

import com.BlogSystem.entity.AddressEntity;

public interface AddressService {
	AddressEntity findAllAddressByID(long id);

	public void addAdress();

	void deleteAddress();
}
