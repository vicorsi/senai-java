package terceiraclasse;

public class PacienteUm extends Paciente{
    private String nome;
    private String doente;
    private String tipoSanguineo;
    private String convenio;
    private int idade;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDoente(){
        return this.doente;
    }
    public void setDoente(String doente){
        this.doente = doente;
    }
    public String getTipoSanguineo(){
        return this.tipoSanguineo;
    }
    public  void setTipoSanguineo(String tipoSanguineo){
        this.tipoSanguineo = tipoSanguineo;
    }
    public String getConvenio(){
        return this.convenio;
    }
    public void setConvenio(String convenio){
        this.convenio = convenio;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        PacienteUm pacienteUm = new PacienteUm();

        pacienteUm.setNome("Eduardo");
        pacienteUm.setDoente("sim");
        pacienteUm.setTipoSanguineo("A+");
        pacienteUm.setConvenio("Unimed");
        pacienteUm.setIdade(23);

        System.out.println("Nome: " + pacienteUm.getNome());
        System.out.println("Doente: " + pacienteUm.getDoente());
        System.out.println("Tipo Sanguíneo" + pacienteUm.getTipoSanguineo());
        System.out.println("Convênio: " + pacienteUm.getConvenio());
        System.out.println("Idade: " + pacienteUm.getIdade());
    }

}
