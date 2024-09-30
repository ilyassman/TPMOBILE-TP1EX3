# TP1 Exercice 3 - Application Android

Ce projet est une simple application Android conçue dans le cadre d'un TP. Il s'agit d'une application avec deux activités qui permet à l'utilisateur de répondre à quelques questions sur le pattern MVC et la syntaxe JSP, puis de voir ses réponses affichées sur une deuxième activité.

## Fonctionnalités

- **Première Activité :**  
  L'utilisateur peut sélectionner une réponse parmi quatre choix proposés pour une question sur le pattern MVC (sous forme de CheckBox).  
  Il peut également répondre à une deuxième question portant sur la syntaxe JSP en choisissant entre "Oui" et "Non" (sous forme de RadioButton).

- **Deuxième Activité :**  
  Les réponses de l'utilisateur sont affichées sur un nouvel écran lorsqu'il clique sur le bouton "Suivant".  
  L'utilisateur peut quitter l'application à tout moment en appuyant sur le bouton "Quitter".

## Structure des fichiers

### `MainActivity.java`

Cette activité présente deux questions :
1. Sélection d'une réponse pour le pattern MVC (sous forme de CheckBox).
2. Sélection entre "Oui" et "Non" pour la syntaxe JSP (sous forme de RadioButton).

Elle permet de passer à la seconde activité via un bouton, tout en transmettant les réponses sélectionnées sous forme d'extras à l'intention.

### `MainActivity2.java`

Cette activité reçoit les réponses envoyées par la `MainActivity` et les affiche sous forme de `TextView`. Un bouton "Retour" permet de quitter cette activité.

### `activity_main.xml`

Le fichier de layout de la première activité. Il contient :
- Un `ImageView` pour l'icône de l'application.
- Des `TextView` pour les titres et questions.
- Des `CheckBox` pour les réponses de la première question.
- Un `RadioGroup` avec des `RadioButton` pour les réponses de la deuxième question.
- Deux boutons : "Quitter" et "Suivant".

### `activity_main2.xml`

Le fichier de layout de la deuxième activité. Il contient :
- Des `TextView` pour afficher les réponses sélectionnées.
- Un bouton "Retour" pour revenir à la première activité ou quitter l'application.

## Instructions pour exécuter

1. Ouvrez le projet dans Android Studio.
2. Lancez l'application sur un émulateur ou un appareil physique.
3. Répondez aux questions sur l'écran principal et cliquez sur "Suivant" pour afficher vos réponses sur l'écran suivant.

## Technologies utilisées

- Langage : Java
- IDE : Android Studio
- Architecture : Pattern MVC

## Auteurs

- Mandour ilyass

## Screen Video
[![Vidéo de démonstration]](https://github.com/user-attachments/assets/71f9cfca-0bb1-4d20-a11b-1c38a87094c8)
