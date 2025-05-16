package net.spring.jpa_projet1.Repositories;

import net.spring.jpa_projet1.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>
{
    List<Patient> findPatientByNomContains(String nom);
    List<Patient> findPatientByMalade(boolean malade);
}

