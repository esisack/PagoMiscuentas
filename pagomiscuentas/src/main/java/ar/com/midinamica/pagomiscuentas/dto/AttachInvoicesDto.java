package ar.com.midinamica.pagomiscuentas.dto;

public class AttachInvoicesDto {
	
	private String company_id;
	
	private String bank_id;	
	
	private String document_type_id;
	
	private String document_type_description;
	
	private String document_number;
	
	private String customer_id;

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public String getBank_id() {
		return bank_id;
	}

	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}

	public String getDocument_type_id() {
		return document_type_id;
	}

	public void setDocument_type_id(String document_type_id) {
		this.document_type_id = document_type_id;
	}

	public String getDocument_type_description() {
		return document_type_description;
	}

	public void setDocument_type_description(String document_type_description) {
		this.document_type_description = document_type_description;
	}

	public String getDocument_number() {
		return document_number;
	}

	public void setDocument_number(String document_number) {
		this.document_number = document_number;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}	
		
}
