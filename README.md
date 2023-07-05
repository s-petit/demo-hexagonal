# demo-hexagonal

Le but de ce projet est de montrer comment mettre en place une architecture hexagonale simple en Java.

Le projet consiste en la gestion d'une agence de location de voitures avec 2 cas métier :

- Calcul du stock de voitures
- Récupération du détail de l´agence pour affichage de son adresse (ou exposer l'adresse a l'exterieur via une API)


Une branche `ntier` est disponible pour montrer comment mettre en place une architecture n-tiers avec une couche de service et une couche de persistence.

Les fonctionnalités proposées sont exactement les memes que la partie hexagonale presentée dans la branche `main`.

Cela permet de comparer le code et de voir les avantages et inconvénients de chaque approche.

L'architecture n-tiers est plus simple à mettre en place mais elle est moins flexible et plus difficile à tester.
Elle pose des problèmes de maintenabilité et fragilise le domaine.

Les cas suivants démontrent ces problèmes :

**1. Migrer d'une base de données SQL vers une base MongoDB. Appeler le `CarRentalMongoRepository` au lieu du `CarRentalSqlRepository`.**

Le domaine ne compile plus. Il doit adapter sa signature pour pouvoir appeler le repository.
De plus, si les données changent il doit adapter son algotithme métier et augmente les risques de regression.

Coté application, il faut également changer la signature de l'API. Etant donné que la partie SQL n'est plus disponible et qu'on a à la place l'objet Mongo qui a une structure différente, par défaut on casse la rétrocompatibilité de l'API.
On a donc du travail a faire pour rétablir la compatibilité de l'API.

**2. Garder le repository SQL mais ajouter un nouveau champ et modifier le type d'un champ existant.**

Le domaine doit également adapter son algotithme métier et augmente les risques de regression.
Coté application, on risque aussi de casser la rétrocompatibilité de l'API.
De plus, on ajoute des champs supplémentaires et on risque d'exposer des informations superflues.

**3. L'application peut appeler le repository directement sans passer par le domaine.**

C'est une mauvaise pratique, et on augmente le couplage avec l'infrastructure.

----------------

Si on essaie de faire la meme chose avec l'architecture hexagonale (branche `main`), on se rend compte qu'il n'y a aucun impact coté domaine et coté application.

L'infrastructure doit s'adapter au domaine et pas l'inverse.

Concernant le point 3, la branche main est couplée au module infrastructure pour les besoins de la démo, donc en l'état on peut appeler le repository directement depuis l'application.

Ce problème est facilement réglable en configurant un outil d'injection de dépendance (ex: Spring) puis de mettre l'infrastructure en `runtime` et le domaine en `compile` dans le `build.gradle.kts` de l'application.
Un exemple est disponible dans la branche `perfect-hexagonal`


Cependant, l'architecture hexagonale est plus complexe à mettre en place et nécessite une bonne connaissance de l'architecture.
Le code est plus verbeux et contient plus de classes. De plus, il faut gérer le mapping entre les objets du domaine et les objets de l'infrastructure, ce qui est fastidieux et demande de la maintenance.

