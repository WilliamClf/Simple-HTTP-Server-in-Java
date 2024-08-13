# Simple HTTP Server in Java

## Este projeto é um exemplo simples de servidor HTTP em Java, criado utilizando a classe HttpServer disponível no JDK. O servidor é configurado para escutar na porta 8080 e responde a requisições feitas ao caminho /helloWorld. Quando uma requisição é recebida nesse caminho, o servidor retorna a mensagem "Hello World, teste 123 William".

## A estrutura do projeto é composta por duas classes principais:

## Main: Essa classe é responsável por iniciar o servidor. Ela cria uma instância do HttpServer, associa o caminho /helloWorld a um manipulador (helloWorldHandler) e inicia o servidor na porta 8080. O servidor também pode ser configurado para usar múltiplos threads, mas, por padrão, ele usa apenas um.

## helloWorldHandler: Esta classe implementa a interface HttpHandler e define como o servidor responde às requisições feitas ao caminho /helloWorld. Quando uma requisição é recebida, o método handle é chamado, e ele envia a resposta com a mensagem "Hello World, teste 123 William".
