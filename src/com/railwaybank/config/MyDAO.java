package com.railwaybank.config;

import com.railwaybank.entity.Address;
import com.railwaybank.entity.Client;
import com.railwaybank.entity.IDCard;

import java.util.List;

public interface MyDAO {
	List<Client> list();
   	void addIDCard(IDCard idCard);
   	void addAddress(Address address);
   	void addClient(Client client);

}
