package Prototype;

public class Principal {
    public static void main(String[] args) {
        Violão VClassico = new Violão("Violão Clássico", "----");
        VClassico.setCaracteristicas(" O violão clássico é um modelo acústico e funciona com seis cordas");
        VClassico.exibirInfo();
        VClassico.separador();

        try {
            Violão VFolk = VClassico.clone();
            VFolk.setNome("Violão Folk");
            VFolk.setCaracteristicas(
                    "Com o corpo maior e mais “acinturado”, os violões do tipo folk também são bastante populares entre os músicos.");
            VFolk.exibirInfo();
            VFolk.separador();

            Violão VFlet = VFolk.clone();
            VFlet.setNome("Violão Flet");
            VFlet.setCaracteristicas("A palavra flat, do inglês, pode significar “plano” ou “liso”.");
            VFlet.exibirInfo();
            VFlet.separador();

            Violão VJumbo = VFlet.clone();
            VJumbo.setNome("Violão Jumbo");
            VJumbo.setCaracteristicas(" O violão jumbo ficou famoso nas mãos de Elvis Presley");
            VJumbo.exibirInfo();
            VJumbo.separador();

            Violão V7Cordas = VJumbo.clone();
            V7Cordas.setNome("Violão 7 Cordas");
            V7Cordas.setCaracteristicas("Conhecido como o violão brasileiro.");
            V7Cordas.exibirInfo();
            V7Cordas.separador();

            Violão V12Cordas = V7Cordas.clone();
            V12Cordas.setNome("Violão 12 Cordas");
            V12Cordas.setCaracteristicas(
                    "Outro tipo de violão que também não apresenta diferenças na estrutura, o violão 12 cordas traz o dobro de cordas do que o clássico");
            V12Cordas.exibirInfo();
            V12Cordas.separador();

            Violão V0 = V12Cordas.clone();
            V0.setNome("Violão Zero");
            V0.setCaracteristicas("Esse é o Violão Zero!");
            V0.exibirInfo();
            V0.separador();

            Violão V00 = V0.clone();
            V00.setNome("Violão Duplo Zero");
            V00.setCaracteristicas("Esse é o Violão Duplo Zero!");
            V00.exibirInfo();
            V00.separador();

            Violão V000 = V00.clone();
            V000.setNome("Violão Triplo Zero");
            V000.setCaracteristicas("Esse é o violão Triplo Zero!");
            V000.exibirInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}