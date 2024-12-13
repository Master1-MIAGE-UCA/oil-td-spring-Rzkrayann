# Projet "Dice" - Gestion de lancés de dés avec Spring Boot

## Objectif
L'objectif de ce projet est de créer une API REST permettant de gérer des lancés de dés.

## Technologies
- **Framework principal** : Spring Boot
- **Base de données** : H2
- **Documentation API** : Swagger (bonus)
- **Simplification de code** : Lombok (bonus)

## Fonctionnalités
- **Lancer un dé** : Permet de lancer un dé à 6 faces et de récupérer le résultat.
- **Lancer plusieurs dés** : Permet de lancer plusieurs dés à 6 faces et de récupérer les résultats.
- **Historique des lancés** : Permet de consulter l'historique des lancés de dés effectués.

## Routes
- **GET** "localhost:8081/rollDice" : Permet de lancer un dé à 6 faces et de récupérer le résultat.
- **GET** "localhost:8081/rollDices/{nbDices}" : Permet de lancer plusieurs dés à 6 faces et de récupérer les résultats.
- **GET** "localhost:8081/diceLogs" : Permet de consulter l'historique des lancés de dés effectués.
- **GET** "localhost:8081/swagger-ui/index.html" : Permet de consulter la documentation de l'API.

## Installation
- Cloner le projet "https://github.com/Master1-MIAGE-UCA/oil-td-spring-Rzkrayann.git"
- Utilisez la commande à la racine du projet `.\mvnw spring-boot:run` pour lancer le projet.
- Accédez aux adresses mentionnées ci-dessus pour utiliser les différentes fonctionnalités.

## Bonus
- **Documentation API** : Swagger
- **Simplification de code** : Lombok
