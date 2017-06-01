package com.mycompany.package_problem.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileInputProvider implements InputProvider {

    private final String inputFileName;

    FileInputProvider(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    public List<String> GetInputs() throws InputException {
        try {
            return Files.readAllLines(Paths.get(inputFileName));
        } catch (IOException e) {
            throw new InputException(e.getMessage());
        }
    }
}


