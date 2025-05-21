class Card implements Comparable<Card>{ 
    private String name;
    private String suit;

    public Card(String name, String suit){
        this.name = name;
        this.suit = suit;
    }

    public String getName(){
        return this.name;
    }

    public String getSuit(){
        return this.suit;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setSuit(String newSuit){
        this.suit = newSuit;
    }

    @Override
    public String toString(){
        return this.name + " of " + this.suit;
    }

    @Override
    public int compareTo(Card card){
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};

         int indexName1 = -1;
         int indexName2 = -1;
         for (int i = 0; i < names.length; i++){
            if (names[i].equals(this.name)){
                indexName1 = i;
            }
            if (names[i].equals(card.getName())){
                indexName2 = i;
            }
         }

        int indexSuit1 = -1;
        int indexSuit2 = -1;
        for (int i = 0; i < suits.length; i++){
            if (suits[i].equals(this.suit)){
                indexSuit1 = i;
            }
            if (suits[i].equals(card.getSuit())){
                indexSuit2 = i;
            }
        }

        if (indexSuit1 != indexSuit2){
            return Integer.compare(indexSuit1, indexSuit2);
        }
        return Integer.compare(indexName1, indexName2);
    }
}