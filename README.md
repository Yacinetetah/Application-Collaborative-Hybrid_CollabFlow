Application Collaborative Hybrid (Java/JEE + Node.js)

📝 Description

Ce projet est une application collaborative qui combine une interface d’administration en Java/JEE (JSF, EJB) et un microservice de notifications en temps réel en Node.js (Express, Socket.io). Il permet de gérer des tâches et de notifier les utilisateurs en temps réel des mises à jour.

🛠️ Technologies utilisées

Backend (Java/JEE) :

Java EE 8 (JSF, EJB, JPA)

Base de données : MySQL

Serveur d’application : WildFly

Outils : Maven, Git

Backend (Node.js) :

Framework : Express.js

Communication en temps réel : Socket.io

Base de données : MongoDB (pour les logs)

Outils : PM2, Git

Frontend (JSF) :

Framework : JavaServer Faces (JSF)

Bibliothèque : PrimeFaces (optionnel)

🚀 Fonctionnalités

Module d’administration (Java/JEE)

Gestion des tâches : Ajout, modification et suppression de tâches.

Interface utilisateur : Interface web responsive avec JSF.

Base de données : Stockage des tâches dans une base MySQL.

Microservice de notifications (Node.js)

Notifications en temps réel : Utilisation de WebSocket (Socket.io) pour notifier les utilisateurs des mises à jour.

Logs : Stockage des logs d’activité dans MongoDB.

📂 Structure du projet

🛠️ Installation

Prérequis

Java JDK 11+ : Télécharger

Node.js 16+ : Télécharger

WildFly 26+ : Télécharger

MySQL : Télécharger

MongoDB : Télécharger

Déploiement du module Java/JEE

Configurer MySQL :

Créez une base de données nommée collab_db.

Modifiez le fichier jee-admin-module/src/main/resources/META-INF/persistence.xml pour correspondre à vos paramètres MySQL.

Déployer sur WildFly :

Accédez à l’interface : http://localhost:8080/jee-admin-module.

Déploiement du microservice Node.js

Installer les dépendances :

Démarrer le serveur :

Le serveur écoute sur http://localhost:3000.

🧪 Tests

Tester le module Java/JEE

Accédez à l’interface web : http://localhost:8080/jee-admin-module.

Ajoutez des tâches et vérifiez qu’elles apparaissent dans la base de données MySQL.

Tester le microservice Node.js

Utilisez un client WebSocket (ex: Postman) pour envoyer des messages au serveur.

Vérifiez les logs dans MongoDB.

📄 Documentation

Java/JEE Documentation officielle

Node.js Documentation officielle

Socket.io Documentation officielle

🤝 Contribution

Forkez le projet.

Créez une branche : git checkout -b feature/nouvelle-fonctionnalite.

Committez vos changements : git commit -m 'Ajouter une fonctionnalité'.

Poussez la branche : git push origin feature/nouvelle-fonctionnalite.

Ouvrez une Pull Request.

📜 Licence

Ce projet est sous licence MIT. Voir le fichier LICENSE pour plus de détails.

🙏 Remerciements

Merci à Inetum pour l’inspiration.

Merci à la communauté open source pour les outils utilisés.

📧 Contact

Nom : Yacin

Email : yacin@example.com

GitHub : VotreProfilGitHub

