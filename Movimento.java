package jogodavelha;

public class Movimento {

    private int i;
    private int j;

    public Movimento(String ms) throws ExcecaoMovimentoInvalido{
        try {
            String[] pedacos = ms.split(",");
            this.i = Integer.parseInt(pedacos[0]);
            this.j = Integer.parseInt(pedacos[1]);
        } catch (Exception e) {
            throw new ExcecaoMovimentoInvalido("A jogada é inválida! Digite o número da linha e coluna separados por vírgula. Exemplo: 0,2");
        }
    }

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @return the j
     */
    public int getJ() {
        return j;
    }

    /**
     * @param j the j to set
     */
    public void setJ(int j) {
        this.j = j;
    }

}
