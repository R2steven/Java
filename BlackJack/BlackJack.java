
import java.util.*;
import java.util.Random;

public class BlackJack  {

    //class variables

    Random dealer = new Random();
    int offset=1;
    List<Integer> hand = new ArrayList<Integer>();
    List<Integer> deck = new ArrayList<Integer>();
    int deckSize;
    Integer temp;
    int index;
    //to know if we should remove cards from deck
    Boolean remove; 
    // a card deck
    List<Integer> cards = new ArrayList<Integer>();
    Integer Ace = Integer.valueOf(11);
    
    
    
    

    //constructors
    
    public BlackJack()  {
        remove = false;
        this.setcards();
        this.setDeck(1);
        deckSize=deck.size();
    }

    public BlackJack( int numOfDecks )  {
        remove = true;
        this.setcards();
        this.setDeck(numOfDecks);
        deckSize=deck.size();
    }

    


    //setters

    
    public void setcards() {
        for(int i=2; i<12 ; i++)    {
            for(int j=0; j<4 ; j++) {
                cards.add(Integer.valueOf(i));
            }
        }
    }


    public void setDeck(int numOfDecks)  {
        for (int i=0;i<numOfDecks;i++)  {
            deck.addAll(cards);
        }
    }

    public void setRemoval(Boolean removal)  {
        remove = removal;
    }

    public void setHand(List<Integer> newHand) {
        hand.addAll(newHand);
    }
    



    // getters
    

    public int[] getDeck()    {
        return this.List2int(deck);
    }

    public Boolean getRemoveStatus()  {
        return remove;
    }

    public int[] getHand()    {
        return this.List2int(hand);
    }



    //game mechanics & methods

        //return an index
    public int card(int deckSize)   {
        return dealer.nextInt(deckSize-offset);
    }

        //deal a hand
    public List<Integer> deal()   {
        System.out.println("deal");
        if (remove == false) {
            this.hit();
            this.hit();
            return hand;
        }
        if (remove == true) {
            if (deckSize<=1)  {
                System.out.println("Deck is empty");
                return null;
            }
            this.hit();
            this.hit();
            return hand;
        }
        else return null;
    }

        //get a card from deck and return card
    public Integer getAndRemove(int index)  {
        temp = deck.get(index);
        deck.remove(index);
        deckSize = deck.size();
        return temp;
    }

        //pull another card into hand
    public List<Integer> hit()  {
        System.out.println("hit");
        if (this.remove == false) {
            this.hand.add(deck.get(this.card(deckSize)));
            return hand;
        }
        if (remove == true)    {
            if (deckSize==0)  {
                System.out.println("Deck is empty");
                return null;
            }
            hand.add(this.getAndRemove(this.card(deckSize)));
            return hand;
        }
        else 
            return null;
    }

        //determine whether you are over 21
    public Boolean bust()   {
        temp = this.handTotal();
        index = hand.indexOf(Ace);
        if(temp.intValue()>21 && index==-1) {
            return true;
        }
        if(temp.intValue()>21 && index!=-1)    {
            hand.remove(index);
            hand.add(Integer.valueOf(1));
            this.bust();
        }
        
        return false;
    }


    public Integer handTotal()  {
    	temp = 0;
        for (int i=0; i<hand.size();i++)    
        {
            temp = Integer.sum(temp, hand.get(i));
        }
        System.out.println(Integer.valueOf(temp));
    	return Integer.valueOf(temp);
    }


    public int[] List2int(List<Integer> list) {
        int[] array = new int[list.size()];

        for(int i=0; i<list.size(); i++)    {
            array[i]=list.get(i).intValue();
        }
        return array;

    }

}
