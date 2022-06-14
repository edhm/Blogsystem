package com.BlogSystem.service.implement;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlogSystem.entity.AddressEntity;
import com.BlogSystem.repository.AddressRepository;
import com.BlogSystem.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressRepository aRepos;

	@Override
	public AddressEntity findAllAddressByID(long id_address) {
		Optional<AddressEntity> opt = aRepos.findById(id_address);
		if (opt.isPresent())
			return opt.get();
		else
			return null;
	}

	@Override
	public void addAdress() {
		ArrayList<AddressEntity> adre = new ArrayList<AddressEntity>();
		adre.add(new AddressEntity("Y-28_first floor", "V.E.S.", "Lima", "Perú"));
		adre.add(new AddressEntity("W-15_third floor", "V.E.S.", "Buenos Aires", "Argentina"));
		adre.add(new AddressEntity("A1-56_ten floor", "Bogota", "Bogota", "Colombia"));
		adre.add(new AddressEntity("W-15_third floor", "Madrid", "Madrid", "España"));
		adre.add(new AddressEntity("A1-56_eighth floor", "Caracasa", "Caracas", "Venezuela"));
		for (AddressEntity addressEntity : adre) {
			aRepos.saveAll(adre);
		}
	}

	@Override
	public void deleteAddress() {
		aRepos.deleteAll();

	}

}
