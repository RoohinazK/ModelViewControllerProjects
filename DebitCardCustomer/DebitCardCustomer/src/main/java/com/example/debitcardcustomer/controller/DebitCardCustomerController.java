package com.example.debitcardcustomer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.debitcardcustomer.entity.Customer;
import com.example.debitcardcustomer.entity.DebitCard;
import com.example.debitcardcustomer.service.CustomerService;
import com.example.debitcardcustomer.service.DebitCardService;

@Controller
public class DebitCardCustomerController {

	@Autowired
	private DebitCardService debitCardService;

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/")
	public String first() {
		return "menu";
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/save")
	public String saveDetails(Customer customer) {
		customerService.saveDetails(customer);
		return "menu";
	}

	@RequestMapping("/add")
	public String add(Model model) {
		List<Customer> customersList = customerService.getAllCustomers();
		model.addAttribute("customersList", customersList);
		return "add";
	}

	@PostMapping("/debit")
	public String saveDebitDetails(int customerId, DebitCard debitCard) {
		debitCardService.saveDebitDetails(customerId, debitCard);
		return "menu";
	}

	@RequestMapping("/view")
	public String view(Model model) {
		List<Customer> customerList = customerService.getAllCustomers1();
//		List<DebitCard> debitCardList = debitCardService.getAllDebitCardsList();
		model.addAttribute("customersList", customerList);
//		model.addAttribute("debitCardList", debitCardList);
		return "view";
	}

	/*
	 * @PostMapping("/getdebit") public String getDebit(int customerId, Model model)
	 * { List<DebitCard> debitCardList = debitCardService.getDebit(customerId);
	 * model.addAttribute("debitCardList", debitCardList); return "view"; }
	 */
}
