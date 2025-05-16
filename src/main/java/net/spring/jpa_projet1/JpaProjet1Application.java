package net.spring.jpa_projet1;

import net.spring.jpa_projet1.Repositories.PatientRepository;
import net.spring.jpa_projet1.entities.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class JpaProjet1Application {

    public static void main(String[] args) {
        SpringApplication.run(JpaProjet1Application.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository) {
        return args -> {

            patientRepository.save(new Patient(null, "Ahmed", new Date(), false, 80));
            patientRepository.save(new Patient(null, "Fatima", new Date(), true, 120));

            // Consulter tous les patients
            System.out.println("=== Consultation de tous les patients ===");
            patientRepository.findAll().forEach(System.out::println);

// Consulter un patient par ID
            System.out.println("=== Consultation du patient avec ID = 1 ===");
            Patient p = patientRepository.findById(1L).orElse(null);
            if (p != null) {
                System.out.println(p);
            } else {
                System.out.println("Patient avec ID 1 non trouvé.");
            }
            System.out.println();

// Chercher les patients malades
            System.out.println("=== Recherche des patients malades ===");
            var malades = patientRepository.findPatientByMalade(true);
            malades.stream().limit(3).forEach(System.out::println);

// Mise à jour
            if (p != null) {
                System.out.println("=== Mise à jour du nom du patient avec ID 1 ===");
                p.setNom("NADA");
                patientRepository.save(p);
                System.out.println("Patient mis à jour : " + p);
                System.out.println();
            } else {
                System.out.println("Impossible de mettre à jour, patient non trouvé.\n");
            }

// Suppression
            System.out.println("=== Suppression du patient avec ID = 2 ===");
            patientRepository.deleteById(2L);
            System.out.println("Liste des patients après suppression");
            patientRepository.findAll().forEach(System.out::println);


        };
    }
}