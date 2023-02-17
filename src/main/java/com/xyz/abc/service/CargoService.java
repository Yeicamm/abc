package com.xyz.abc.service;

import com.xyz.abc.entity.Cargo;

import java.util.List;
import java.util.Optional;

public interface CargoService {
    public List<Cargo> findAllCargo();

    public Optional<Cargo> findCargoById(int id);

    public Cargo saveCargo(Cargo cargoNew);

    public String deleteCargo(int id);

    public String updateCargo(Cargo cargoNew);

}
