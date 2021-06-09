import javax.swing.text.StyledEditorKit;

public class Card {


    private final String Symbol;
    private final int Value;
    private final boolean Red;


    public Card(String Symbol, int Value, boolean Red){

        this.Symbol = Symbol;
        this.Value = Value;
        this.Red = Red;
    }


    public String getCard(){
        return Value+" of "+Symbol;
    }

    public int getCardValue(){
        return Value;
    }

    public String getCardSymbol(){
        return Symbol;
    }

    public boolean isCardRed(){
        return Red;
    }


    @Override
    public String toString() {
        return Value+" of "+Symbol;
    }
}
