import java.util.Arrays;


public class BlackJack_game {

    public static void main(String[] args)  {
        BlackJack gameR = new BlackJack();

        System.out.println("GAME W REMOVAL");
        gameR.deal();
        System.out.println("Deck:"+Arrays.toString(gameR.getDeck())+
                "\n"+"hand:"+Arrays.toString(gameR.getHand()));
        gameR.hit();
        System.out.println("New Hand:"+Arrays.toString(gameR.getHand()));
        System.out.println("Did you bust?"+gameR.bust());

    }



}
