# TP2 - Application Spring Boot avec JPA : Gestion des Patients

## 📌 Objectif du TP

L’objectif de ce TP est de mettre en place une application Java utilisant **Spring Boot** avec **Spring Data JPA** pour la gestion des entités `Patient`, en se connectant à une base de données **h2** et **MySQL**. Ce projet permet de manipuler les concepts de la persistance avec JPA, la configuration d'une source de données, ainsi que l'utilisation d'un dépôt (`Repository`) pour effectuer les opérations CRUD.

---

## 🛠️ Technologies et outils utilisés

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Maven
- IntelliJ IDEA
- Git & GitHub

---

## 🗃️ Structure du projet



---

## 🧩 Description des composants

### 1. `Patient.java`
Une entité JPA représentant un patient, avec des champs comme :
- `id` (Long, auto-généré)
- `nom` (String)
- `dateNaissance` (Date)
- `malade` (boolean)
- `score` (int)

### 2. `PatientRepository.java`
Interface qui hérite de `JpaRepository<Patient, Long>` pour permettre l'accès aux données sans implémentation manuelle des méthodes CRUD.

### 3. `JpaProjet1Application.java`
Classe principale contenant le `main` et une méthode d'initialisation (`CommandLineRunner`) pour insérer des patients dans la base de données au démarrage.

### 4. `application.properties`
Fichier de configuration de la base de données h2 puis  MySQL et des paramètres JPA.


---

## 🧪 Exécution du projet

1. Lancer MySQL localement et s’assurer que l’utilisateur `root` a un mot de passe vide (ou à adapter selon votre configuration).
2. pour h2 ma bd est "patient_db"avec le port  `8085` :
   ```properties

   
Voici une capture de l'exécution h2 :

![Capture d'écran](![Capture d'écran 2025-05-16 230205](https://github.com/user-attachments/assets/72b02a68-0293-4a16-a569-26ed1aa0afec)

)

Voici une capture de l'exécution MY SQL  :
![Capture d'écran](![Capture d’écran 2025-05-16 230707](https://github.com/user-attachments/assets/a571d2ec-1acf-46f7-b686-2bc21fabca50)

)

---
## 🔍 Fonctionnalités

    - Ajouter des patients
    - Consulter tous les patients
    - Consulter un patient
    - Chercher des patients
    - Mettre à jour un patient 
    - supprimer un patient
Voici une capture de l'exécution dans la console :
![Capture d'écran](![Capture d’écran 2025-05-16 231142](https://github.com/user-attachments/assets/46680d12-d325-4c8c-88d9-229155fb39c1)

---
## 📌 Conclusion
Ce TP m’a permis de me familiariser avec :

L’utilisation de JPA avec Spring Boot.

La création d'entités et de dépôts.

La configuration d’un projet Spring Boot pour interagir avec une base MySQL.

Les bonnes pratiques de structuration d’un projet Java Spring.

---
# 📎 Auteur
Nom : Fatima Ezzahra Azzaz
Master SDIA -FS meknès

