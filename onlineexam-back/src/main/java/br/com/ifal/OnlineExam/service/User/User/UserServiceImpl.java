package br.com.ifal.OnlineExam.service.User.User;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifal.OnlineExam.model.User.User;
import br.com.ifal.OnlineExam.repositery.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    public List<User> user = new ArrayList<User>();

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllStudents() {
        return userRepository.findAll();
    }

    @Override
    public User SalvarUsuario(User user) {
        return userRepository.save(user);
    }

    @Override
    public String DeletarAluno(User user) {
        userRepository.delete(user);
        return "Aluno Excluido com sucesso";
    }

    @Override
    public boolean VerificarEmail(String email) {
        Optional<User> usuario = userRepository.findByEmail(email);
        return usuario.isPresent();
    }

    @Override
    public Optional<User> VerificarLogin(String email, String senha) {
        Optional<User> usuario = userRepository.findByEmail(email);
        if (usuario.get().getSenha().equals(senha)) {
            return usuario;
        } else {
            return null;
        }
    }

}