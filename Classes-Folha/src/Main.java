public class Main {
    public static void main(String[] args) {
        //CLASSE IMPRESSORA
        Impressora impressora1 = new Impressora();
        Impressora impressora2 = new Impressora();

        System.out.println("-- IMPRESSORAS --");

        impressora1.setModelo("Epson 123");
        System.out.println("Modelo da impressora 1: " + impressora1.getModelo());
        impressora1.imprimir();

        System.out.println();

        impressora2.setModelo("HP LaserJet");
        System.out.println("Modelo da impressora 2: " + impressora2.getModelo());
        impressora2.armazenarFolhas();

        System.out.println();

        //CLASSE VENDA
        Venda venda1 = new Venda();
        Venda venda2 = new Venda();

        System.out.println("-- VENDAS --");
        venda1.setValorTotal(1000.0);
        System.out.println("Valor total da venda 1: R$" + venda1.getValorTotal());
        venda1.realizarVenda();

        System.out.println();

        venda2.setProduto("Celular");
        System.out.println("Produto da venda 2: " + venda2.getProduto());
        venda2.ofertamento();

        System.out.println();
        //CLASSE PLANETA
        Planeta planeta1 = new Planeta();
        Planeta planeta2 = new Planeta();

        System.out.println("-- PLANETAS --");
        planeta1.setNome("Terra");
        planeta1.setDiametro(12742.0);

        System.out.println("Nome do planeta 1: " + planeta1.getNome());
        planeta1.rotacionar();

        System.out.println();

        planeta2.setNome("Marte");
        planeta2.setDiametro(6779.0);

        System.out.println("Nome do planeta 2: " + planeta2.getNome());
        planeta2.habitar();

        System.out.println();
        //CLASSE SERPENTE
        Serpente serpente1 = new Serpente();
        Serpente serpente2 = new Serpente();

        System.out.println("-- SERPENTES --");
        serpente1.setCor("Verde");
        serpente1.setTamanho(1.5);

        System.out.println("Cor da serpente 1: " + serpente1.getCor());
        serpente1.trocarPele();

        System.out.println();

        serpente2.setCor("Marrom");
        serpente2.setTamanho(2.0);

        System.out.println("Tamanho da serpente 2: " + serpente2.getTamanho());
        serpente2.rastejar();

        System.out.println();
        //CLASSE COMPRADOR
        Comprador comprador1 = new Comprador();
        Comprador comprador2 = new Comprador();

        System.out.println("-- COMPRADORES --");
        comprador1.setNome("João");
        comprador1.setEndereco("Rua Alves Ruiz, 189");

        System.out.println("Nome do comprador 1: " + comprador1.getNome());
        comprador1.comprar();

        System.out.println();

        comprador2.setNome("Maria");
        comprador2.setEndereco("Avenida Branco Liz, 4036");

        System.out.println("Endereço do comprador 2: " + comprador2.getEndereco());
        comprador2.realizarCompra();

        System.out.println();
        //CLASSE DEMOLIDOR
        Demolidor demolidor1 = new Demolidor();
        Demolidor demolidor2 = new Demolidor();

        System.out.println("-- DEMOLIDOR --");
        demolidor1.setNome("Matt Murdock");
        //demolidor1.setAdvogado("Alfred");

        System.out.println("Nome do Demolidor 1: " + demolidor1.getNome());
        demolidor1.lutar();

        System.out.println();

        demolidor2.setAdvogado("Advogado");

        System.out.println("Profissão do Demolidor 2: " + demolidor2.getAdvogado());
        demolidor2.detectarPerigo();

        System.out.println();
        //CLASSE ESTRELA
        Estrela estrela1 = new Estrela();
        Estrela estrela2 = new Estrela();

        System.out.println("-- ESTRELAS --");
        estrela1.setTipo("Anã Amarela");
        estrela1.setTemperatura(5778.0);

        System.out.println("Tipo da estrela 1: " + estrela1.getTipo());
        estrela1.emitirLuz();

        System.out.println();

        estrela2.setTipo("Supergigante Vermelha");
        estrela2.setTemperatura(3500.0);

        System.out.println("Temperatura da estrela 2: " + estrela2.getTemperatura());
        estrela2.emitirLuz();

        System.out.println();
        //CLASSE ONIBUS
        Onibus onibus1 = new Onibus();
        Onibus onibus2 = new Onibus();

        System.out.println("-- ÔNIBUS --");
        onibus1.setNumeroIdentificacao(1001);
        onibus1.setCapacidadePassageiros(40);

        System.out.println("Número de identificação do ônibus 1: " + onibus1.getNumeroIdentificacao());
        onibus1.transportarPassageiros();

        System.out.println();

        onibus2.setNumeroIdentificacao(1002);
        onibus2.setCapacidadePassageiros(30);

        System.out.println("Capacidade de passageiros do ônibus 2: " + onibus2.getCapacidadePassageiros());
        onibus2.transportarPassageiros();

        System.out.println();
        //CLASSE EXPORTAÇÃO
        Exportacao exportacao1 = new Exportacao();
        Exportacao exportacao2 = new Exportacao();

        System.out.println("-- EXPORTAÇÕES --");
        exportacao1.setTransacao("Venda de Eletrônicos");
        exportacao1.setProduto("Smartphones");

        System.out.println("Transação da exportação 1: " + exportacao1.getTransacao());
        exportacao1.exportar();

        System.out.println();

        exportacao2.setTransacao("Venda de Roupas");
        exportacao2.setProduto("Vestidos");

        System.out.println("Produto da exportação 2: " + exportacao2.getProduto());
        exportacao2.exportar();

        System.out.println();
        //CLASSE DENTISTA
        Dentista dentista1 = new Dentista();
        Dentista dentista2 = new Dentista();

        System.out.println("-- DENTISTAS --");
        dentista1.setNome("Dr. Silva");
        dentista1.setEspecializacao("Odontologia Geral");

        System.out.println("Nome do dentista 1: " + dentista1.getNome());
        dentista1.atenderPaciente();

        System.out.println();

        dentista2.setNome("Dra. Santos");
        dentista2.setEspecializacao("Ortodontia");

        System.out.println("Especialização do dentista 2: " + dentista2.getEspecializacao());
        dentista2.agendarConsulta();
    }
}