package com.in28minutes.rest.webservices.restfulwebservices.Assignments4;

import java.util.regex.Pattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {
	@GetMapping("/card")
	public String showPage()
	{
	    return "Enter your credit card name and Number!.....";
	    
	}
	@PostMapping("/creditcard")
	public String isCardValid(@RequestBody CreditCard card)
	{
	    if(card.getCardName().equalsIgnoreCase("enroute")&&Pattern.matches("^2(?:014|149)[0-9]{12}$", card.getCardNo()))
	        return "Valid Enroute Card";
	    else if(card.getCardName().equalsIgnoreCase("JCB")&&Pattern.matches("^{3528,3589}[0-9]{16,19}$",card.getCardNo()))
	    	return "valid card jcb";
	    else if(card.getCardName().equalsIgnoreCase("Master")&&(Pattern.matches("^5[1-5]{1}[0-9]{14}$",card.getCardNo())||Pattern.matches("^2[2-7]{1}[0-9]{14}$", card.getCardNo())))
	        return "Valid Mastercard card";
	    if(card.getCardName().equalsIgnoreCase("visa")&&Pattern.matches("^4[0-9]{18}$", card.getCardNo()))
	        return "valid visa card";
	        return card.getCardName()+"card is not valid";
	}

}
