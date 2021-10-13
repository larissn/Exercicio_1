public class Quest2_ClinicaMedico {

    public static void main(String[] args) {
        Quest2_endereco endereco = new Quest2_endereco("11", "52893485", "Souza Melo", "Rua do presidente", "Centro", "Monte Santo", "BA");
        Quest2_medico medico = new Quest2_medico(3211, "Duplat Breno Souza", "Masculino", "Oftamologista", endereco);
        System.out.println(" ");
        System.out.println("---------->Medico:");
        System.out.println("Codigo: " + medico.codigo);
        System.out.println("Nome: " + medico.nome);
        System.out.println("Sexo: " + medico.sexo);
        System.out.println("Especialidade: " + medico.especialidade);
        System.out.println("---------->Endereco:");
        endereco.Endereco();
        endereco.numero = "1123";
        endereco.cep = "45291783";
        endereco.rua = "Ferdinando de Sa";
        endereco.complemento = "Sem";
        endereco.bairro = "Castro Fernando";
        endereco.cidade = "Rio de Janeiro";
        endereco.uf = "RJ";
        medico.codigo = 213123;
        medico.nome = "Larissa de Souza Thomas";
        medico.sexo = "Feminino";
        medico.especialidade = "Ginecologista";
        System.out.println(" ");
        System.out.println("---------->Medico:");
        System.out.println("Codigo: " + medico.codigo);
        System.out.println("Nome: " + medico.nome);
        System.out.println("Sexo: " + medico.sexo);
        System.out.println("Especialidade: " + medico.especialidade);
        System.out.println("---------->Endereco:");
        endereco.Endereco();
    }
}
