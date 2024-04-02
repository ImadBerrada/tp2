# tp2
J'ai configuré un projet Spring Initializr dans IntelliJ Ultimate avec les dépendances JPA, H2, Spring Web et Lombok. Dans ce projet, j'ai créé une entité JPA appelée Product, comprenant des attributs tels que id (Long), name (String), price (double) et quantity (int). J'ai ajusté le fichier application.properties pour configurer l'unité de persistance.

En utilisant Spring Data, j'ai mis en place l'interface JPA Repository pour gérer les opérations CRUD sur les produits. J'ai ensuite testé différentes opérations de gestion des produits, telles que l'ajout, la consultation de tous les produits, la recherche d'un produit spécifique, la mise à jour et la suppression.

Pour migrer de H2 Database vers MySQL, j'ai répété ces étapes en ajustant la configuration pour utiliser MySQL comme base de données.

En élargissant mes compétences, j'ai repris l'exemple du patient et développé des classes associées utilisant des relations one-to-many, many-to-many et one-to-one.
