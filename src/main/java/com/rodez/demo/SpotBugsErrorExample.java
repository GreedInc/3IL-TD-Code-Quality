package com.rodez.demo;

/**
 * SpotBugsErrorExample is a demonstration class created
 * specifically to raise a SpotBugs warning/error.
 * <p>
 * In this example, we intentionally provided a simple code that will trigger a spotbugs error.
 * </p>
 *
 * @author <your name>
 */
public class SpotBugsErrorExample {

    /**
     * Demonstrates a SpotBugs error that must be fixed by students
     */
    public void demonstrateError() {
        String original = "Hello World";
        original.replace("World", "SpotBugs");
    }

    /**
     * Main entry point for running this demonstration.
     * It will simply invoke {@link #demonstrateError()}.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        SpotBugsErrorExample example = new SpotBugsErrorExample();
        example.demonstrateError();
    }
}