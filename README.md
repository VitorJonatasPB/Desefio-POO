# 🧠 Desafio POO em Java
Bem-vindo ao meu projeto de estudo em Programação Orientada a Objetos (POO) com Java. Este repositório faz parte da minha jornada de evolução na DIO, onde coloquei em prática os quatro pilares fundamentais da POO:

- Abstração

- Encapsulamento

- Herança

- Polimorfismo

O objetivo foi transformar um domínio real — um Bootcamp — em um modelo orientado a objetos funcional, organizado e extensível.

## 🎯 Objetivo do Projeto
Modelar um sistema simples de Bootcamp utilizando POO, criando classes, relacionamentos e comportamentos que representem:

- Cursos

- Mentorias

- Desenvolvedores

- Bootcamps

E permitir que um Dev:

- se inscreva em um Bootcamp

- progrida nos conteúdos

- acumule XP

## 🏗️ Estrutura do Projeto
O sistema foi construído com as seguintes classes principais:

### 📘 Conteúdo (classe abstrata)
Base para todos os tipos de conteúdo do Bootcamp. Define atributos essenciais como título, descrição e método de cálculo de XP.

### 📚 Curso
Herdado de Conteúdo. Possui carga horária e cálculo próprio de XP.

### 🎤 Mentoria
Herdada de Conteúdo. Possui data e XP diferenciado.

### 👨‍💻 Dev
Representa o aluno inscrito. Gerencia conteúdos inscritos, concluídos e XP acumulado.

### 🚀 Bootcamp
Agrupa cursos, mentorias e devs inscritos. Possui duração e lista de conteúdos.

## 🔧 Tecnologias Utilizadas
Java 25+

VS Code (ou sua IDE preferida)

Paradigma de Programação Orientada a Objetos

## 🧪 Como Executar
1. Clone este repositório:
```
bash
git clone https://github.com/VitorJonatasPB/Desefio-POO.git
```

2. Abra o projeto na sua IDE.

3. Execute a classe Main.

4. Veja os devs progredindo e acumulando XP.

## 🧩 Conceitos de POO Aplicados
**Abstração**
Modelagem do domínio Bootcamp em classes representativas.

**Encapsulamento**
Atributos privados e acesso controlado via getters/setters.

**Herança**
Curso e Mentoria herdam de Conteúdo.

**Polimorfismo**
Cada tipo de conteúdo calcula XP de forma diferente.



## 🤝 Contribuições
Este projeto foi desenvolvido para fins de estudo, mas melhorias são sempre bem-vindas. Sinta-se à vontade para abrir issues, enviar PRs ou sugerir novas funcionalidades.

## 👨‍💻 Créditos
Desafio inspirado no projeto original da DIO, criado por [Camila](https://www.linkedin.com/in/cami-la/). Implementação, melhorias e personalização por Vitor Jônatas.