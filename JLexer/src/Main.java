public class Main {
    public static void main(String[] args) {
        String source = args[0];

        Lexer lex = new Lexer(source);

        Token token = lex.getToken();
        while(token.tokenKind != TokenType.EOF){
            System.out.printf("Next token is: %d Next lexeme is %s\n", token.tokenKind.valor, token.tokenText);
            token = lex.getToken();
        }
    }
}