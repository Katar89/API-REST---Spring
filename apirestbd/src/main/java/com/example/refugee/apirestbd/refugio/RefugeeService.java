package com.example.refugee.apirestbd.refugio;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RefugeeService {

    private final RefugeeRepository refugeeRepo; // Creacion

    public void createRefugee(Refugee refugee)
    {
        refugeeRepo.save(refugee);
    }
// --------------------------------------------------------------
    public Refugee searchRefugeeID(Integer id) // Busqueda
    {
        return refugeeRepo.findById(id).orElse(null);
    }
// --------------------------------------------------------------
    public void updateRefugee(Integer id, Refugee UpdRefugee)  // Actualizacion
    {
        Refugee ActRefugee = refugeeRepo.findById(id).orElse(null);

            if (ActRefugee != null) 
            {
                ActRefugee.setDireccion(UpdRefugee.getDireccion());

                ActRefugee.setNombre(UpdRefugee.getNombre());

                ActRefugee.setPoblacionActual(UpdRefugee.getPoblacionActual());

                ActRefugee.setPoblacionMaxima(UpdRefugee.getPoblacionMaxima());

                refugeeRepo.save(ActRefugee);
            }
    }
// ---------------------------------------------------------------
    
    public void deleteRefugeeID(Integer id)  // Borrado
    {
        refugeeRepo.deleteById(id);
    } 
    

}
