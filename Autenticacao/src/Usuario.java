public class Usuario{
    private String nome, user, pass;
    private boolean logado, userAtivo;


    public boolean isUserAtivo() {return userAtivo;}
    public void setUserAtivo(boolean userAtivo) {this.userAtivo = userAtivo;}
    public boolean isLogado() {return logado;}
    public void setLogado(boolean logado) {this.logado = logado;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getUser() {return user;}
    public void setUser(String user) {this.user = user;}
    public String getPass() {return pass;}
    public void setPass(String pass) {this.pass = pass;}

    public Usuario(String nome, String user, String pass) {
        this.setNome(nome);
        this.setUser(user);
        this.setPass(pass);
    }


    public void cadastrarUser(String nome, String user, String pass) {
        this.setNome(nome);
        this.setUser(user);
        this.setPass(pass);
        this.setUserAtivo(true);
    }
    public void logar(String nome, String pass){
        if (this.getUser().equals(user) && this.getPass().equals(pass)){
            if (!this.isLogado()){
                this.setLogado(true);
                System.out.println("Usuário logado!");
            }
        }else{
            System.out.println("------------------------");
            System.out.println("Usuário Inválido!");
            System.out.println("------------------------");
        }


    }
    public void desconectar(){
        if (this.isLogado()){
            this.setLogado(false);
            System.out.println("Usuário Desconectado!");
        }
    }

    public void Status(){
        System.out.println("-----------------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Usuário: " + this.getUser());
            if (this.isUserAtivo()){
                System.out.println("Usuário Ativo!");
            }
        System.out.println("-----------------------------------------");


    }

}

