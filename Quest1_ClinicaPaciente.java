public class Quest1_ClinicaPaciente {
    public static void main(String[] args){
        Quest1_Paciente paciente_1 = new Quest1_Paciente("LARISSA SILVA NUNES", 11, "22/08/2004", "Feminina", "Nenhuma", "Nenhum", "O+");
        System.out.println("Codigo: "+paciente_1.codigo);
        System.out.println("Nome: "+ paciente_1.nome);
        System.out.println("Data de Nascimento: "+ paciente_1.dataNascimento);
        System.out.println("Sexo: "+ paciente_1.sexo);
        System.out.println("Plano de saude: "+ paciente_1.planoSaude);
        System.out.println("Alergia: "+ paciente_1.alergia);
        System.out.println("Tipo Sanguíneo: "+ paciente_1.tipoSanguineo);
        paciente_1.nome = "MARINALVA SILVA FERNANDES";
        paciente_1.dataNascimento = "22/01/1978";
        paciente_1.sexo = "Feminino";
        paciente_1.alergia = "Pólem";
        paciente_1.planoSaude = "Avancado";
        paciente_1.tipoSanguineo = "B-";
        paciente_1.codigo = 90;
        System.out.println(" ");
        System.out.println("Codigo: "+paciente_1.codigo);
        System.out.println("Nome: "+ paciente_1.nome);
        System.out.println("Data de Nascimento: "+ paciente_1.dataNascimento);
        System.out.println("Sexo: "+ paciente_1.sexo);
        System.out.println("Plano de saude: "+ paciente_1.planoSaude);
        System.out.println("Alergia: "+ paciente_1.alergia);
        System.out.println("Tipo Sanguíneo: "+ paciente_1.tipoSanguineo);
    }
}
