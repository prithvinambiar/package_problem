package com.mycompany.package_problem.input;

import org.junit.Test;

public class FileInputProviderTest {
    @Test(expected= InputException.class)
    public void should_throw_input_exception_for_invalid_file() throws InputException {
        InputProvider fileInputProvider = new FileInputProvider("Z:\\invalid_file_path");
        fileInputProvider.GetInputs();
    }
}