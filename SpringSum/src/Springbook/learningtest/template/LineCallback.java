package Springbook.learningtest.template;

import java.io.IOException;

public interface LineCallback {
	Integer doSomethingWithReader(String line, Integer value) throws IOException;
}