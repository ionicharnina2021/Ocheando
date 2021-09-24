package teoriaInterfacesFuncionales00;

public interface Defaulter {
    public default int doit(String letras) {
        return letras.length();
    }
}
