package ar.com.midinamica.pagomiscuentas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.midinamica.pagomiscuentas.repository.EntidadRepository;

@Service
public class PagoMisCuentasService {
	
	@Autowired
	private EntidadRepository entidadRepository;
	
	
	

}
