/*
 * Created on 2025-01-30 ( 11:28:42 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 3.3.0
 */
package domain.src.main.java.fr.uga.miage.m1.reactorexample.api;



import fr.uga.miage.m1.reactorexample.models.Admin;
import fr.uga.miage.m1.reactorexample.models.AdminToCreate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

/**
 * Service port for entity "Admin" <br>
 * 
 * This service provides all the necessary operations required by the REST controller <br>
 * 
 * @author Telosys & kakaprout for m1miage2025
 *
 */


public interface AdminServicePort {
    Mono<Admin> create(AdminToCreate adminToCreate);
    
	    Mono<Admin> getAdmin(String email);
    
    Flux<Admin> getAll();
}
