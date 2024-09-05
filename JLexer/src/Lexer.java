public class Lexer{

    public String source;
    public char curChar;
    public int curPos;

    public Lexer(String source){
        this.source = source;
        this.curChar = ' ';
        this.curPos = -1;
        this.nextChar();
    }

    public void nextChar(){
        this.curPos += 1;
        if (this.curPos >= this.source.length()){
            this.curChar = '\0';
        } else{
            this.curChar = this.source.charAt(curPos);
        }
    }

    public char peek(){
        if (this.curPos + 1 >= this.source.length()) return '\0';
        return this.source.charAt(this.curPos+1);
    }

    public Token getToken(){
        Token token = null;
        switch(this.curChar){
            case '=' -> {
                token = new Token(this.curChar, TokenType.ASSIGN_OP);
            }
            case '+' -> {
                token = new Token(this.curChar, TokenType.ADD_OP);
            }
            case '-' -> {
                token = new Token(this.curChar, TokenType.SUB_OP);
            }
            case '*' -> {
                token = new Token(this.curChar, TokenType.MULT_OP);
            }
            case '/' -> {
                token = new Token(this.curChar, TokenType.DIV_OP);
            }
            case '(' -> {
                token = new Token(this.curChar, TokenType.LEFT_PAREN);
            }
            case ')' -> {
                token = new Token(this.curChar, TokenType.RIGHT_PAREN);
            }
            case '\0' -> {
                token = new Token(this.curChar, TokenType.EOF);
            }
            case ' ' -> {
                token = new Token(this.curChar, TokenType.IDENT);
            }
            default -> {
                if (Character.isDigit(curChar)) {
                    int startPos = curPos;
                    while (Character.isDigit(this.peek())) {
                        nextChar();
                    }
                    if (this.peek() == '.') {
                        do {
                            nextChar();
                        } while (Character.isDigit(peek()));
                        String tokText = source.substring(startPos, curPos + 1);
                        token = new Token(tokText, TokenType.FLOAT_PAL);
                    } else {
                        String tokText = source.substring(startPos, curPos + 1);
                        token = new Token(tokText, TokenType.INT_PAL);
                    }
                } else if (Character.isAlphabetic(curChar)) {
                    int startPos = this.curPos;
                    while (Character.isLetterOrDigit(peek())) {
                        nextChar();
                    }
                    String tokText = source.substring(startPos, curPos + 1);
                    if (tokText.equals("switch")) {
                        token = new Token(tokText, TokenType.SWITCH_PAL);
                    } else if (tokText.equals("for")) {
                        token = new Token(tokText, TokenType.FOR_PAL);
                    } else if (tokText.equals("while")) {
                        token = new Token(tokText, TokenType.WHILE_PAL);
                    } else if (tokText.equals("do")) {
                        token = new Token(tokText, TokenType.DO_PAL);
                    } else if (tokText.equals("if")) {
                        token = new Token(tokText, TokenType.IF_PAL);
                    } else if (tokText.equals("else")) {
                        token = new Token(tokText, TokenType.ELSE_PAL);
                    } else {
                        token = new Token(tokText, TokenType.IDENT);
                    }
                }
            }
        }
        this.nextChar();
        return token;
    }
}