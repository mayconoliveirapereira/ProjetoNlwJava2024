package com.rocketseat.certification_nlw.modules.students.userCases;

import org.springframework.stereotype.Service;

import com.rocketseat.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
    

    public boolean execute(VerifyHasCertificationDTO dto){
        
        if (dto.getEmail().equals("maycon_cpv92@hotmail.com") && dto.getTechnology().equals("JAVA")) {
            return true;
        }
        return false;
    }

}
