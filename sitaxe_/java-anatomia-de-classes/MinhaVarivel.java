 public static void main(String[] args) {

        String primeiroNome = "Luis";
        String segundoNome = "Henrique";

        String nomeCompleto = NomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
 
    }

public static String NomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
}

//tipo NomeBemDefinido =  Atribuição (opcional em aguns casos)

//tipo de metodos TipoRetorno NomeObjetivoNoInfinitivo paremtro(s)