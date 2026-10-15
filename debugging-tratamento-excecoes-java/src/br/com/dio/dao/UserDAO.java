package br.com.dio.dao;

import br.com.dio.exception.EmptyStorageException;
import br.com.dio.exception.UserNotFoundException;
import br.com.dio.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private long nextId = 1L;
    private List<UserModel> models = new ArrayList<>();

    public UserModel save(UserModel model) {
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel update(UserModel model) {
        var toUpdate = findById(model.getId());
        models.remove(toUpdate);
        models.add(model);
        return model;
    }

    public void delete(long id) {
        var toDelete = findById(id);
        models.remove(toDelete);
    }

    public List<UserModel> findAll() {
        List<UserModel> result = null;

        try {
            verifyStorage();
            result = models;
        }catch (EmptyStorageException e) {
            e.printStackTrace();
            result = models;
        }
        return models;
    }

    public UserModel findById(long id) {
        verifyStorage();
        return models.stream()
                .filter(model -> model.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("Não existe usuário pario com o id " + id + " cadastrado"));
    }

    private void verifyStorage() {
        if (models.isEmpty()) throw new EmptyStorageException("O armazenamento esta vazio.");
    }


//    public UserModel findById(long id) {
//        for (UserModel model : models) {
//            if (model.getId() == id) {
//                return model;
//            }
//        }
//        return null;
//    }

}
