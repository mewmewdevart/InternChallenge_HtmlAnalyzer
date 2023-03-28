<h1 align="center">
 InternChallenge : HtmlAnalyzer
</h1>

<p align="center">
	<b><i>Meu primeiro desafio tecnico em Java para a vaga de Estágio em Software Development em uma empresa de tecnologia. </i></b><br>
</p>

## Desafio 🪡
Desenvolver um programa em Java que seja capaz de obter o trecho de texto contido no nivel mais profundo da estrutura HTML  de uma [URL fornecida](http://hiring.axreng.com/internship/example1.html). <br>
- A solução deve seguir algumas regras e boas praticas de programação como; O uso exclusivo do JDK 17 e a proibição de bibliotecas externas, packages e classes nativos do JDK relacionados a manipulação HTML, XML ou DOM, boas práticas de programação e design de softweare orientados a objetos.

## Estrutura do desafio/
* ```HtmlAnalyzer.java```  Codigo fonte do desafio; manipulação de URLs, manipulações de entrada/saida, tratamento de exceções, estruturas condicionais, uso do metodo main etc...

## Instruções
### Pre-requisitos
Você precisará ter instalado em sua maquina o [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html), um editor de texto (caso queira alterar algo) com terminal integrado, acesso a internet para executar o programa e testar as URLs e uma URL valida para ser testada. <br>
❗️| Certifique-se de ter todas as ferramentas necessárias instaladas em sua máquina local antes de seguir com as proximas etapas<br>

### Instruções para rodar o programa :

**0. Baixe os arquivos**

```bash
# Clone o meu repositorio
$ git clone git@github.com:mewmewdevart/InternChallenge_HtmlAnalyzer.git

# Entre dentro da pasta do projeto
$ cd InternChallenge_Axur/
```

**1. Execute o programa**

Para compilar o programa;
 ```bash
 $ javac HtmlAnalyzer.java
 ```
Para executar o programa;
 ```bash
 #  Execute o seguinte comando no diretorio em que foi feita a compilação:
 $ java HtmlAnalyzer inserir-url-aqui
 
 #  Substituindo a URL a ser analisada pela sua própria URL:
 $ java HtmlAnalyzer http://hiring.axreng.com/internship/example1.html
  ```

Tipos de mensagens de retornos esperadas;
 ```bash
 #  Caso o html inserido seja valido:
$ This is the title.
 
  #  Caso a URL seja invalida ou não disponivel para conexão:
 $ URL connection error
 
  #  Caso o HTML esteja mal formatado:
 $ malformated HTML
 
#  Caso você insira mais de um argumento na linha de comando ou o site não tenha texto 
# 		a ser lido, nenhuma mensagem de texto será retornada.
  ```
  
## Tecnologias
- [Eclipse - IDE](https://www.eclipse.org/downloads/) | Meu ambiente de desenvolvimento integrado para escrever, ler e executar código Java com mais eficiência.
- [Java 17.0.6 2023-01-17 LTS](https://www.oracle.com/br/java/) | Versão Java usada neste desafio tecnico.

## Referencias
- [Markdown](https://www.markdownguide.org/basic-syntax/) | Documentação de como utilizar o Markdown.
- [Documentação W3Schools](https://www.w3schools.com/) | Documentação e tutoriais praticos em Java.
- [Bootcamp - Learn Java in 12hours](https://youtu.be/xk4_1vDrzzo) | Aprendizagem rapida da sintaxe de Java e os seus conceitos.
- +Forums e Blogs da internet para sanar as minhas duvidas relacionadas a linguagem (Alura, Stack Overflow e Geeks for geeks).


## 📜  Licença
Este projeto está licenciado sobre os termos de [LICENSE](https://github.com/mewmewdevart/InternChallenge_HtmlAnalyzer/blob/main/LICENSE). Acesse o link para mais informações.<br> 

<p align="center"> Desenvolvido com 💜 por Larissa Cristina Benedito </p>
