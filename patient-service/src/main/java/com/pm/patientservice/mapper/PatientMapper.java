package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO toPatientResponseDTO(Patient p){
        return new PatientResponseDTO(
                p.getId().toString(),
                p.getName(),
                p.getEmail(),
                p.getAddress(),
                p.getDateOfBirth().toString()
        );
    }
}
