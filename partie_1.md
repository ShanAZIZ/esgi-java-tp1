#TP-1 Controle des connaissances de bases

**Membres du groupe** : AZIZ Shana, BOUBCHIR Marwan

## Contrôle de flux 

###1. Fonctionnement de if et switch

**Les conditions IF (si) :** Entrée dans la fonction uniquement lorsque la condition entre parenthèse est remplie.

**Les conditions SWITCH :** Une variable est en entrée, puis est comparée à différentes conditions (CASES) si elle remplie une de ces condition elle execute les instruction à l'intérieur de ce CASE puis ressort du SWITCH. Si aucune des comparaison n'est valide elle rentre dans le DEFAULT puis ressort immédiatement.

###2. les différents types de de boucles et leurs utilités

**Les boucles for :**

`
for (int i = 0; i < 5; i++) {
System.out.println(i);
}
`

Elles sont utiles lorsque l'on connait exactement le nombre d'itération que l'on souhaite effecteur.

**Les boucles foreach :**

`
for (type variableName : arrayName) {
// code block to be executed
}
`
Elles permettent d'iterer dans les valeurs d'une liste.

**Les boucles while :**

`
while (condition) {
// code block to be executed
}
`

Elles sont utiles lorsqu'il faut effectuer une iteration tant qu'une certaine condition n'est pas remplie.

**les boucles do while :**

`
do {
// code block to be executed
}
while (condition);
`

La boucle do while fonctionne exactement comme la boucle while, mais elle fait d'abord une première itération avant de vérifier la condition.

###3. Les effets de break, continue et return

**Le BREAK** : Sortie de la boucle.

**Le CONTINUE** : Dès qu'il est rencontré à l’intérieur d’une boucle, le contrôle passe directement à la prochaine itération de la boucle en ignorant le reste des actions dans la boucles.

**Le RETURN** : Retourne la valeur indiquée (en sortant de la boucle si il y est). 

## L'orienté objet

### 4. Qu'est ce qu'une classe et un objet

une classe : utilisé en programmation permet de créer une maquette, qui regroupe les différents attributs et actions
qui caractérise un objet dans la vie réel.
un objet en programmation est une instance d'une classe.

### 5. Philosophie de la POO

La programmation orientée objet est de créer et rassembler dans une même entité appelée objet les données et les traitements qui s'y appliquent. Les fonctions vont interagir avec l'objet, le modifier... Cette entité contiendra des données propres à cet objet, comment le construire (constructeur) et ses différentes fonctions. 

### 6. les 3 types de constructeurs 

Le constructeur sans argument :
Le constructeur par défaut fournit les valeurs par défaut à l'objet, telles que 0, null, etc., en fonction du type.

Le constructeur avec argument : 
Ce constructeur prend des valeurs en paramètres afin de les fournir aux attributs de l'objet

Le constructeur de copie : 
Ce constructeur prend en paramètre une instance d'une classe afin de les fournir à la nouvelle instance.

### 7. Création d'un objet
Pour créer un objet il nous faut un constructeur
EX : Public Voiture (int id, string couleur, string marque, string modèle...)
Pour créer cet objet : Il faut l'instancier nomDeL'objet Objet = new Constructeur(paramètres)

Des Méthodes
Des accesseur : GET afin d'accéder à des données particulières de l'objet.
Des Mutateur : SET  afin de modifier des données particulières de l'objet.
Et autres méthodes agissant sur l'objet..

### 8. Visibilitée

La visibilitée permet de définir les droits d'accès aux attributs et aux méthodes d'une classe en dehors 
de la classe : nous avons private (uniquement dans la classe), protected(dans la classe et ces enfants) et public(partout en dehors de la classe)

### 9. Pourquoi à t-on besoin de plusieurs niveau de visibilitée 

Car en dehors d'une classe on n'a souvent pas besoin de récuperer toutes les informations relatives à la classe.

### 10. Qu'est ce qu'une méthode et comment elle fonctionne

Une méthode est une fonction à l'intérieur d'une classe d'objet qui correspondent aux actions que peuvent faire l'objet.
Ayant ou non un type de retour.
Attendant ou non des paramètres.

