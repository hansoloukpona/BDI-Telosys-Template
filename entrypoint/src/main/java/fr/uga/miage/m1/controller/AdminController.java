/*
 * Created on 2025-01-30 ( 11:28:42 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 3.3.0
 */
package entrypoint.src.main.java.fr.uga.miage.m1.controller;



import fr.uga.miage.m1.reactorexample.api.AdminServicePort;
import fr.uga.miage.m1.reactorexample.endpoint.AdminEndpoints;
import fr.uga.miage.m1.entrypoint.mapper.AdminMapper;
import fr.uga.miage.m1.reactorexample.request.AdminToCreateRequest;
import fr.uga.miage.m1.reactorexample.response.AdminDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

/**
 * RestController for the entity Admin.
 *
 * @author Telosys & kakaprout for m1miage2025
 *
 */

@RestController
@RequiredArgsConstructor
public class AdminController implements AdminEndpoints {
    private final AdminServicePort adminServicePort;
    private final AdminMapper adminMapper;

    @Override
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Mono<AdminDTO> addAdmin(@RequestBody AdminToCreateRequest adminToCreateRequest) {
        return adminServicePort.create(adminMapper.toAdminToCreate(adminToCreateRequest))
                .map(adminMapper::toAdminResponse);
    }

	    @Override
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Mono<AdminDTO> getAdmin(@PathVariable String id) {
        return adminServicePort.getAdmin(id)
                .map(adminMapper::toAdminResponse);
    }
    
    @Override
    @GetMapping("/all")
    public Flux<AdminDTO> getAllAdmins() {
        return adminServicePort.getAll()
                .map(adminMapper::toAdminResponse);
    }
}
