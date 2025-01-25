public class DbUsers implements AcoesDB{
        private String nomeDB;
        private int codigo;
        private boolean logado;
        private boolean userAtivo;

        private String listaUser;
        Usuario[] user;


    public String getNomeDB() {return nomeDB;}
    public void setNomeDB(String nomeDB) {this.nomeDB = nomeDB;}
    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}

    public DbUsers(String nomeDB, int codigo) {
        this.setNomeDB(nomeDB);
        this.setCodigo(codigo);
    }


    @Override
    public void cadastrarUser() {

    }

    @Override
    public void logar() {

    }
    @Override
    public void desconectar() {

    }

    public void status(){
    }
}
