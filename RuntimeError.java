package lox.lox;

public class RuntimeError implements RuntimeException{

    final Token token;

    RuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}
