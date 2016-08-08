package com.railwaybank.controller;

import com.railwaybank.config.MyDAO;
import com.railwaybank.entity.Address;
import com.railwaybank.entity.Client;
import com.railwaybank.entity.IDCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	private MyDAO myDAO;

	@RequestMapping("/")
	public ModelAndView listClients() {
		return new ModelAndView("index", "railwaybank", myDAO.list());
	}

	@RequestMapping("/login")
	public String addLogInPage() {
		return "login";
	}
	@RequestMapping("/registration_id_card")
	public String addClient() {
		return "registration_id_card";
	}
	/*@RequestMapping(value = "/add_page", method = RequestMethod.POST)
	public String addPage(Model model) {
		return "add_page";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addAdv(@RequestParam(value="name") String name,
						 @RequestParam(value="age") int age,
						 HttpServletRequest request,
						 HttpServletResponse response)
	{
		try {
			Client client = new Client(name,  age);
			myDAO.add(client);
			return new ModelAndView("add_page", "MyTest", myDAO.list());
		} catch (Exception ex) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}*/

	@RequestMapping(value = "/add_id_card", method = RequestMethod.POST)
	public String addIDCard(@RequestParam(value="name") String name,
								@RequestParam(value="lastName") String lastName,
								@RequestParam(value="surName") String surName,
								@RequestParam(value="dateOfBirth") String dateOfBirth,
							   @RequestParam(value="seriesIDCard") String seriesIDCard,
							   @RequestParam(value="numberIDCard") String numberIDCard,
							   @RequestParam(value="taxNumber") String taxNumber,
							   HttpServletRequest request,
							   HttpServletResponse response)
	{
		try {
			IDCard idCard = new IDCard(name,lastName,surName,dateOfBirth,seriesIDCard,numberIDCard,taxNumber);
			myDAO.addIDCard(idCard);
			return "registration_address";
		} catch (Exception ex) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}
	@RequestMapping(value = "/add_address", method = RequestMethod.POST)
	public String addAddress(@RequestParam(value="city") String city,
							@RequestParam(value="street") String street,
							@RequestParam(value="house") String house,
							@RequestParam(value="landinePhone") String landinePhone,
							@RequestParam(value="zipCode") String zipCode,
							HttpServletRequest request,
							HttpServletResponse response)
	{
		try {
			Address address = new Address(city, street,house,landinePhone,zipCode);
			myDAO.addAddress(address);
			return "registration_client";
		} catch (Exception ex) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}

	@RequestMapping(value = "/add_client", method = RequestMethod.POST)
	public String addClient(@RequestParam(value="mobilePhone") String mobilePhone,
							 @RequestParam(value="password") String password,
							 @RequestParam(value="email") String email,
							 HttpServletRequest request,
							 HttpServletResponse response)
	{
		try {
			Client client = new Client(mobilePhone,password,email);
			myDAO.addClient(client);
			return "index";
		} catch (Exception ex) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return null;
		}
	}
}