package main;

import javax.swing.JFrame;

public class Game extends JFrame {
    private boolean isRunning = true; // Un drapeau pour indiquer si le jeu est en cours d'exécution.
    private long desiredFPS = 60; // Le nombre d'images par seconde souhaité.
    private long desiredFrameTime = 1000000000 / desiredFPS; // La durée souhaitée d'une frame en nanosecondes.
    private GameScreen gameScreen; // Une instance de la classe GameScreen, utilisée pour afficher le jeu.

    public void run() {
        long lastTime = System.nanoTime(); // Moment du dernier rafraîchissement de la boucle de jeu.
        long currentTime;

        while (isRunning) { // Une boucle qui continue tant que le jeu est en cours d'exécution.
            currentTime = System.nanoTime(); // Moment actuel.
            long elapsedTime = currentTime - lastTime; // Calcul du temps écoulé depuis le dernier rafraîchissement.

            if (elapsedTime >= desiredFrameTime) { 
                // Mettez ici la logique du jeu (mise à jour des états, détection de collisions)
                render(); // Appel à la méthode de rendu pour afficher la scène.

                lastTime = currentTime; // Mise à jour du dernier moment de rafraîchissement.
            } else {
                // Si la boucle tourne plus vite que le temps souhaité, faites une pause d'1
                // milliseconde pour économiser des ressources.
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void render() {
        setSize(400, 400); // Définit la taille de la fenêtre du jeu.
        setVisible(true); // Rend la fenêtre visible.
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Définit la fermeture de la fenêtre lorsque l'utilisateur clique sur
                                                 // la croix.
        setLocationRelativeTo(null); // Centre la fenêtre sur l'écran.
        gameScreen = new GameScreen(); // Crée une nouvelle instance de GameScreen pour afficher le jeu.
        add(gameScreen); // Ajoute la zone de jeu (GameScreen) à la fenêtre.
        System.out.println(desiredFPS); // Affiche le nombre d'images par seconde souhaité dans la console.
    }

    public static void main(String[] args) {
        Game game = new Game(); // Crée une instance de la classe Game.
        game.run(); // Lance la boucle de jeu.
    }
}
