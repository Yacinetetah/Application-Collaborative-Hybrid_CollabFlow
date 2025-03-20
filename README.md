
# Application Collaborative Hybrid (Java/JEE + Node.js)

## 📝 Description
Ce projet est une application collaborative qui combine une interface d’administration en Java/JEE (JSF, EJB) et un microservice de notifications en temps réel en Node.js (Express, Socket.io). Il permet de gérer des tâches et de notifier les utilisateurs en temps réel des mises à jour.

## 🛠️ Technologies utilisées

### Backend (Java/JEE) :
- Java EE 8 (JSF, EJB, JPA)
- Base de données : MySQL
- Serveur d’application : WildFly
- Outils : Maven, Git

### Backend (Node.js) :
- Framework : Express.js
- Communication en temps réel : Socket.io
- Base de données : MongoDB (pour les logs)
- Outils : PM2, Git

### Frontend (JSF) :
- Framework : JavaServer Faces (JSF)
- Bibliothèque : PrimeFaces (optionnel)

## 🚀 Fonctionnalités

### Module d’administration (Java/JEE)
- **Gestion des tâches** : Ajout, modification et suppression de tâches.
- **Interface utilisateur** : Interface web responsive avec JSF.
- **Base de données** : Stockage des tâches dans une base MySQL.

### Microservice de notifications (Node.js)
- **Notifications en temps réel** : Utilisation de WebSocket (Socket.io) pour notifier les utilisateurs des mises à jour.
- **Logs** : Stockage des logs d’activité dans MongoDB.

## 📂 Structure du projet

```
collab-hybrid/
├── jee-admin-module/          # Module d'administration en Java/JEE
│   ├── src/
│   │   └── main/
│   │       ├── java/com/collab/
│   │       │   ├── ejb/       # Services EJB
│   │       │   ├── model/     # Entités JPA
│   │       │   └── managedbean/ # Managed Beans JSF
│   │       ├── webapp/        # Fichiers JSF (xhtml)
│   │       └── resources/     # Configuration (persistence.xml)
│   └── pom.xml               # Fichier de configuration Maven
│
├── node-notifications-api/    # Microservice Node.js
│   ├── src/
│   │   ├── server.js         # Serveur Express + Socket.io
│   │   └── services/         # Services (ex: logger.js)
│   ├── package.json          # Dépendances Node.js
│   └── .gitignore
│
└── README.md                 # Documentation du projet
```

## 🛠️ Installation

### Prérequis
- Java JDK 11+ : [Télécharger](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Node.js 16+ : [Télécharger](https://nodejs.org/)
- WildFly 26+ : [Télécharger](https://www.wildfly.org/downloads/)
- MySQL : [Télécharger](https://www.mysql.com/)
- MongoDB : [Télécharger](https://www.mongodb.com/try/download/community)

### Déploiement du module Java/JEE

#### Configurer MySQL :
1. Créez une base de données nommée `collab_db`.
2. Modifiez le fichier `jee-admin-module/src/main/resources/META-INF/persistence.xml` pour correspondre à vos paramètres MySQL.

#### Déployer sur WildFly :
```bash
cd jee-admin-module
mvn clean package wildfly:deploy
```

Accédez à l’interface : [http://localhost:8080/jee-admin-module](http://localhost:8080/jee-admin-module).

### Déploiement du microservice Node.js

#### Installer les dépendances :
```bash
cd node-notifications-api
npm install
```

#### Démarrer le serveur :
```bash
npm start
```

Le serveur écoute sur [http://localhost:3000](http://localhost:3000).

## 🧪 Tests

### Tester le module Java/JEE
- Accédez à l’interface web : [http://localhost:8080/jee-admin-module](http://localhost:8080/jee-admin-module).
- Ajoutez des tâches et vérifiez qu’elles apparaissent dans la base de données MySQL.

### Tester le microservice Node.js
- Utilisez un client WebSocket (ex: Postman) pour envoyer des messages au serveur.
- Vérifiez les logs dans MongoDB.

## 📄 Documentation
- [Java/JEE Documentation officielle](https://javaee.github.io/javaee-spec/)
- [Node.js Documentation officielle](https://nodejs.org/en/docs/)
- [Socket.io Documentation officielle](https://socket.io/docs/)




-  **Yacine TETAH**
- **Email** : yacinetetah@gmail.com

