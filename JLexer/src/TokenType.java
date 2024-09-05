public enum TokenType{
    //Exemplo
    INT_LIT(10),
    IDENT(11),
    ASSIGN_OP(10),
    ADD_OP(11),
    SUB_OP(12),
    MULT_OP(13),
    DIV_OP(14),
    LEFT_PAREN(15),
    RIGHT_PAREN(16),
    EOF(0),

    //T1
    FOR_PAL(20),
    IF_PAL(21),
    ELSE_PAL(22),
    WHILE_PAL(23),
    DO_PAL(24),
    INT_PAL(25),
    FLOAT_PAL(26),
    SWITCH_PAL(27);

    public int valor;

    TokenType(int desc){
        this.valor = desc;
    }

    public int getValor(){
        return this.valor;
    }
}