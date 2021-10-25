package cesar.next.desafio.desafionextcesar.Enum;

public enum FlagProject {
    VERMELHO(1, "Vermelho"),
    AMARELO(2, "Amarelo"),
    VERDE(3, "Verde");

    private int cod;
    private String color;

    private FlagProject(int cod, String color) {
        this.cod = cod;
        this.color = color;
    }

    public int getCod() {
        return cod;
    }

    public String getColor() {
        return color;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static FlagProject toEnum(FlagProject cod) {
        if (cod == null) {
            return null;
        }
        for (FlagProject i : FlagProject.values()) {
            if (cod.equals(i.getCod())) {
                return i;
            }
        }
        throw new IllegalArgumentException("Código inválido: " + cod);
    }
}

