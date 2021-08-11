package ar.com.midinamica.pagomiscuentas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.midinamica.pagomiscuentas.model.LogPago;

@Repository
public interface LogPagoRepository extends JpaRepository<LogPago, Integer> {

}
