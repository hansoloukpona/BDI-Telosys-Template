/*
 * Created on 2025-01-30 ( 11:28:42 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 3.3.0
 */


package entrypoint.src.main.java.fr.uga.miage.m1.entrypoint;

import fr.uga.miage.m1.reactorexample.models.Admin;
import fr.uga.miage.m1.reactorexample.models.AdminToCreate;
import fr.uga.miage.m1.reactorexample.request.AdminToCreateRequest;
import fr.uga.miage.m1.reactorexample.response.AdminDTO;
import org.mapstruct.Mapper;

/**
 * Mapper for the Admin.
 *
 * @author Telosys & kakaprout for m1miage2025
 *
 */

@Mapper
public interface AdminMapper {

    AdminDTO toAdminResponse(Admin admin);

    AdminToCreate toAdminToCreate(AdminToCreateRequest adminToCreateRequest);
}
