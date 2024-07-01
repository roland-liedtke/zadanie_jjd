package me.rolandliedtke.zadanie_jjd.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Autogenerated ID", example = "1")
    private Long id;

    @Schema(description = "Name of Region", example = "North")
    private String name;

    @Schema(description = "isActive ? 1-true : 0-false", example = "1")
    private boolean isActive = true;

    @Schema(description = "ID of technician", example = "1")
    private Long technician_id;
}