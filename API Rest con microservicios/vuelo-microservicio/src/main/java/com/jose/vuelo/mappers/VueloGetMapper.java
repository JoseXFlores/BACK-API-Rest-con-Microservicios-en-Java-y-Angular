package com.jose.vuelo.mappers;

import org.springframework.stereotype.Component;


import com.jose.commons.dto.PedidoDTOGet;

import com.jose.commons.models.entities.Vuelo;

@Component
public class VueloGetMapper {
	
	public PedidoDTOGet entityToDTO (Vuelo entity) {	
		if(entity ==null) return null;
		
		PedidoDTOGet dto = new PedidoDTOGet();
		dto.setId(entity.getId());
		dto.setCodigoVuelo(entity.getCodigoVuelo());

		if(entity.getAvion()!=null) {
			dto.setAvion(entity.getAvion().getNumRegistro());
			
		}
		
	     if (entity.getOrigen() != null) {
	            dto.setOrigen(entity.getOrigen().getNombre());
        }

        if (entity.getDestino() != null) {
            dto.setDestino(entity.getDestino().getNombre());
        }

	    
	   dto.setFechaSalida(entity.getFechaSalida());
	   dto.setEstatus(entity.getEstatus());

		return dto;
	}	

}
