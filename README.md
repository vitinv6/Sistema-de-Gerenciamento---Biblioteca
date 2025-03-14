# **Sistema de Gerenciamento de Biblioteca**

## Descrição
Este é um sistema de gerenciamento de biblioteca desenvolvido em Java. O sistema permite adicionar, remover e listar livros, além de gerenciar empréstimos de livros para usuários.

## Funcionalidade
- Adicionar livros à biblioteca
- Remover livros da biblioteca
- Listar livros da biblioteca
- Cadastrar usuários
- Emprestar livros para usuários
- Devolver livros emprestados

## Classes
- **`Livro`**: representa um livro com atributos como título, autor, ano de publicação e disponibilidade
- **`LivroDigital`**: representa um livro digital com atributos adicionais como URL de download
- **`LivroFisico`**: representa um livro físico com atributos adicionais como número de páginas
- **`Usuario`**: representa um usuário com atributos como nome e e-mail
- **`Biblioteca`**: representa a biblioteca com métodos para adicionar, remover e listar livros, além de gerenciar empréstimos de livros

## Métodos
- **`adicionarLivro(Livro livro)`**: adiciona um livro à biblioteca
- **`removerLivro(String titulo)`**: remove um livro da biblioteca
- **`listarLivros()`**: lista os livros da biblioteca
- **`cadastrarUsuario(Usuario usuario)`**: cadastra um usuário
- **`emprestarLivro(String titulo, Usuario usuario)`**: empresta um livro para um usuário
- **`devolverLivro(String titulo, Usuario usuario)`**: devolve um livro emprestado

## Uso 
- Crie uma instância da classe **`Biblioteca`**
- Adicione livros à biblioteca com **`adicionarLivro(Livro livro)`**
- Remova livros da biblioteca com **`removerLivro(String titulo)`**
- Liste os livros da biblioteca com **`listarLivros()`**
- Cadastre usuários com **`cadastrarUsuario(Usuario usuario)`**
- Empreste livros para usuários com **`emprestarLivro(String titulo, Usuario usuario)`**
- Devolva livros emprestados com **`devolverLivro(String titulo, Usuario usuario)`**

## Ferramenta
[![Java](https://img.shields.io/badge/Java-000000?style=for-the-badge&logo=java&logoColor=&#x2705;)](https://www.java.com/)
