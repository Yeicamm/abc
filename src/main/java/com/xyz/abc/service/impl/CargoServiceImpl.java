package com.xyz.abc.service.impl;

import com.xyz.abc.entity.Cargo;
import com.xyz.abc.repository.CargoRepository;
import com.xyz.abc.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public List<Cargo> findAllCargo() {
        return cargoRepository.findAll();
    }

    @Override
    public Optional<Cargo> findCargoById(int id) {
        Optional<Cargo> cargo = cargoRepository.findById(id);
        return cargo;
    }

    @Override
    public Cargo saveCargo(Cargo cargoNew) {
        if (cargoNew!= null) {
            return cargoRepository.save(cargoNew);
        }
        return new Cargo();
    }

    @Override
    public String deleteCargo(int id) {
        if (cargoRepository.findById(id).isPresent()) {
            cargoRepository.deleteById(id);
            return "Cargo eliminado correctamente.";
        }
        return "Error! El cargo no existe";
    }

    @Override
    public String updateCargo(Cargo cargoUpdated) {
        int num = cargoUpdated.getId();
        if (cargoRepository.findById(num).isPresent()) {
            Cargo cargoToUpdate = new Cargo();
            cargoToUpdate.setId(cargoToUpdate.getId());
            cargoToUpdate.setCargo(cargoToUpdate.getCargo());

            return "Cargo modificado";
        }
        return "Error al modificar el Cargo";
    }
}
