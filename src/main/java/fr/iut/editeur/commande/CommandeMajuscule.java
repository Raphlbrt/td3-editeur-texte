package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument{
    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }
    @Override
    public void executer(){
        if(parameters.length < 3) {
            System.err.println("Format attendu :  majuscules;debut;fin");
            return;
        }
        this.document.majuscules(Integer.valueOf(parameters[1]),Integer.valueOf(parameters[2]));
        super.executer();
    }
}
