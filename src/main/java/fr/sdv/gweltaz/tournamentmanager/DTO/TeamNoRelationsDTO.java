package fr.sdv.gweltaz.tournamentmanager.DTO;

import lombok.Builder;

import java.io.Serializable;

/**
 * A DTO for the {@link fr.sdv.gweltaz.tournamentmanager.model.Team} entity
 */
@Builder
public record TeamNoRelationsDTO(Long id, String name) implements Serializable
{
}