module project_java.project_java {
    requires javafx.controls;
    requires javafx.fxml;

    opens project_java.project_java to javafx.fxml;
    exports project_java.project_java;
}
