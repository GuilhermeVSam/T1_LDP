public class Token {
    public String tokenText;
    public TokenType tokenKind;

    public Token(char tokenText, TokenType tokenKind){
        this.tokenText = Character.toString(tokenText);
        this.tokenKind = tokenKind;
    }
    public Token(String tokenText, TokenType tokenKind){
        this.tokenText = tokenText;
        this.tokenKind = tokenKind;
    }
}
