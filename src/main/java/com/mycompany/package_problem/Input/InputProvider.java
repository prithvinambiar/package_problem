package com.mycompany.package_problem.input;

import java.util.List;

public interface InputProvider {
    List<String> GetInputs() throws InputException;
}
