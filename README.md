# Manipulation de Base de Données Cassandra avec Spring Boot

## Introduction
Ce dépôt GitHub contient les ressources nécessaires pour le travail pratique sur la manipulation d'une base de données Cassandra à l'aide de Spring Boot. L'objectif est de gérer une table de produits dans un keystore, illustrant l'intégration entre une application Spring Boot et Cassandra, une base de données NoSQL.

### Technologie

* Spring Boot
* Cassandra
* Spring Data Cassandra
* Swagger UI
## Fonctionnalités

L'application Spring Boot développée offre les fonctionnalités suivantes :
- **Ajout de produits** : Permet d'ajouter un nouveau produit dans la base de données.
- **Consultation de produits** : Permet de récupérer les détails d'un produit par son identifiant UUID.
- **Mise à jour de produits** : Permet de mettre à jour les informations d'un produit existant.
- **Suppression de produits** : Permet de supprimer un produit de la base de données.
- **Recherche de produits** : Permet de rechercher des produits en fonction d'un mot-clé dans leur nom.

## Utilisation

- **Démarrage de Cassandra avec Docker :** Assurez-vous que Docker est installé et fonctionnel.
- **Accès à l'API via Swagger UI :** Une fois l'application démarrée, accédez à Swagger UI pour interagir avec l'API :

```bash
http://localhost:8080/swagger-ui.html
```

## Architecture du Projet

- **Entité Product**: Modèle de données pour les produits.
- **ProductRepository**: Interface pour les opérations CRUD sur Cassandra.
- **ProductServices**: Service layer offrant des méthodes pour gérer les produits.
- **ProductRestAPI**: Contrôleur REST pour interagir avec l'application via HTTP.

## Configuration Technique

### Cassandra dans Docker
```yaml
version: '3'
services:
  cassandra:
    image: cassandra:latest
    container_name: cassandra
    environment:
      - CASSANDRA_DC=dc1
      - CASSANDRA_ENDPOINT_SNITCH=GossipingPropertyFileSnitch
    ports:
      - '9042:9042'
```

## Dépendances Maven

Inclure les dépendances suivantes dans votre fichier `pom.xml` pour tirer parti des fonctionnalités de Spring Boot, Cassandra et Swagger UI:

```xml
<!-- Swagger UI for API Documentation -->
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.1.0</version>
</dependency>

<!-- Cassandra Data and Web Support -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-cassandra</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- Docker Compose Integration -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-docker-compose</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
```

> **Remarque :**
> Ce projet est destiné à des fins de démonstration uniquement.\
> N'oubliez pas de configurer correctement la connexion à Cassandra avant de démarrer l'application.\
>**Contribuer** : N'hésitez pas à contribuer à ce projet en créant des pull requests!
