package dgroomes;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * See the README for more information.
 */
public class App {

    public static void main(String[] args) {
        // Remember, Swing is not thread-safe. We must run the UI code on the Swing Event Dispatch Thread (EDT).
        SwingUtilities.invokeLater(() -> new App().run());
    }

    private void run() {
        var frame = new JFrame("Java Class Search");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Text input field.
        var classNameField = new JTextField();
        classNameField.setToolTipText("Enter a fully qualified class name here");

        // Label to display search results. (why is it called a label? We're not using it specifically as a label for something else.)
        var resultLabel = new JLabel("");

        // Button to trigger search.
        var searchButton = new JButton("Search");
        searchButton.addActionListener(e -> {
            // Get class name from the text field.
            String className = classNameField.getText();

            Class<?> clazz;
            try {
                // Search for the class using reflection.
                clazz = Class.forName(className);
            } catch (ClassNotFoundException classNotFoundException) {
                resultLabel.setText("Class not found");
                return;
            }

            // Collect the names of public methods, eliminating duplicates, and formatting into a comma-separated list.
            var methodNames = Arrays.stream(clazz.getMethods())
                    .map(Method::getName)
                    .distinct()
                    .sorted()
                    .collect(Collectors.joining(", "));

            resultLabel.setText(methodNames);
        });

        // Assemble the UI components. This can become tricky with a large UI. It's easy to get turned around.
        frame.add(classNameField, BorderLayout.NORTH);
        frame.add(searchButton, BorderLayout.CENTER);
        frame.add(resultLabel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
