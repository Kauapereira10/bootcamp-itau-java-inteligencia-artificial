
import br.com.dio.dao.UserDAO;
import br.com.dio.enums.MenuOption;
import br.com.dio.exception.UserNotFoundException;
import br.com.dio.exception.ValidatorException;
import br.com.dio.model.UserModel;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import static br.com.dio.validator.UserValidator.verifyModel;

public class Main {

    private static final UserDAO dao = new UserDAO();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("Bem-vindo ao cadastro de usuários!");

        while (running) {
            showMenu();

            try {

                int userInput = Integer.parseInt(sc.nextLine());

                if (userInput < 1 ||
                        userInput > MenuOption.values().length) {
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
                }

                MenuOption selectedOption =
                        MenuOption.values()[userInput - 1];

                switch (selectedOption) {
                    case SAVE -> requestToSave();
                    case UPDATE -> requestToUpdate();
                    case DELETE -> requestDeleteById();
                    case FIND_BY_ID -> requestFindById();
                    case FIND_ALL -> dao.findAll();
                    case EXIT -> {
                        System.out.println("Fim do programa.");
                        running = false;
                    }
                }
            } catch (NumberFormatException | UserNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (ValidatorException e) {
                throw new RuntimeException(e);
            }

        }

        sc.close();
    }

    private static void showMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1 - Cadastro de usuários");
        System.out.println("2 - Atualizar usuário");
        System.out.println("3 - Excluir usuário");
        System.out.println("4 - Buscar por identificador");
        System.out.println("5 - Listar todos os usuários");
        System.out.println("6 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void requestDeleteById() {
        System.out.print("Informe o identificador do usuário: ");
        long userId = Long.parseLong(sc.nextLine());

        dao.delete(userId);
        System.out.println("Solicitação de exclusão concluída.");
    }

    private static UserModel requestFindById() {
        System.out.print("Informe o identificador do usuário: ");
        long userId = Long.parseLong(sc.nextLine());

        UserModel user = dao.findById(userId);

        if (user == null) {
            System.out.println("Usuário não encontrado.");
        }

        return user;
    }

    private static UserModel requestToSave() {
        System.out.print("Digite o nome do usuário: ");
        String name = sc.nextLine();

        System.out.print("Digite o e-mail do usuário: ");
        String email = sc.nextLine();

        System.out.print(
                "Digite a data de aniversário (ex.: 2000-05-20T10:00:00-03:00): "
        );
        OffsetDateTime birthday =
                OffsetDateTime.parse(sc.nextLine());

        UserModel user = new UserModel(0, name, email, birthday);

        dao.save(user);

        System.out.println("Solicitação de cadastro concluída.");
        return user;
    }

    private static UserModel requestToUpdate() throws ValidatorException {
        System.out.print("Informe o identificador do usuário: ");
        long id = Long.parseLong(sc.nextLine());

        System.out.print("Digite o nome do usuário: ");
        String name = sc.nextLine();

        System.out.print("Digite o e-mail do usuário: ");
        String email = sc.nextLine();

        System.out.print(
                "Digite a data de aniversário (ex.: 2000-05-20T10:00:00-03:00): "
        );
        OffsetDateTime birthday =
                OffsetDateTime.parse(sc.nextLine());

        UserModel user = new UserModel(id, name, email, birthday);

        verifyModel(user);

        dao.update(user);

        System.out.println("Solicitação de atualização concluída.");
        return user;
    }
}
