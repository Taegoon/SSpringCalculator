package Springbook.learningtest.template;

public interface LineCallback<T> {
	T doSomethingWithReader(String line, T value);
}
