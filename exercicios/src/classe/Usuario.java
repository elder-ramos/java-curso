package classe;

public class Usuario {
    String nome;
    String email;

    // Equals para comparar os valores e não memória
    public boolean equals(Object objeto) {
        // garantir que o objeto é instância de Usuário e não outro (ex.: data)
        if(objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        }else{
            return false;
        }
        
    }
}
