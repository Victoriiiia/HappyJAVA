package lesson13.enums.ex3;

import java.util.Random;

public class CardGenerator {
    //Написать программу генератор случайной карты, которая будет иметь
    // статический метод  printRandomCard() вывода в консоль случайно сгенерированной карты.
    //Создать два отдельных  Enum CardsTypes, CardValues.
    //CardsTypes может быть четырех видов ♦, ♠, ♣, ♥.
    // CardValues : SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    //Создать класс Card, который в параметры конструктора будет принимать аргументы типа CardsTypes, CardValues

    public enum CardValues{
        SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JACK("JACK"), QUEEN("QUEEN"), KING("KING"), ACE("ACE");
        public String value;

        CardValues(String value) {
            this.value = value;
        }
    }
    public enum CardTypes{
        HEART("♥"), DIAMOND("♦"), CLUB("♣"), SPADE("♠");
        public String value;

        CardTypes(String value) {
            this.value = value;
        }
    }

    public static CardValues getRandomCardValue() {
        CardValues[] cardValues = CardValues.values();
        return cardValues[new Random().nextInt(cardValues.length)];
    }

    public static CardTypes getRandomCardType() {
        CardTypes[] cardTypes = CardTypes.values();
        return cardTypes[new Random().nextInt(cardTypes.length)];
    }

    public static class Card{
        public CardTypes cardTypes;
        public CardValues cardValues;

        public Card(CardTypes cardTypes, CardValues cardValues) {
            this.cardTypes = cardTypes;
            this.cardValues = cardValues;
        }

        @Override
        public String toString() {
            return cardValues.value + cardTypes.value;
        }
    }

    public static Card cardGenerator(){
        return new Card(getRandomCardType(), getRandomCardValue());
    }

    public static void printRandomCard(){
        System.out.println(cardGenerator());
    }

    public static void main(String[] args) {
        printRandomCard();
    }

}
