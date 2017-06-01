package com.mycompany.package_problem.Input;

import java.util.List;

public interface InputProvider {
    List<String> GetInputs() throws InputException;
}
