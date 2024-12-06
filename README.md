## Passos para executar o projeto

1. **Clone o repositório do projeto:**
   ```sh
   git clone <URL_DO_REPOSITORIO>
   ```

2. **Abra o projeto no IntelliJ IDEA:**
    - Vá em `File` > `Open...`
    - Selecione a pasta do projeto clonado.

3. **Configure o Docker Compose:**
    - Certifique-se de que o Docker está instalado e em execução.
    - No terminal, navegue até a pasta do projeto e execute:
      ```sh
      docker compose up -d
      ```

4. **Configure o Maven:**
    - No IntelliJ IDEA, vá em `View` > `Tool Windows` > `Maven`.
    - Clique no ícone de `Refresh` para atualizar as dependências do Maven.

5. **Execute a aplicação:**
    - Navegue até a classe `DemoApplication` (`src/main/java/com/example/demo/DemoApplication.java`).
    - Clique com o botão direito na classe e selecione `Run \`DemoApplication.main()\``.

6. **Acesse a aplicação:**
    - A aplicação estará disponível em `http://localhost:2984`.

Pronto! Agora você deve ser capaz de executar e acessar o projeto no IntelliJ IDEA.
