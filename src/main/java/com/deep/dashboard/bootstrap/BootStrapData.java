package com.deep.dashboard.bootstrap;

import com.deep.dashboard.repositories.loginRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final loginRepository loginRepository;

    public BootStrapData(com.deep.dashboard.repositories.loginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
