package com.dhruv.springform;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //indicates that this is a controller class
@RequestMapping("/customer") //class level mapping
public class CustomerFormController {

	/**
	 * Method to remove leading and trails whitespace
	 * @param webDataBinder
	 */
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	
	
	/**
	 * Method to display Customer Form
	 * @param model
	 * @return
	 */
	@RequestMapping("/displayForm")
	public String displayForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "CustomerRegistrationForm";
		
	}
	
	
	/**
	 * Method to process Customer Registration Form
	 * @param customer
	 * @param bindingResult
	 * @return
	 */
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "CustomerRegistrationForm";
		}
		else {
			return "CustomerConfirmation";
		}
	}
}
