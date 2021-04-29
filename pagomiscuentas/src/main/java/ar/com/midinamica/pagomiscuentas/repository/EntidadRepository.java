package ar.com.midinamica.pagomiscuentas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.midinamica.pagomiscuentas.model.Entidad;

@Repository
public interface EntidadRepository extends JpaRepository<Entidad, Integer> {

}
