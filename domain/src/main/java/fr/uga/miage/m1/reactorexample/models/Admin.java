/*
 * Created on 2025-01-30 ( 11:28:42 )
 * Generated by Telosys ( https://www.telosys.org/ ) version 3.3.0
 */
package domain.src.main.java.fr.uga.miage.m1.reactorexample.models;

import java.math.BigDecimal;

/**
 * Record for the entity Admin.
 *
 * @author Telosys & kakaprout for m1miage2025
 *
 */

public record Admin(
        String email,		
        String motdepass,		
        String nom,		
        String prenom,		
        BigDecimal telephone,		
        String idparking		
) {}