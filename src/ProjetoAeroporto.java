    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Queue;
    import java.util.Stack;
    
public class ProjetoAeroporto {

    public class Projeto {
        
         class Voo {
        private String numeroVoo;
        private String origem;
        private String destino;
        private String horarioPartida;
        private String horarioChegada;
        private int capacidadeMaxima;
        private Queue<Passageiro> reservas; // Usando uma fila para reservas pendentes
    
        // Construtor
        public Voo(String numeroVoo, String origem, String destino, String horarioPartida, String horarioChegada, int capacidadeMaxima) {
            this.numeroVoo = numeroVoo;
            this.origem = origem;
            this.destino = destino;
            this.horarioPartida = horarioPartida;
            this.horarioChegada = horarioChegada;
            this.capacidadeMaxima = capacidadeMaxima;
            this.reservas = new LinkedList<>(); // Inicializa uma fila vazia
    
        }
        
            // Getters e Setters
            public String getNumeroVoo() {
                return numeroVoo;
            }
        
            public void setNumeroVoo(String numeroVoo) {
                this.numeroVoo = numeroVoo;
            }
        
            public String getOrigem() {
                return origem;
            }
        
            public void setOrigem(String origem) {
                this.origem = origem;
            }
        
            public String getDestino() {
                return destino;
            }
        
            public void setDestino(String destino) {
                this.destino = destino;
            }
        
            public String getHorarioPartida() {
                return horarioPartida;
            }
        
            public void setHorarioPartida(String horarioPartida) {
                this.horarioPartida = horarioPartida;
            }
        
            public String getHorarioChegada() {
                return horarioChegada;
            }
        
            public void setHorarioChegada(String horarioChegada) {
                this.horarioChegada = horarioChegada;
            }
        
            public int getCapacidadeMaxima() {
                return capacidadeMaxima;
            }
        
            public void setCapacidadeMaxima(int capacidadeMaxima) {
                this.capacidadeMaxima = capacidadeMaxima;
            }
        
            public Queue<Passageiro> getReservas() {
                return reservas;
            }
        
            public void setReservas(Queue<Passageiro> reservas) {
                this.reservas = reservas;
            }
    
        }
        
        class Passageiro {
            private String nome;
            private int idade;
            private String cpf;
            private String email;
        
            // Construtor
            public Passageiro(String nome, int idade, String cpf, String email) {
                this.nome = nome;
                this.idade = idade;
                this.cpf = cpf;
                this.email = email;
            }
        
            // Getters e Setters
            public String getNome() {
                return nome;
            }
        
            public void setNome(String nome) {
                this.nome = nome;
            }
        
            public int getIdade() {
                return idade;
            }
        
            public void setIdade(int idade) {
                this.idade = idade;
            }
        
            public String getCpf() {
                return cpf;
            }
        
            public void setCpf(String cpf) {
                this.cpf = cpf;
            }
        
            public String getEmail() {
                return email;
            }
        
            public void setEmail(String email) {
                this.email = email;
            }
        
        
        }
        
        class Administrador {
            private String    nome;
            private String senha;
            private String novaSenha;
            private String reservasPendentes;
            private String adicionarVoo;
            private String removerVoo;
            private String informacoesVoos;
        
            // Construtor
            public Administrador(String nome, String senha, String novaSenha, String reservasPendentes, String adicionarVoo, String removerVoo, String informacoesVoos) {
                this.nome = nome;
                this.senha = senha;
                this.novaSenha = novaSenha;
                this.reservasPendentes = reservasPendentes;
                this.adicionarVoo = adicionarVoo;
                this.removerVoo = removerVoo;
                this.informacoesVoos = informacoesVoos;
            }
        
            // Getters e Setters
            public String getNome() {
                return nome;
            }
        
            public void setNome(String nome) {
                this.nome = nome;
            }
        
            public String getSenha() {
                return senha;
            }
        
            public void setSenha(String senha) {
                this.senha = senha;
            }
        
            public String getalterarSenha() {
                return novaSenha;
            }
    
            public void setalterarSenha(String novaSenha) {
                this.senha = novaSenha;
            }
    
            public String getprocessarReservasPendentes(){
                return reservasPendentes;
            }
    
            public void setprocessarReservasPendentes(String processarReservasPendentes) {
            // Lógica para processar as reservas pendentes (confirmar, rejeitar, etc.)
                 this.reservasPendentes = reservasPendentes;
            }
    
            public String getadicionarVoo() {
                return adicionarVoo;
    
            }
    
            public void setadicionarVoo (String adicionarVoo) {
            // Lógica para adicionar um novo voo à lista de voos
                 this.adicionarVoo = adicionarVoo;
            }
    
            public String getremoverVoo() {
                return removerVoo;
            }
    
            public void setremoverVoo(String removerVoo) {
            // Lógica para remover um voo da lista de voos
                 this.removerVoo = removerVoo;
            }
            
            public String getexibirInformacoesVoos () {
                return informacoesVoos;
            }
    
            public void setexibirInformacoesVoos(String informacoesVoos) {
                this.informacoesVoos = informacoesVoos;
    }
    
    }
    
        
    class Aeroporto {
        private List<Voo> voos;
        private Queue<Voo> voosComReservasPendentes;
        private List<Passageiro> passageiros; // Lista de todos os passageiros
        private Stack<Passageiro> passageirosComCheckIn; // Pilha para passageiros com check-in
    
    
        public Aeroporto() {
            this.voos = new ArrayList<>();
            this.voosComReservasPendentes = new LinkedList<>();
            this.passageiros = new ArrayList<>();
            this.passageirosComCheckIn = new Stack<>(); // Inicializa uma pilha vazia
    
    
        public void adicionarVoo(Voo voo) {
            voos.add(voo);
        }
    
        public void adicionarPassageiro(Passageiro passageiro) {
            passageiros.add(passageiro);
        }
    
         // Método para adicionar uma reserva pendente à fila
        public void adicionarReservaPendente(Voo voo, Passageiro passageiro) {
            voo.adicionarReserva (passageiro);
            voosComReservasPendentes.offer(voo); // Adiciona à fila
        }
    
         // Método para processar as reservas pendentes
         public void processarReservasPendentes() {
            while (!voosComReservasPendentes.isEmpty()) {
                Voo voo = voosComReservasPendentes.poll();
                // Lógica para processar a reserva pendente (confirmar, rejeitar, etc.)
                System.out.println("Processando reserva pendente para o voo " + voo.getNumeroVoo());
            }
    
        public void fazerCheckIn(Passageiro passageiro) {
            passageirosComCheckIn.push(passageiro); // Adiciona o passageiro à pilha de check-in
        }
    
        public Passageiro realizarCheckOut() {
            if (!passageirosComCheckIn.isEmpty()) {
                return passageirosComCheckIn.pop(); // Remove e retorna o passageiro do topo da pilha
            }
            return null; // Pilha vazia, não há passageiro para realizar check-out
        }
        
        // Método para permitir que um passageiro reserve um voo específico
        public void reservarVoo(Passageiro passageiro, Voo voo) {
            // Verifica se o voo ainda tem capacidade para mais passageiros
            if (voo.getReservas().size() < voo.getCapacidadeMaxima()) {
                // Adiciona o passageiro à lista de reservas pendentes do voo
                voo.adicionarReserva(passageiro);
                System.out.println(passageiro.getNome() + " reservou o voo " + voo.getNumeroVoo());
            } else {
                System.out.println("Desculpe, o voo " + voo.getNumeroVoo() + " está cheio.");
            }
        }
    
        public List<Voo> getVoos() {
            return voos;
        }
    
        public void setVoos(List<Voo> voos) {
            this.voos = voos;
        }
    
        public Queue<Voo> getVoosComReservasPendentes() {
            return voosComReservasPendentes;
        }
        
        public void setVoosComReservasPendentes(Queue<Voo> voosComReservasPendentes) {
            this.voosComReservasPendentes = voosComReservasPendentes;
        }
    
        public static void main(String[] args) {
            // Aqui serão criadas as instâncias de Voo, Passageiro, Administrador e Aeroporto
    
        
        }
    
    }
    
        }
    
    
    }
    