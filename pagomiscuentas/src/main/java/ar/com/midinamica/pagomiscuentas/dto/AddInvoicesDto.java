package ar.com.midinamica.pagomiscuentas.dto;

import java.util.List;

import ar.com.midinamica.pagomiscuentas.model.DueDates;

public class AddInvoicesDto {

	private String company_id;
	
	private String customer_id;
	
	private String invoice_id;
	
	private String screen_description;
	
	private String invoice_description;
	
	private String currency;
	
	private List<DueDates> due_dates;
	
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(String invoice_id) {
		this.invoice_id = invoice_id;
	}
	public String getScreen_description() {
		return screen_description;
	}
	public void setScreen_description(String screen_description) {
		this.screen_description = screen_description;
	}
	public String getInvoice_description() {
		return invoice_description;
	}
	public void setInvoice_description(String invoice_description) {
		this.invoice_description = invoice_description;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public List<DueDates> getDue_dates() {
		return due_dates;
	}
	public void setDue_dates(List<DueDates> due_dates) {
		this.due_dates = due_dates;
	}
	
	
	
}
