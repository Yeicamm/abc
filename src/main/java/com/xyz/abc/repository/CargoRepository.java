package com.xyz.abc.repository;

import com.xyz.abc.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {

    Void save(Optional<Cargo> cargoToUpdate);

}
