/*
 * Created on 2025-01-30 ( 11:28:43 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 3.3.0
 */


package rest_api.src.main.java.fr.uga.miage.m1.reactorexample.endpoint;

import fr.uga.miage.m1.reactorexample.request.ParkingToCreateRequest;
import fr.uga.miage.m1.reactorexample.response.ParkingDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
 * Endpoint for the entity Parking.
 *
 * @author Telosys & kakaprout for m1miage2025
 *
 */

@CrossOrigin
@RequestMapping("/parking")
public interface ParkingEndpoints {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Mono<ParkingDTO> addParking(@RequestBody ParkingToCreateRequest parkingToCreateRequest);

	    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    Mono<ParkingDTO> getParking(@PathVariable String id);
        
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Flux<ParkingDTO> getAllParkings();
}
