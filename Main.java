public class Main {

    public static void main(String[] args){
        System.out.println("Hero!");
        Hero hero = new Hero();
        //System.out.println(hero.toString());
        Player player = new Player();
        player.drawMonsters();

        player.showDeck();
    }

}