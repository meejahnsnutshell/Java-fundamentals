package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck { //holds deck data
    Card[] cards;
    ArrayList<Integer> usedCards;
    char[] suit = {'♠', '♦', '♥', '♣'};
    char[] faceCard = {'J', 'K', 'Q', 'A'};
    int cardIndex =0;
    int cardNumber;

    public static void populateDeck(char[] suit, char[] faceCard, int cardIndex){
        Card card[] = new Card[52];
            for (int j =0; j<5; j++) { // suit char index
                for (int cardNumber = 2; cardNumber < 11; cardNumber++) { // populate deck for cards 2-10 for ea suit
                    card[cardIndex] = new Card(suit[j], cardNumber);
                    cardIndex = +1;
                }
                for (int l = 0; l < 5; l++) { // loop thru faceCard for each suit
                    card[cardIndex] = new Card(suit[j], faceCard[l]);
                    cardIndex = +1;
                }
            }
        }

    public char[] getSuit() {
        return suit;
    }

    public char[] getFaceCard() {
        return faceCard;
    }

    public int getCardIndex() {
        return cardIndex;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardIndex(int cardIndex) {
        this.cardIndex = cardIndex;
    }
}