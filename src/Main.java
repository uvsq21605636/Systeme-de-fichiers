public class Main {

    public static void main(String[] args){
        File fic1 = new File("Fic1", 35);
        File fic2 = new File("Fic2", 35);
        Repository rep1 = new Repository("repertoire_number_one");
        rep1.ajoute(fic1);
        rep1.ajoute(fic2);
        System.out.println("Le nom du repertoire est : " + rep1.getName());
        System.out.println("Le fichier s'appelle : " + fic1.getName());
        System.out.println("Et sa taille est de : " + fic1.getSize());
        System.out.println("La taille du fichier est de " + rep1.getSize());
    }
}
