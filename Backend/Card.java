public class Card{

    private int num;
    private String type;


    public Card(int num, String type){
        this.num = num;
        this.type = type;
    }

    public int getNum(){
        return num;
    }

    public String getType(){
        return type;
    }

    public boolean equals(Card other){
        if (this.num == other.num && this.type == other.type) return true;
        return false;
    }
}