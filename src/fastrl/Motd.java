package fastrl;

import java.util.Random;


public class Motd {
    private static Random rng = new Random();
    private static final String[] games = {"Rogue", "Nethack", "Minecraft", "Pikmin", "Cataclysm", "Risk of Rain 2", "Earthbound", "Metroid Prime", "Geometry Dash", "Synthetik", "Osu!", "$GAME", "Warhammer", "Crab Game", "Super Mario Bros", "Terraria",};
    private static final String[] motd = {"fast is the next " + game(), "better than " + game(), "have you tried " + game() + "?",  "minutes of gameplay", "144p GAMEPLAY!", "motd of the day", "from freedom came elegance", "will there be enderdragon and wither bos muisc in 1.7?", "Y can't " + game() + " crawl", "and the then i woke up", "enjoy the simplicity", "big chungus sends his regards", "any problem?", "the oldest roguelike library in java", "\"thank god that only runs at worldgen\"", "who wnts their quote in my game", "what if the joker could beatbox", "123.1213.123 thats ur ip"};


    public static String randomMOTD() {
        System.out.println("[MOTD] Generating MOTD");
        return motd[rng.nextInt(motd.length)];
    }

    private static String game() {
        return games[rng.nextInt(games.length)];
    }
}