package ru.easyjava.junit;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class LocaleWatcherRule extends TestWatcher {
    @Override
    protected void starting(Description description) {
        System.out.println("TestWatcher: Starting: " + description.getDisplayName() + " with language " + System.getProperty("user.language"));
    }
}
