package br.com.dio.validator;

import br.com.dio.exception.ValidatorException;
import br.com.dio.model.UserModel;

public class UserValidator {

    private UserValidator() {

    }

    public static void verifyModel(UserModel model) throws ValidatorException {
        if (stringIsBlank(model.getName())) {
            throw new ValidatorException("Informe um nome valido");
        } if (model.getName().length() <= 3 ){
            throw new ValidatorException("O nome deve ser entre 3 e 30 caracteres");
        } if ((!model.getEmail().contains("@")) && (!model.getEmail().contains("."))) {
            throw new ValidatorException("Informe um e-mail valido");
        };
    }

    private static boolean stringIsBlank(String string) {
        return string == null || string.isBlank();
    }

}

