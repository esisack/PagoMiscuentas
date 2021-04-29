package ar.com.midinamica.pagomiscuentas.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ar.com.midinamica.pagomiscuentas.dto.AddInvoicesDto;
import ar.com.midinamica.pagomiscuentas.dto.AttachInvoicesDto;
import ar.com.midinamica.pagomiscuentas.dto.PmcDto;
import ar.com.midinamica.pagomiscuentas.dto.RemoveInvoicesDto;


@Controller
@CrossOrigin(value = "*",  maxAge = 3600)
@RestController
public class PagoMisCuentasController {


	@RequestMapping(value = "/payment_notify", method = RequestMethod.POST)
	public Map<String, Object> getEstado(@RequestBody PmcDto dto) {

		Map<String, Object> map = new HashMap<String, Object>();

		if (dto.getAccess_token().contains("a4a0e9a321dd1a4b718f95f5a7e2f177")) {
			map.put("code", "00");
			map.put("message", "OK");

		} else {
			map.put("code", "400");
			map.put("message", "Error de autenticacion");
		}
		return map;
	}
	
	
	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String monitoreo(@RequestParam(name = "msg") String msg) {
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject("https://recaudaciones.prismamp.com/recaudaciones-api/v1/echo/HOLA", String.class);
		return result;
		
	}
	
	@RequestMapping(value = "/document_types", method = RequestMethod.GET)
	public List consultaDocumentos() {
		RestTemplate restTemplate = new RestTemplate();
		List result = restTemplate.getForObject("https://recaudaciones.prismamp.com/recaudaciones-api/v1/document_types", List.class);
		return result;
	}
	
	@RequestMapping(value = "/banks", method = RequestMethod.GET)
	public List consultaBancos() {
		RestTemplate restTemplate = new RestTemplate();
		List result = restTemplate.getForObject("https://recaudaciones.prismamp.com/recaudaciones-api/v1/banks", List.class);
		return result;
		
	}
	
	@RequestMapping(value = "/attach_invoice", method = RequestMethod.POST)
	public ResponseEntity<String> altaCliente(@RequestBody AttachInvoicesDto dto) {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> result = restTemplate.postForEntity("", dto, String.class);
		
		return result;
		
	}
	
	@RequestMapping(value = "/add_invoice", method = RequestMethod.POST)
	public ResponseEntity<String> altaFactura(@RequestBody AddInvoicesDto dto) {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> result = restTemplate.postForEntity("", dto, String.class);
		return result;
		
	}
	
	@RequestMapping(value = "/remove_invoice", method = RequestMethod.POST)
	public ResponseEntity<String> bajaFactura(@RequestBody RemoveInvoicesDto dto) {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> result = restTemplate.postForEntity("", dto, String.class);
		return result;
		
	}
	
	
}
