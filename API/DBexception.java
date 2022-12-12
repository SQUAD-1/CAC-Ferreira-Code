package API;
public class DBexception extends RuntimeException {
    public DBexception(String mensagem){
        super(mensagem);
    }
}
