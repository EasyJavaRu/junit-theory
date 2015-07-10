package ru.easyjava.junit;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class LocaleRule implements TestRule {
    @Override
    public final Statement apply(
            final Statement statement,
            final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("Starting: " + description.getDisplayName() + " with language " + System.getProperty("user.language"));
                statement.evaluate();
            }
        };
    }
}
