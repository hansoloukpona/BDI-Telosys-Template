/*
 * Created on 2025-01-30 ( 11:28:42 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 3.3.0
 */


package data.src.main.java.fr.uga.miage.m1.reactorexample.data.mapper;

import fr.uga.miage.m1.reactorexample.data.models.ParkingEntity;
import fr.uga.miage.m1.reactorexample.models.Parking;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity Parking.
 *
 * @author Telosys & kakaprout for m1miage2025
 *
 */

@Mapper
public interface ParkingEntityMapper {

    ParkingEntity toParkingEntity(Parking parking);

    Parking toParking(ParkingEntity parkingEntity);
}
