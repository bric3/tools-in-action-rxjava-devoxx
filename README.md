# Tool's In Action RxJava

## Sandbox

Contient le code qui manipulera le webservice cf la classe ```Main```

## Server

Contient un serveur web qui est volontairement *lent*

Pour d�marrer le server, il suffit de lancer le main de la class ```Server```

Il est possible de tester les webservices via [Swagger](http://localhost:8080/sdoc.jsp).

## Construction du projet

Il est possible d'executer le script ```build.sh``` (ou ```build.bat```) qui va executer la commande suivante :

    mvn install dependency:go-offline
    
Cette commande permet de builder le projet et surtout de r�cup�rer les d�pendences pour pouvoir d�marrer le tout sans connexion Internet.