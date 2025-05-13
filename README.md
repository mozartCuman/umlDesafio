# Desafio iPhone

Este projeto simula as funcionalidades de um iPhone, implementando um sistema com várias interfaces e classes que representam diferentes funcionalidades, como reprodutor musical, navegador de internet e aparelho telefônico.

## 📋 Funcionalidades

- **Reprodutor Musical**:
  - Selecionar música.
  - Tocar música.
  - Pausar música.

- **Navegador de Internet**:
  - Abrir página.
  - Atualizar página.
  - Fechar página.

- **Aparelho Telefônico**:
  - Fazer chamadas.
  - Receber chamadas.
  - Encerrar chamadas.

## 🛠️ Estrutura do Projeto

O projeto está organizado em pacotes para facilitar a separação de responsabilidades:

- **`principal`**: Contém a classe `Main`, que é o ponto de entrada do programa.
- **`pivot`**: Contém a classe `Pivot`, que gerencia o menu principal e as interações do usuário.
- **`sistemas`**: Contém as interfaces e a classe `Iphone`, que implementa as funcionalidades do sistema.

### Principais Arquivos

- `Main.java`: Classe principal que inicia o programa e exibe o menu inicial.
- `Pivot.java`: Gerencia o menu principal e as opções do usuário.
- `Iphone.java`: Implementa as interfaces e fornece as funcionalidades do iPhone.
- `ReprodutorMusical.java`: Interface que define os métodos para o reprodutor musical.
- `NavegadorInternet.java`: Interface que define os métodos para o navegador de internet.
- `AparelhoTelefonico.java`: Interface que define os métodos para o aparelho telefônico.

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/desafio-iphone.git
   
2. Navegue até o diretório:
   `cd desafio-iphone`
   
3. Compile o projeto:
   `javac -d bin -sourcepath src src/principal/Main.java`
   
4. Execute o programa:
   `java -cp bin principal.Main`

##🧪 Exemplos de Uso
Ao iniciar o programa, você verá o menu principal com as opções:

Pressione 0 para fechar o celular.
Pressione 1 para abrir o menu.
No menu, você pode acessar as funcionalidades do reprodutor musical, navegador de internet e aparelho telefônico.

##📂 Estrutura de Diretórios
```bash
desafio-iphone/
├── src/
│   ├── principal/
│   │   └── [Main.java]
│   ├── pivot/
│   │   └── Pivot.java
│   └── sistemas/
│       ├── ReprodutorMusical.java
│       ├── NavegadorInternet.java
│       ├── AparelhoTelefonico.java
│       └── Iphone.java
├── bin/ (gerado após a compilação)
└── README.md
```
##📝 Observações
Certifique-se de que o Java JDK está instalado em sua máquina.
O programa foi desenvolvido para fins educacionais e simula funcionalidades básicas de um iPhone.

Feito por: Mozart Cuman
