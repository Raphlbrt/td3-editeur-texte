package fr.iut.editeur.document;

/**
 * Classe représentant un document contenant un texte modifiable.
 * Elle permet d'effectuer diverses opérations sur le texte, telles que
 * l'ajout, la modification, la mise en majuscules, et l'effacement.
 */
public class Document {

    // Texte contenu dans le document.
    private String texte;

    /**
     * Constructeur par défaut de la classe Document.
     * Initialise le texte à une chaîne vide.
     */
    public Document() {
        this.texte = "";
    }

    /**
     * Retourne le texte actuel du document.
     *
     * @return le texte contenu dans le document.
     */
    public String getTexte() {
        return texte;
    }

    /**
     * Définit le texte du document.
     *
     * @param texte le nouveau texte à définir.
     */
    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * Ajoute du texte à la fin du texte actuel du document.
     *
     * @param texte le texte à ajouter.
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Retourne une représentation sous forme de chaîne du texte contenu
     * dans le document.
     *
     * @return le texte du document.
     */
    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Remplace une portion du texte par une nouvelle chaîne.
     *
     * @param debut l'indice de début de la portion à remplacer.
     * @param fin l'indice de fin de la portion à remplacer.
     * @param remplacement la chaîne qui va remplacer l'ancienne portion.
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Met en majuscules une portion du texte comprise entre deux indices.
     *
     * @param debut l'indice de début de la portion à mettre en majuscules.
     * @param fin l'indice de fin de la portion à mettre en majuscules.
     */
    public void majuscules(int debut, int fin) {
        String partie = texte.substring(debut, fin);
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin);
        partie = partie.toUpperCase();
        texte = partieGauche + partie + partieDroite;
    }

    /**
     * Efface une portion du texte entre deux indices.
     *
     * @param debut l'indice de début de la portion à effacer.
     * @param fin l'indice de fin de la portion à effacer.
     */
    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    /**
     * Vide le texte du document.
     */
    public void clear() {
        texte = "";
    }
}
