public interface Fly {

    public void takeOff();

    public int ascend(int meters);

    public int descend(int meters);

    public void land();

    default void glide(){
        System.out.println("It glides into the air.");
    }

}


/*
Tu pourras décider des comportements des méthodes, mais il est obligatoire que chaque méthode affiche du texte dans la console.
Tu peux t'inspirer de l'implémentation de Swim par Penguin
Décommente l'appel des méthodes de Eagle dans Nature
Compile et teste Nature. Quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub
Partage le lien du dépôt GitHub en solution


 */