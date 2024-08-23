# Lista de Exercícios de POO Avançado

## Objetivos
Implementar conceitos de programação orientada a objetos (POO) em Java, criando uma interface `AnimalIF`, classes abstratas `AnimalAB`, `AnimalTerrestreAB`, `AnimalMarinhoAB`, `AnimalVoadorAB`, e classes concretas representando vários animais.

## Finalidade
Praticar princípios avançados de POO como abstração, encapsulamento, herança e polimorfismo, simulando comportamentos reais de animais através do código.

## Estrutura do Projeto
- **Interface**: `AnimalIF` com os métodos `comer`, `mover`, `dormir`.
- **Classe Abstrata**: `AnimalAB` implementando `AnimalIF`.
- **Classes Concretas**: `Cachorro`, `Gato`, `Elefante`, `Leão`, `Peixe`, `Pombo`.
- **Classes Abstratas para tipos específicos de animais**:
    - Animais Terrestres: `AnimalTerrestreAB`
    - Animais Marinhos: `AnimalMarinhoAB`
    - Animais Voadores: `AnimalVoadorAB`

## Requisitos
- **Java 8** ou superior
- **Maven** para gerenciamento de dependências

## Como Fazer o Programa Funcionar
1. **Clone o repositório**:
   ```bash
   git clone https://github.com/GitAquino/lista-poo-avancado.git

2. **Navegue até o diretório do projeto**:
    ```
    cd lista-poo-avancado

3. **Executando o programa:**
   ```
   1. Entre na classe "Main" dentro do package "src"
   2. Pressione SHIFT+F10 

## Estrutura de Diretórios

```
lista-poo-avancado/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── org/
│   │   │   │   ├── example/
│   │   │   │   │   ├── animais/
│   │   │   │   │   │   ├── Cachorro.java
│   │   │   │   │   │   ├── Gato.java
│   │   │   │   │   │   ├── Elefante.java
│   │   │   │   │   │   ├── Leao.java
│   │   │   │   │   │   ├── Peixe.java
│   │   │   │   │   │   └── Pombo.java
│   │   │   │   │   ├── atributos/
│   │   │   │   │   │   └── AnimalAB.java
│   │   │   │   │   ├── metodos/
│   │   │   │   │   │   └── AnimalIF.java
│   │   │   │   │   ├── tiposAnimais/ 
│   │   │   │   │   │   ├── AnimalTerrestreAB.java
│   │   │   │   │   │   ├── AnimalMarinhoAB.java
│   │   │   │   │   │   ├── AnimalVoadorAB.java
│   │   │   │   │   └── Main.java
├── .gitignore
├── pom.xml
└── README.md
```

## Licença
Este projeto está voltado para fins educacionais e processo seletivo Solutis DevTrail.