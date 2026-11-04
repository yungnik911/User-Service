package com.example.User;

public class UserService {
    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserService(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public boolean register(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            return false;
        }

        userRepository.save(user);
        return true;
    }

    public boolean registerUser(String email, String name) {
        if (userRepository.existsByEmail(email)) {
            return false;
        }
        User user = new User(email, name);
        userRepository.save(user);

        return emailService.sendWelcomeEmail(email, name);

    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}